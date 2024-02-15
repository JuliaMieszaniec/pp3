public class P5 {
    static String m(String t){
        String tnew="";
        for(int i=0; i<t.length(); i++){
            if(i%2!=0 && i!=(t.length()-1) ){
                tnew+=t.charAt(i)+"+";
            }else if(i%2!=0 && i==(t.length()-1)){
                tnew+=t.charAt(i);
            }else{
                tnew+=t.charAt(i);
            }
        }
        return tnew;
    }

    public static void main(String[] args) {
        System.out.println(m("computer"));
        System.out.println(m("water"));
        System.out.println(m("ok"));
        System.out.println(m("f"));
    }
}
