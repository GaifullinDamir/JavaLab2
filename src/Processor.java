

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
            return new int[] {0, 0};

        }

        return new int[] {sumOddNumbers, sumEvenNumbers};
    }

    public void CheckNum(int intNum) throws ExcMoreThanSomeNum{
        if(intNum > CHECKED_VALUE){
            throw new ExcMoreThanSomeNum();
        }
    }

    public void CheckArrSize(String[] args) throws ExcArrElementNotEnough{
        if(args == null){
            throw new NullPointerException();
        }
        if(args.length < MIN_ARRAY_SIZE){
            throw new ExcArrElementNotEnough();
        }
    }

    public void CheckCurrSymb(String[] arrayToCheck) throws ExcMissingNumZero{
        if(arrayToCheck == null){
            throw new NullPointerException();
        }

        boolean isSucces = false;
        for (String number : arrayToCheck)
        {
            if (number.contains(REQ_SYMB))
            {
                isSucces = true; break;
            }
        }
        if (!isSucces)
        {
            throw new ExcMissingNumZero();
        }
    }

    public void PrintOddAndEvenNums(int[] oddAndEvenArr){
        System.out.println("Сумма нечетных чисел: " + oddAndEvenArr[0] + "\n" +
                "Сумма четных чисел: " + oddAndEvenArr[1]);
    }

}