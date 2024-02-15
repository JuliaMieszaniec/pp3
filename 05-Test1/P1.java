public class P1 {
    static int even(int[] array){
        int sum=0;
        for(int i=0; i<array.length; i++ ){
            if(array[i]%2==0){
                sum++;
            }
        }
        return sum;
    }

    static int[] reverse(int[] array){
        int[] reversed= new int[array.length];
        for(int i=0; i<array.length; i++){
            reversed[i]=array[array.length-1-i];
        }
        return array;
    }
}
