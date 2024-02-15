public class P2 {
    int id;

    P2(int id){
        this.id=id;
    }
    boolean ok(){
        String z= Integer.toString(id);
        if(z.length()==4){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        String z= Integer.toString(id);
        if(z.length()==1){
            return "000" + z;
        }else if(z.length()==2){
            return "00" + z;
        }else if(z.length()==3){
            return "0"+z;
        }else{
            return z;
        }
    }
}
