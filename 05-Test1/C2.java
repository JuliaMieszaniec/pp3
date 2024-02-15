public class C2 {
    int counter=0;

    void increase(){
        counter++;
    }
    void decrease(){
        counter--;
    }
    void increase(int n){
        counter+=n;
    }
    void decrease(int n){
        counter-=n;
    }
    int value(){
        return counter;
    }

    public static void main(String[] args){
        C2 o= new C2();
        o.value();
        o.increase();
        o.increase();
        o.decrease();
        o.increase(5);
        o.decrease(2);
        o.value(); 
    }
}
