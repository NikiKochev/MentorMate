package builder;

public class BuilderDemo {

    private static BuilderDemo builderDemo = new BuilderDemo();

    private int intCharacteristic;
    private double doubleCharacteristic;
    private boolean booleanCharacteristic;
    private String stringCharacteristic;
    private Object objectCharacteristic;


    private BuilderDemo(){}

    public static BuilderDemo builder(){
        return builderDemo;
    }

    public BuilderDemo doubleCharacteristic(double doubleCharacteristic){
        this.doubleCharacteristic = doubleCharacteristic;
        return this;
    }

    public BuilderDemo intCharacteristic(int intCharacteristic){
        this.intCharacteristic = intCharacteristic;
        return this;
    }

    public BuilderDemo booleanCharacteristic(boolean booleanCharacteristic){
        this.booleanCharacteristic = booleanCharacteristic;
        return this;
    }

    public BuilderDemo stringCharacteristic(String stringCharacteristic){
        this.stringCharacteristic = stringCharacteristic;
        return this;
    }

    public BuilderDemo objectCharacteristic(Object objectCharacteristic){
        this.objectCharacteristic = objectCharacteristic;
        return this;
    }
}
