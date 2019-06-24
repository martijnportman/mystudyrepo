public class MegaByteConverter {

    public static void main(String[] args) {
        boolean response;
        //printMegaByteAndKiloByteConverter(2500);
        //response = BarkingDog.shouldWakeUp(true, -1);
        //response = LeapYear.isLeapYear(1924);
        System.out.println(SecondsandMinutes.getDurationString (65,49));
        System.out.println(SecondsandMinutes.getDurationString (3945L));
    }

    public static void printMegaByteAndKiloByteConverter (int kiloBytes){

        int remainder;
        int megaBytes;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            remainder = calculateRemainder(kiloBytes);
            megaBytes = calculateMegaBytes(kiloBytes);
            System.out.println (kiloBytes + " KB = " + megaBytes +  " MB and " + remainder + " KB");
        }
    }



    public static int calculateRemainder (int kiloBytes){
        return kiloBytes % 1024;
    }

    public static int calculateMegaBytes (int kiloBytes){
        return kiloBytes / 1024;
    }

}

