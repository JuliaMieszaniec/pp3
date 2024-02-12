import java.util.Arrays;

public class MyArray {
    static int even(int[] array){
        int sum = 0;
        for (int i =0; i< array.length; i++){
            if(array[i]%2== 0){
                sum++;
            }
        }
        return sum;
    }
    static int possiticeOdd(int[] array){
        int sum=0;
        for (int i =0; i< array.length; i++){
            if(array[i]%2!= 0 && array[i]>0){
                sum++;
            }
        } 
        return sum;
    }
    static int[] reverse(int[] array){
        int liczba= array.length;
        int[] reversed = new int[liczba];

        for(int i = 0; i < liczba; i++){
            reversed[i] = array[liczba - 1 - i];
        }    
        return array ;
    }
    static String comapre(int[] arr1, int[] arr2){
        int l1= arr1.length;
        int l2= arr2.length;
        if(l1==l2){
            for(int i=0; i<l1; i++){
                if(arr1[i]==arr2[i]){
                    continue;
                }else{
                    return "false";
                }
            }
            return "true";
        }else{
            return "false";
        }
    }
    static int[] differant(int[] arr1, int[] arr2){
        int l1= arr1.length;
        int l2= arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] differentElements = new int[Math.max(l1,l2)];
        int count = 0;
        int i = 0; 
        int j = 0;

        while (i < l1 && j < l2) {
            if (arr1[i] < arr2[j]) {
                differentElements[count] = arr1[i];
                count++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        while (i < l1) {
            differentElements[count] = arr1[i];
            count++;
            i++;
        }

        //Ususwanie zer
        differentElements = Arrays.copyOf(differentElements, count);

        return differentElements;
    }
    static String exist(int num, int [] arr){
        for(int i=0; i<arr.length;i++ ){
            if(arr[i]==num){
                return "true";
            }else{
                continue;
            }
        }
        return "false";
    }
    static int secondMax(int[] array){
        int first= array[0];
        int second=array[1];
        for(int i=0; i<array.length; i++){
            if(array[i]>first){
                second=first;
                first=array[i];
            }if (array[i]<first && array[i] >= second){
                second=array[i];
            }
        }
        return second;
    }
    static int lastColumn(int[][] array){
        int sum= 0;
        int rows= array.length;
        for( int i : array[rows-1]){
            sum += i;
        }
        return sum;
    }
    static int[][] swap(int[][] array){
        int rows = array.length;
        int[][] swapped = array;
        int[] first = array[0];
        int[] last = array[rows-1];

        swapped[0] = last;
        swapped[rows-1] = first;

        return swapped;
    }
    static int[] two2one(int[][] array){
        int rows = array.length;
        int totlen = 0; //totallenght

        for (int r = 0; r < rows; r++) {
            totlen += array[r].length;
        }
        int[] connected = new int[totlen]; 
        int i = 0;
        for(int r = 0; r < rows;r++){
            for (int c = 0; c < array[r].length;c++){
                connected[i] = array[r][c];
                i++;
            }
        }
        return connected;
    }
    public static void main(String[] args) {
        int [] a= {-1,-2,8,7};
        //int [] b= {-1,-2,7,8};
        int [] c= {-1,-2};
        int [] d= {-1,-2,7,7};
        System.out.println(comapre(a,d));
        System.out.println(exist(7,a));
        System.out.println(exist(8,d));
        System.out.println(secondMax(c));
    }

}
