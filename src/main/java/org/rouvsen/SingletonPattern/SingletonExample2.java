package org.rouvsen.SingletonPattern;

public final class SingletonExample2 {

    private static SingletonExample2 INSTANCE = null;

    private SingletonExample2() {}

    public static SingletonExample2 getInstance() {
        if (INSTANCE == null)
            synchronized (INSTANCE) {
                if (INSTANCE == null)
                    INSTANCE = new SingletonExample2();
            }
        return INSTANCE;
    }
}
