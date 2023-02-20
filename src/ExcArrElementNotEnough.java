public class ExcArrElementNotEnough extends Exception implements IConst {
    public String toString(){
        return "The number of elements in the array is less than " + Integer.toString(MIN_ARRAY_SIZE);
    }
}
