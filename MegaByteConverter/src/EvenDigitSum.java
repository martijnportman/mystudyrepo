public class EvenDigitSum {


        public static int getEvenDigitSum(int number) {
            int remainder;
            int totalEven = 0;

            if (number < 0) {
                return  -1;
            } else  {
                do  {
                    remainder = number % 10;
                    number = number / 10; //if number < 0 while loop will not continue.
                    if (remainder % 2 == 0){
                        totalEven += remainder;
                    }
                } while (number > 0);
                return totalEven;
            }
        }
    }


