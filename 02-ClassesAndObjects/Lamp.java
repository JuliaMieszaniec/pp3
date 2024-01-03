public class Lamp {
    boolean is_on;

    void SwitchOn(){
        if(is_on== false){
            is_on= true;
            System.out.println("Włączono lampe");
        }
        else{
            System.out.println("Lampa juz była włączona");
        }
    }
    void SwitchOff(){
        if(is_on== true){
            is_on= false;
            System.out.println("Wyłączono lampe");
        }
        else{
            System.out.println("Lampa juz była wyłączona");
        }
    }
    void Info(){
        System.out.println(is_on);
    }
    public static void main(String[] args){
        Lamp l = new Lamp();
        l.is_on=false;
        l.Info();
        l.SwitchOff();
        l.SwitchOn();
        l.Info();
    }
}
