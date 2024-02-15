public class Counterrr {
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
    void value(){
        System.out.println(counter);
    }

    public static void main(String[] args){
        Counterrr x= new Counterrr();
        x.value();
        x.increase();
        x.increase();
        x.decrease();
        x.increase(5);
        x.decrease(2);
        x.value();
    }
}
