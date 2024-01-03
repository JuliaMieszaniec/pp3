public class Euro {
    public Euro(){
        
    }
    public static void main(String[] args){
        double kupione= 4.5940;
        double sprzedane= 4.6250;
        double x = kupione - sprzedane;
        System.out.println("Bank buys EUR: "+ kupione);
        System.out.println("Bank sells EUR: "+ sprzedane);
        System.out.println("Spread: "+ x);
    }
}
