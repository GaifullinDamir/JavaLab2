

public class Processor implements IFunc, IConst{


    @Override
    public int[] GetSumEvenOddNumbers(String args[]) {
        int sumOddNumbers = 0; //переменная-счетчик для нечетных чисел
        int sumEvenNumbers = 0; //переменная-счетчик для нечетных чисел

        for(String strNum : args){
            var intNum = Integer.parseInt(strNum);
            if ( intNum % 2 == 0) {
                sumEvenNumbers += intNum;
            } else {
                sumOddNumbers += intNum;
            }
        }

        return (sumOddNumbers, sumEvenNumbers)
    }

    public int StrToInt(String strNum){
        String l_strNum = strNum;
        int intNum = Integer.parseInt(l_strNum);
        return intNum;
    }

    public void CheckNum(int intNum) throws ExcMoreThanSomeNum{
        if(intNum > checkedValue){
            throw new ExcMoreThanSomeNum();
        }
    }
}