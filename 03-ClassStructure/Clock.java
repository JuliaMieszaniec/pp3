public class Clock {
    int hour;
    int minutes;

    Clock(){
        this.hour=00;
        this.minutes=00;
    }
    public Clock(int hour, int minutes){
        if(hour>=0 && hour<23 && minutes> 0 && minutes<59){
            this.hour=hour;
            this.minutes=minutes;
        }else{
            System.out.println("Takie godz nie istnieja, ustawiam 0:00");
            this.hour = 0;
            this.minutes = 0;
        }
    }

    void setClock(int hour,int minutes){
        this.hour=hour;
        this.minutes=minutes;
    }
    void setClock(){
        hour=00;
        minutes=00;
    }
    void displayTime(){
        System.out.printf("%02d:%02d\n", hour, minutes);
    }
    void addOneMinute(){
        if(minutes==59 && hour!=23){
            hour++;
            minutes=0;
        
        }else if(minutes==59 && hour==23){
            hour=0;
            minutes=0;
        }else{
            minutes++;
        }
    }
    public static void main(String[] args) {
        Clock c1 = new Clock(12, 47);
        c1.displayTime();
        c1.setClock(18,14);
        c1.displayTime();
        c1.setClock(9,3);
        c1.displayTime();

        c1.setClock(23,58);
        c1.displayTime();
        
        c1.addOneMinute();
        c1.displayTime();

        c1.addOneMinute();
        c1.displayTime();
    }
}
