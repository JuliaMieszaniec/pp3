public class Alphabet {
    //static String[] alfabet={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","r","s","t","u","w","x","y","z"};

    static boolean isAplhabet(String t){
        t=t.toLowerCase();

        for(int i=1; i<t.length() ; i++){
            char b =t.charAt(i-1);
            char c = t.charAt(i);
            if(b > c){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        System.out.println(Alphabet.isAplhabet("abegsw"));
        System.out.println(Alphabet.isAplhabet("abcmhsw"));
    }
}
