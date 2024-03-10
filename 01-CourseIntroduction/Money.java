public class Money {
    public String name;
    public double netPrice;
    public double vatRate;
    public List<Item> items;

    public Money(String name, double netPrice, double vatRate){
        this.name= name;
        this.netPrice= netPrice;
        this.vatRate= vatRate;
    }

    

    public void addItem(Item item) {
        items.add(item);
    }
    
    double nettOValue(){
        double totalNet = 0;
        for (Item item : items) {
            totalNet += item.getNetPrice();
        }
        return totalNet;
    }

    int sumVat(){

    }

    String druk(){

    }
}
