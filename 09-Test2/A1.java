import java.util.Arrays;
import java.util.HashSet;

public class A1 {
    
    static int m1(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count=0;

        HashSet<Integer> set= new HashSet<>();
        for(int num : arr2){
            set.add(num);
        }
        for(int nu : arr1){
            if(!set.contains(nu)){
                count++;
            }
        }
        return count;
        

        

    }

    static int m2(int[] arr){
        int first= arr[0];
        int second= arr[1];
        for(int i=0; i<arr.length; i++){
            if(arr[i]> first){
                second= first;
                first=arr[i];
            }
            if(arr[i]>=second && arr[i]<first);
        }
        return second;
    }
}
