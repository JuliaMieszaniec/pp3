public class A5 {
    String [] lista;

    A5(String[] lista){
        this.lista=lista;
    }

    boolean m(){
        for(int i=0; i<(lista.length); i++){
            for(int j=i+1; j<lista.length;j++){
                if(lista[i]== lista[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] w1= {"uni", "sry", "flu", "hlu"};
        String[] w2= {"uni","hlu", "sry", "flu", "hlu"};
        String[] w3= {"uni", "sry","sry", "flu", "hlu"};

        A5 sss= new A5(w1);
        A5 ss= new A5(w2);
        A5 s= new A5(w3);
        System.out.println(sss.m());
        System.out.println(ss.m());
        System.out.println(s.m());
    }
}
