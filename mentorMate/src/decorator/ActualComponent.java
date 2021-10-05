package decorator;

public class ActualComponent extends Component {
    @Override
    int calculate() {
        return 1;
    }

    @Override
    void print() {
        System.out.print("actual component");
    }
}
