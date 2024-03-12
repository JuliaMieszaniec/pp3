import java.util.ArrayList;

public class D5 {
    ArrayList<P> family;

    void m1(P p){
        family.add(p);
    }
    int m2(){
        int count=0;
        for(P f: family){
            if(f.getAge()>=18){
                count++;
            }
        }
        return count;
    }


}
