public class Z6 extends Vehicle{
    
    int maxSpeed;

    Z6(int s, int maxSpeed){
        super(s);
        this.maxSpeed=maxSpeed;
    }

    int[] spec(){
        int[] sp= {0,0};
        sp[0]= getSeats();
        sp[1]= maxSpeed;
        return sp;
    }
}
