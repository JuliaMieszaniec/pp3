public class C4 {
    static int even(int[] array){
        int count=0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }
    static int positiveOdd(int[] array){
        int count=0;
        for(int i=0; i<array.length;i++){
            if(array[i]%2!=0 && array[i]>0){
                count++;
            }
        }
        return count;
    }
}
