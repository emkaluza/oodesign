package objectpool;

class ConnectionPool extends ObjectPool<Connection> {

    private static int ID = 0;

    public ConnectionPool(final long expireTime, final int poolSize) {
        super(expireTime, poolSize);
    }

    @Override
    protected Connection create() {
        System.out.println("Creating new instnace:\t#"+(++ID));
        return new ConnectionImpl(ID+"");
    }

    @Override
    protected void expire(Connection object) {
        System.out.println("Instance #"+object.getId()+" expired");
    }

    public Connection getConnection() throws Exception {
        return super.getObject();
    }

    public void releaseConnection(final Connection c) {
        super.returnObject(c);
    }
}
