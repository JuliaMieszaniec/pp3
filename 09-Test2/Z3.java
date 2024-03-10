public class Z3 {
    Person [] person;

    Z3(Person[] person){
        this.person= person;
    }

    public int adults(){
        int count=0;
        for(Person person :person){
            if(person.getAge()>=18){
                count++;
            }
        }
        return count;
    }
}
