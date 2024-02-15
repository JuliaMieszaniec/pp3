public class H5 {
    static String m(String t){
        String newt="";
        for(int i=0; i<t.length(); i++){
            if(i%2==0 && i!=(t.length()-1)){
                newt+= t.charAt(i) + "+";
            }else if(i%2!=0 && i!=(t.length()-1)){
                newt+= t.charAt(i) + "-";
            }else{
                newt+= t.charAt(i);
            }
        }
        return newt;
    }

    public static void main(String[] args) {
        System.out.println(m("computer"));
        System.out.println(m("water"));
        System.out.println(m("ok"));
        System.out.println(m("f"));
    }

}
