public class Smartphone {
    int yearOfProduction;
    String color;
    double rozdzielczosc;
    boolean nowy;

    void CzyNowy(){
        nowy = !nowy;
    }
    
    void Dane(){
        System.out.println( color + rozdzielczosc + yearOfProduction);
    }

}
