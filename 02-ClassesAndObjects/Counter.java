public class Counter {
    int counter = 0;

    void AddOne(){
        counter+=1;
        System.out.println("Counter = "+ counter);
    }
        void MinusOne(){
        counter-=1;
        System.out.println("Counter = "+ counter);
    }
        void Addten(){
        counter+=10;
        System.out.println("Counter = "+ counter);
    }
        void Minusten(){
        counter-=10;
        System.out.println("Counter = "+ counter);
    }
        void Reset(){
        counter = 0 ;
        System.out.println("Counter = "+ counter);
    }

    public static void main(String[] args){
        Counter c = new Counter();
        c.AddOne();
        c.Addten();
        c.Addten();
        c.AddOne();
        c.AddOne();
        c.Reset();
    }
}
