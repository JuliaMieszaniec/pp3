import java.util.ArrayList;

public class Z4 {
    private ArrayList<Product> shopList= new ArrayList<Product>();

    public void add(Product product){
        shopList.add(product);
    }

    public String toString() {
        String res="";
        for(Product product: shopList){
            res= res+product.getName()+",";
        }
        res=res.substring(0, res.length()-1);
        return res;
    }

    public int total(){
        int c=0;
        for(Product product: shopList){
            c+= product.getQuantity();
        }
        return c;
    }


}
