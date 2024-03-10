import java.util.*;

public class ShoppingList {
    private ArrayList<String> shoppingList = new ArrayList<String>();

    public void displayList(){
        for (String i:shoppingList){
            System.out.println(i);
        }
    }

    public void displayNumberOfProducts(){
        System.out.println(shoppingList.size());
    }

    public void addingProducts(String product){
        shoppingList.add(product);
    }

    public void addingProductsFromKeyboard(){
        final Scanner in = new Scanner(System.in);
        System.out.println("Enter a product:");
        String product = in.nextLine();
        shoppingList.add(product);
    }
    ////!!!!!!!!!!!!!!!!!
    
}