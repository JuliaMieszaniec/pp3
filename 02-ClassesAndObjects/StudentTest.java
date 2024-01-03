public class StudentTest {
    public static void main(String[] args){
        Student s = new Student();
        s.name= "Peter";
        s.age = 21;
        s.grade=3;
        s.semester=5;
        System.out.println(s.name + " " + s.age);
        s.displayAge();
        s.displayStudentData();

        Student k = new Student();
        k.name= "Anna";
        k.age= 23;
        k.grade= 5;
        k.semester= 2;
        k.vaild=true;
        k.displayStudentData();
        k.displayStudentData2();
    }
}
