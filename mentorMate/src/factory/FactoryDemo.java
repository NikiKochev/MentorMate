package factory;

public abstract class FactoryDemo {

    enum Type {
        TYPE1, TYPE2, TYPE3
    }

    private Type type;

    protected FactoryDemo(Type type){
        this.type = type;
    }

    public static FactoryDemo createFactoryDemo(Type type){
        switch (type){
            case TYPE1 -> {
                return new Type1();
            }
            case TYPE2 -> {
                return new Type2();
            }
            default -> {
                return  new Type3();
            }

        }
    }
}
