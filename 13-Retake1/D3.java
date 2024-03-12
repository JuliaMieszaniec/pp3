public class D3 {
    private String name;
    private float grade;
    private boolean passed;

    public void setName(String name){
        this.name=name;
    }
    public void setGrade(float grade){
        this.grade=grade;
    }
    public void setPassed(boolean passed){
        this.passed=passed;
    }
    public String getName(){
        String fname="";
        String rname= "";
        for(int i=0; i<name.length(); i++){
            if(i==0){
                fname+= name.charAt(i);
            }else{
                rname+=name.charAt(i);
            }
        }
        return fname.toUpperCase() + rname.toLowerCase();
    }
    public float getGrade(){
        return grade;
    }
    public boolean getPassed(){
        return passed;
    }
    public static void main(String[] args) {
        D3 s= new D3();
        s.setName("broWN");
        System.out.println(s.getName());
    }
}
