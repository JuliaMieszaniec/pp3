public class P6 {
    private String name;
    private float grade;
    private boolean passed;

    public void setName(String name){
        this.name=name;
    }
    public void setGrade(float grade){
        if(grade==2 || grade==3 || grade==4 ||grade==5){
            this.grade=grade;
        }
    }
    public void setPassed(boolean passed){
        this.passed=passed;
    }
    public String getName(){
        String newname= "";
        String nname="";
        for(int i=0; i< name.length(); i++){
            if(i==0){
                newname += name.charAt(i);
                nname+= newname.toUpperCase();
                newname="";
            }else{
                newname += name.charAt(i);
                nname+= newname.toLowerCase();
                newname="";
            }
        }
        return nname;
    }
    public float getGrade(){
        return grade;
    }
    public boolean getPassed(){
        return passed;
    }

    public static void main(String[] args) {
        P6 s= new P6();
        s.setName("broWN");
        System.out.println(s.getName());
        s.setGrade(4);
        System.out.println(s.getGrade());
        s.setGrade(6);
        System.out.println(s.getGrade());
    }


}
