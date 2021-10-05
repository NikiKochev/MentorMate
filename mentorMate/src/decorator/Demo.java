package decorator;

public class Demo {

    public static void main(String[] args) {
        Component component1 = new Decorator(new ActualComponentTwo());
        Component component = new Decorator(component1);
        component.print();
        System.out.println();
        System.out.println(component.calculate());
    }


}
