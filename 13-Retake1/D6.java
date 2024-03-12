public class D6 extends V {
    int speed;
    D6(int seats, int speed){
        super(seats);
        this.speed=speed;
    }

    int[] m1(){
        int[] arr= {getSeats(), speed};
        return arr;
    }
}
