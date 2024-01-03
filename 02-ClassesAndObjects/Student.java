public class Student {
    String name;
    int age;
    int idCard;
    boolean vaild;
    int semester;
    float grade;

void sayHello(){
    System.out.println("Hello from"+ name);
}

void displayName(){
    System.out.println(name);
}

void displayAge(){
    System.out.println(age);
}

void displaySemester(){
    System.out.println(semester);
}

void displayGrade(){
    System.out.println(grade);
}
void displayStatus(){
    System.out.println(vaild);
}

void displayStudentData() {
    System.out.println("Student name: "+name+", Student semester:"+semester+", Student average grade: "+grade);
}

void changeStatusIdCard() {
    vaild = !vaild;
}

void displayStudentData2() {
    System.out.println("Student name: "+name+", Student ID card: "+ vaild+", ");
}
}

