public class Z5 extends Counter{
    
    Z5(int c){
        super(c);
    }
    void addN(int n){
        for(int i=0; i<n; i++){
            super.add1();
        }
    }
}
