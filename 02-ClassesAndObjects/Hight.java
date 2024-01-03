public class Hight {
    public static void main(String[] args){
        int wzrost=170;
        int feet= (int)((float)wzrost / 30.48F);
        int inches= (int)((170.0F - (float)feet * 30.48F) / 2.5F);

        System.out.println("I am "+wzrost+ "cm tall, ie "+feet+" feet and "+inches+" inches");
    }
}
