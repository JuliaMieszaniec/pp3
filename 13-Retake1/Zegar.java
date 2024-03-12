public class Zegar {
    int hour;
    int minute;

    Zegar(int hour, int minute){
        if(hour>=0 && hour <=23){
            this.hour= hour;
        }
        if(minute>=0 && minute <=59){
            this.minute= minute;
        }
    }
    void setHour(int n){
        hour= n;
    }
    void setMinute(int n){
        minute= n;
    }
    void add(){
        if(hour==23 && minute==59){
            hour=0;
            minute=0;
        }else if(hour!=23 && minute==59){
            hour++;
            minute=0;
        }else{
            minute++;
        }
    }
    String display(){
        return String.format("%02d:%02d", hour, minute);
    }

    public static void main(String[] args) {
        Zegar z= new Zegar(4, 5);
        System.out.println(z.display());
    }
}
