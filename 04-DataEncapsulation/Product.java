public class Product {
    private String name;
    private boolean vegetarian;

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name= name;
    }

    public boolean getVegetarian(){
        return vegetarian;
    }
    public void setVegetarian(boolean vegetarian){
        this.vegetarian= vegetarian;
    }

    public static void main(String[] args) {
        Product p1= new Product();
        p1.setName("Mleko");
        p1.setVegetarian(false);
        Product p2= new Product();
        p2.setName("ziemniaki");
        p2.setVegetarian(true);
        System.out.println(p1.getName()+" "+p1.getVegetarian());
        System.out.println(p2.getName()+" "+p2.getVegetarian());
    }

}
