package decorator;

public class Decorator extends Component{

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    int calculate() {
        return this.component.calculate()+1;
    }

    @Override
    void print() {
        component.print();
        System.out.print( " whit decorator");
    }
}
