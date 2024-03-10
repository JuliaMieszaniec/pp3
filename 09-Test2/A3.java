public class A3 {
    String name;

    A3(String name){
        this.name= name;
    }
    String m1(){
        
        int dot= name.indexOf(".");

        return name.substring(0, dot);

    }
    String m2(){
        int l= name.length();
        int dot= name.indexOf(".");
        return name.substring(dot, l);
    }

    public static void main(String[] args) {
        A3 p =new A3("panda.org");
        System.out.println(p.m1());
        System.out.println(p.m2());

    }
}
