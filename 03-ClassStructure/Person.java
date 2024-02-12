public class Person {
    String name;
    double weight;
    double height;
    double bmi;

    public Person(String name, double weight, double height){
        this.name= name;
        this.weight= weight;
        this.height= height;
    }

    public Person(String name){
        this.name= name;
    }

    void setWeightAndHeight(double weight, double height){
        this.weight= weight;
        this.height=height;
    }

    String calculateBMI(){
        double h= height/100;
        double bmi = weight/(h*h);
        System.out.println(bmi);
        this.bmi = bmi;
        return (bmi<18.5) ? "too low " : (bmi>24.9) ? "too high " : "good" ;
    }

    String displayRecord(){
        return String.format("name: %s weights: %.2f is tall for %.2f and the BMI is %.2f",name,weight,height,bmi);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Lilia", 57.00, 159.00);

        System.out.println(p1.calculateBMI());
        System.out.println(p1.displayRecord());
    }
}
