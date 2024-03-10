public class Z1 {
    int[] numbers;

    public Z1(int one, int two, int three, int four, int five){
        this.numbers= new int[]{one, two, three, four, five};
   }
    Boolean different(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(numbers[i]==numbers[j] && i!= j){
                    return false;
                }
            }
        }
        return true;
   } 
}
