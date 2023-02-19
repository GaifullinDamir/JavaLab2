

public class Processor implements IFunc, IConst{

    @Override
    public int[] GetSumEvenOddNumbers(String args[]) {
        int sumOddNumbers = 0; //переменная-счетчик для нечетных чисел
        int sumEvenNumbers = 0; //переменная-счетчик для нечетных чисел
        try{
            for(String strNum : args){
                var intNum = Integer.parseInt(strNum);
                CheckNum(intNum);
                if ( intNum % 2 == 0) {
                    sumEvenNumbers += intNum;
                } else {
                    sumOddNumbers += intNum;
                }
            }
        } catch (ExcMoreThanSomeNum exc) {
            System.out.println(exc);
        }

        return new int[] {sumOddNumbers, sumEvenNumbers};
    }

    public void CheckNum(int intNum) throws ExcMoreThanSomeNum{
        if(intNum > checkedValue){
            throw new ExcMoreThanSomeNum();
        }
    }
}