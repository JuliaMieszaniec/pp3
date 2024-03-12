public class D2 {
    int id;

    D2(int id){
        this.id=id;
    }
    boolean ok(){
        String idd= Integer.toString(id);
        if(idd.length()==4){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return String.format("%04d", id);
    }

    public static void main(String[] args) {
        D2 example= new D2(23);
        D2 example1= new D2(6789);
        D2 example3= new D2(0666);
        System.out.println(example.ok());
        System.out.println(example1.ok());
        System.out.println(example3.ok());
        System.out.println(example.toString());
        System.out.println(example1.toString());
        System.out.println(example3.toString());
    }
}
