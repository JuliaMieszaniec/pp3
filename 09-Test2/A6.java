import java.util.ArrayList;

public class A6 {
    ArrayList<Person> family;

    void m1(Person p){
        family.add(p);
    }

    int m2(){
        int count=0;
        for(Person f: family){
            if(f.getAge()>=18){
                count++;
            }
        }
        return count;
    }
}
