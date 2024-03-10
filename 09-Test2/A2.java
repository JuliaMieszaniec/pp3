public class A2 {
    
    static boolean m(int[] numbers){
        int wb=0;
        int sum=0;
        for(int num : numbers){
            if(num>0){
                sum+=num;
            }
            if(num<0){
                wb+=(num*(-1));
            }
        }
        if(sum > wb){
            return true;
        }else{
            return false;
        }

    


    }
    public static void main(String[] args){
        int[] n1= {9,3,4,-2,-8};
        int[] n2= {9,0,2,-7,4,-9,1,-5};
        System.out.println(A2.m(n1));
        System.out.println(A2.m(n2));

    }
}
