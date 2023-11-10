package org.rouvsen.SingletonPattern;

// with Holder class
public final class SingletonExample {

    private SingletonExample() {}

    private static final class InstanceHolder {
        private static final SingletonExample INSTANCE = new SingletonExample();
    }

    public SingletonExample getInstance() {
        return InstanceHolder.INSTANCE;
    }

}
