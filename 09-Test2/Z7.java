import java.util.ArrayList;

public class Z7 {
    String[] cities;

    Z7(String[] cities){
        this.cities=cities;
    }
    Z7 filter(char c){
        ArrayList<String> a1= new ArrayList<String>();
        for(String cities : cities){
            if(cities.startsWith(String.valueOf(c))){
                a1.add(cities);
            }
        }
        
        return new Z7(a1.toArray(new String[0]));

    }
    public String cities() {
        return String.join("", cities);
    }

    public static void main(String[] args) {

        String[] a1 = {"Slupsk","Warszawa","Sopot","Kielce","Szczecin","Krakow"};
        Z7 c1=new Z7(a1);
        
        System.out.println(c1.filter('S').cities());
    }

}
