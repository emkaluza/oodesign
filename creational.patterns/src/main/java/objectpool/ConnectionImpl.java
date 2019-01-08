package objectpool;

class ConnectionImpl implements Connection {

    private final String id;
    public ConnectionImpl(final String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void executeSomeAction() {
        System.out.println(id+":\tPerforming some long action on resources");
        try {
            Thread.sleep(1000);
            System.out.println(id+":\tAction #1 of 2 performed");
            Thread.sleep(4000);
            System.out.println(id+":\tAction #2 of 2 performed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
