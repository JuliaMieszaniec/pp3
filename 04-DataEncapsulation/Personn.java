public class Personn {
    private String name;
    private int age;

    Personn(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age= age;
    }
    public boolean isAdult(){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args){
        Personn p = new Personn("Anna",21);
        System.out.println(p.getAge());
        System.out.println(p.isAdult());
        p.setAge(17);
        System.out.println(p.isAdult());
        System.out.println(p.toString());

    }
}

