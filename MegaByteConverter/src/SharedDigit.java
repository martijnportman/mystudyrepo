public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        int remainderFirst;
        int remainderSecond;
        int orginalSecondNumber = secondNumber;
        boolean foundShared = false;

        if ((firstNumber <= 99 && firstNumber >= 10) && (secondNumber <= 99 && secondNumber >= 10)  ){

            do  {
                remainderFirst = firstNumber % 10;
                firstNumber = firstNumber / 10; //if number < 0 while loop will not continue.
                System.out.println(remainderFirst);

                do  {
                    remainderSecond = secondNumber % 10;
                    secondNumber = secondNumber / 10; //if number < 0 while loop will not continue.
                    if (remainderFirst == remainderSecond) {
                        foundShared = true;
                        break;
                    }

                } while (secondNumber > 0);
                //restore secondNumber to original value;
                secondNumber = orginalSecondNumber;
            } while (firstNumber > 0);
            return foundShared;
        } else{
            return false;
        }
    }
}