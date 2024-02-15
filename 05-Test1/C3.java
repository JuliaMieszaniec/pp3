public class C3 {
    static boolean isAlphabet(String t){
        t.toLowerCase();

        for(int i=0; i<t.length()-1; i++){
            char b=t.charAt(i);
            char c= t.charAt(i+1);
            if(b>c){
                return false;
            }
        }
        return true;

    }

    static String hideText(String t){
        int nun= t.length();
        String first=t.substring(0, 1);
        String last= t.substring(nun-1);
        String rest="*".repeat(nun-2);
        String copy=first+rest+last;
        return copy;
    }
}
