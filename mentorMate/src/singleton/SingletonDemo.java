package singleton;

public class SingletonDemo {

    private static SingletonDemo instance;

    public static SingletonDemo getInstance(){
        if(instance ==null) {
        instance = new SingletonDemo();
        }
        return instance;
    }

    private SingletonDemo(){
    }
}
