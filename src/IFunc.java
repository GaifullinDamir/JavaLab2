public interface IFunc{
    public int[] GetSumEvenOddNumbers(String args[]);
    public void CheckNum(int intNum) throws ExcMoreThanSomeNum;
    public void CheckArrSize(String[] args) throws ExcArrElementNotEnough;
    public void CheckCurrSymb(String[] arrayToCheck) throws ExcMissingNumZero;
    public void PrintOddAndEvenNums(int[] oddAndEvenArr);
}