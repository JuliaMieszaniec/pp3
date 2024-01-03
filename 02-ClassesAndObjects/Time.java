public class Time {
    public Time(){

    }
    public static void main(String[] args){
        int hours = 14;
        int minutes = 27;
        int min = (23- hours)*60 + (60-minutes);
        int sec = min*60;
        System.out.println("hours = "+ hours);
        System.out.println("minutes = "+ minutes);
        System.out.println("time: "+ hours+":"+minutes);
        System.out.println("minutes from midnight: "+ min);
        System.out.println("seconds from midnight: "+ sec);
    }
}
