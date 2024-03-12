import java.util.ArrayList;
import java.util.Arrays;

public class Inne {
    public static int diffx(int[] a1, int[] a2){
        ArrayList<Integer> arr= new ArrayList<>();
        for(int a: a2){
            arr.add(a);
        }
        int count=0;
        for(int i=0; i<a1.length; i++){
            if(!(arr.contains(a1[i]))){
                count++;
            }
        }
        return count;
    }
    public static int secbig(int[] arr){
        Arrays.sort(arr);
        int x= arr.length -2;
        return arr[x];
    }
    public static int sec(int[] arr){
        int first= arr[0];
        int second= arr[1];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            } 
            if(arr[i]>=second && arr[i]<first){
                second= arr[i];
            }
        }
        return second;
    }
    
    public static void main(String[] args) {
        int[] n1={22,33,44,55};
        int[] n2={44, 55, 66, 77, 88, 99};
        System.out.println(diffx(n1, n2));
    }
}
