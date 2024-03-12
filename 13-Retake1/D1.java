import java.util.ArrayList;

public class D1 {
    static int even(int[] arr){
        int count=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }

    static int[] reverse(int[] arr){
        int[] reversed= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            reversed[i]= arr[arr.length-1-i];
        }
        return reversed;
    }

    static String m(String t){
        String nowe= "";
        for(int i =0; i<t.length(); i++){
            if(i%2!=0 && i!=(t.length()-1)){
                nowe= nowe + t.charAt(i) + "+";
            }else if( i==(t.length()-1)){
                nowe=nowe + t.charAt(i);
            }else{
                nowe=nowe + t.charAt(i);
            }
        }
        return nowe;
    }
    public static int different(int[] a1, int[] a2){
        int count=0;
        for(int i=0; i<a1.length; i++){
            for(int j=0; j<a2.length;j++){
                if(a1[i]!=a2[j]){
                    count++;
                }
            }
        }
        return count;
    }
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

    public static void main(String[] args) {
        int[] n1={22,33,44,55};
        int[] n2={44, 55, 66, 77, 88, 99};
        System.out.println(diffx(n1, n2));
    
    }

    
}
