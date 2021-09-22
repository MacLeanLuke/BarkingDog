public class BarkingDog {

    public static void shouldWakeUp(boolean barking, int hourOfDay){
        if(((hourOfDay > 0 && hourOfDay < 8) || hourOfDay == 23) && barking){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
