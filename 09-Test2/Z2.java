public class Z2 {
    int[] arr1;
    int[] arr2;
    static int count1;
    static int count2;

    static boolean arr(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length; i++ ){
            if(arr1[i]>=10 && arr1[i]<100){
                count1++;
            }
            if(arr2[i]>=10 && arr2[i]<100){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        arr(arr1,arr2);
         
    }
}
