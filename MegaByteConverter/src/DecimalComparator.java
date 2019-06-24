public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo) {
        int myNumOne = (int) (numberOne * 1000);
        int myNumTwo = (int) (numberTwo * 1000);

        if (myNumOne == myNumTwo){
            return true;
        } else return false;


    }
}
