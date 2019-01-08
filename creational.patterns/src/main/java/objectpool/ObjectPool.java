package objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

abstract class ObjectPool<T> {
    private long expirationTime;
    private Hashtable<T, Long> locked = new Hashtable<>(), unlocked = new Hashtable<>();
    private int objectLimit;

    protected ObjectPool(final long expirationTime, final int objectLimit) {
        this.expirationTime = expirationTime;
        this.objectLimit = objectLimit;
    }

    //returns object and locks it
    public synchronized T getObject() throws Exception {
        Enumeration<T> keys = unlocked.keys();
        while(keys.hasMoreElements()) {
            T t = keys.nextElement();
            if (System.currentTimeMillis() - unlocked.get(t).longValue() > expirationTime) {
                //object expired, free resource
                unlocked.remove(t);
                //maybye some expired() method on T to make sure everything correctly freed
                expire(t);
                t = null;
            } else {
                unlocked.remove(t);
                locked.put(t, System.currentTimeMillis());
                return t;
            }
        }

        //nothing found, try creating new object
        if (locked.size() + unlocked.size() < objectLimit) {
             T t = create();
            locked.put(t, System.currentTimeMillis());
            return t;
        }

        throw new Exception("Object limit reached");
    }

    //returns object to the pool
    public synchronized void returnObject(final T object) {
        locked.remove(object);
        unlocked.put(object, System.currentTimeMillis());
    }

    protected abstract T create();

    protected abstract void expire(final T boject);
}
