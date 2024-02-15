public class P4 {
    int hour;
    int min;

    P4(int hour, int min){
        if(hour>=0 && hour<=23 && min>=0 && min <=59){
            this.hour=hour;
            this.min=min;
        }

    }
    public  int getHour(){
        return hour;
    }
    public int getMinute(){
        return min;
    }
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int min){
        this.min=min;
    }
    void add(){
        if(min==59 && hour==23){
            min=0;
            hour=0;
        }else if(min==59 && hour<23){
            min=0;
            hour++;
        }else{
            min++;
        }
    }
    public static void main(String[] args) {
        P4 c= new P4(23,58);
        c.add();
        System.out.println(c.getHour());
        System.out.println(c.getMinute());
        c.add();
        c.add();
        System.out.println(c.getHour());
        System.out.println(c.getMinute());

    }
}

