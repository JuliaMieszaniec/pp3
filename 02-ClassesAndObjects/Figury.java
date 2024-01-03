public class Figury {
    int bok_1;
    int bok_2;


    void Dane(){
        System.out.println("Bok a ma miarę: "+ bok_1);
        System.out.println("Bok b ma miarę: "+ bok_2);
        System.out.println("Pole wynosi: " + bok_1*bok_2);
    }

    public static void main(String[] args){
        Figury f = new Figury();
        f.bok_1=4;
        f.bok_2=3;
        f.Dane();

    }
}
