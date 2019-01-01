package prototype;

import java.util.HashMap;
import java.util.Map;

class NPCStore {
    private Map<String, AbstractNPC> npcsCollection = new HashMap<>();

    public NPCStore(){
        npcsCollection.put("enemy", new EnemyNPC());
        npcsCollection.put("friendly", new FriendlyNPC());
    }

    public AbstractNPC createNPC(final String type) throws CloneNotSupportedException {
        return (AbstractNPC) npcsCollection.get(type).clone();
    }
}
