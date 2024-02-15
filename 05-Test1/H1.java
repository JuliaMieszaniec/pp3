import java.util.Arrays;
import java.util.HashSet;

public class H1 {
    static int different(int[] arr1, int[] arr2){
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

        return count;
    }
    static int decondMax(int[] array){
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
    static int diff(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        
        // Dodaj wszystkie elementy z array2 do HashSet
        for (int num : array2) {
            set.add(num);
        }

        int count = 0;
        
        // Sprawdź każdy element z array1
        for (int num : array1) {
            // Jeśli element z array1 nie znajduje się w HashSet (array2), zwiększ licznik
            if (!set.contains(num)) {
                count++;
            }
        }
        
        return count;
    }
}
