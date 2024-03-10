import java.util.Arrays;

public class A4 {
    int[] arr;

    A4(int[] arr){
        this.arr=arr;
    }

    int m(){
        Arrays.sort(arr);
        //arr[0]=0;
        //int x= arr.length;
        //arr[x]=0;
        //int count=0;
        //for(int a : arr){
        //    count+=a;
        //}
        //return count;
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] mc={4,5,3,3,5,2,2,4};
        A4 z = new A4(mc);

        System.out.println(z.m());
    }
}
