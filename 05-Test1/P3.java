public class P3 {
    int counter=0;

    void increase(){
        counter++;
    }
    void decrease(){
        counter--;
    }
    void increase(int n){
        if(n>0){
            counter+=n;
        }
    }
    void decrease(int n){
        if(n>0){
            counter-=n;
        }
    }
    int value(){
        return counter;
    }
    void cancel(){
        counter=0;
    }

    public static void main(String[] args){
        P3 c = new P3();
        c.value();
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.increase(-3);
        c.decrease(2);
        System.out.println(c.value());
        c.cancel();
        System.out.println(c.value());
    }
    
}
