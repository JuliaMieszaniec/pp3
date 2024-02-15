public class H2 {
    int hours;
    int minutes;

    H2(int hours, int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }
    int minutes(){
        int czas= hours*60 +minutes;
        return czas;
    }
    @Override
    public String toString(){
        return String.format("%02d:%02d", hours, minutes);
    }

    public static void main(String[] args) {
        H2 czas = new H2(2, 9);
        System.out.println(czas.toString());
        System.out.println(czas.minutes());

    }
}
