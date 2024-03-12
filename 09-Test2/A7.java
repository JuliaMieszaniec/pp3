public class A7 extends Vehicle {
    int speed;

    A7(int seats, int speed){
        super(seats);
        this.speed=speed;
    }
    int[] spec(){
        int[] specifcation= {getSeats(), speed};
        return specifcation;
    }


}
