package decorator;

public class ActualComponentTwo  extends Component{
    @Override
    int calculate() {
        return 50;
    }

    @Override
    void print() {
        System.out.print("Actual Component two");
    }
}
