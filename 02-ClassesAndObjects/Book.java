public class Book {
    public Book(){
    }
    String tytul;
    int rok;

    void Dane(){
        System.out.println(tytul);
        System.out.println(rok);
    }
    public static void main(String[] args){
    Book c= new Book();
    c.tytul= "Gra o tron";
    c.rok= 1785;
    c.Dane();
    }
}
