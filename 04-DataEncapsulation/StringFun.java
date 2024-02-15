public class StringFun {
    public String text;
    
    static int numberOfCharacters(String x){
        int num= x.length();
        return num;
    }

    static String firstNine(String x){
        String f=x.substring(0,9);
        return f;
    }

    static boolean ends(String x){
        if(x.endsWith("day!")){
            return true;
        }else{
            return false;
        }
    }

    void ifEmpty(){
        if(text.length()>0){
            System.out.println("text is not empty");
        }else{
            System.out.println("Text is empty");
        }
    }
    void lastIndex(){
        System.out.println(text.lastIndexOf('e'));
    }

    void replace(){
        System.out.println(text.replace(" ","-"));
    }

    void convertUpper(){
        System.out.println(text.toUpperCase());
    }



    public static void main(String[] args) {
        String x="Have a nice day!";
        System.out.println(numberOfCharacters(x));
        System.out.println(firstNine(x));
        System.out.println(ends(x));

        StringFun s = new StringFun();
        s.text="Have a nice day";
        s.ifEmpty();
        s.lastIndex();
        s.convertUpper();
        s.replace();

    }
}

