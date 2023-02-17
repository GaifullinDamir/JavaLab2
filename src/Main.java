interface IConst{
    static final int checkedValue = 500;
}

interface IFunc{
    public int[] GetSumEvenOddNumbers();
}

public class Processor implements IConst, IFunc{

}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}