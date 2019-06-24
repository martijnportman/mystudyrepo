public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        boolean alarm = false;
        if ((barking && (hourOfDay < 8)) || (barking && (hourOfDay > 22))){
            alarm = true;
        }

        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            //Illegal time check
            alarm = false;
        }
        return  alarm;
    }

}
