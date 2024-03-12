public class D4 {
    String[] nazwy;

    D4(String[] nazwy){
        this.nazwy=nazwy;
    }
    boolean m1(){
        for(int i=0; i<nazwy.length; i++){
            for(int j=i+1; j<nazwy.length; j++){
                if(nazwy[i]==nazwy[j+1]){
                    return true;
                }
            }
        }
        return false;
    }
}
