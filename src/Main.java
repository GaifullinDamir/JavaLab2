
public class Main {
    private final static Processor _processor = new Processor();
    public static void main(String[] args) {
        int[] resultArr;

        try{
            _processor.CheckArrSize(args);
            _processor.CheckCurrSymb(args);
            resultArr = _processor.GetSumEvenOddNumbers(args);
            _processor.PrintOddAndEvenNums(resultArr);
        } catch(ExcArrElementNotEnough e) {
            System.out.println(e);
        } catch(ExcMissingNumZero e) {
            System.out.println(e);
        } catch(Exception e) {
            System.out.println(e);
        }

    }
}