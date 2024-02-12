public class Library {
    static int  numberOfItmaes(int x, int y){
        int sum = 0;
        for(int i= x; i<=y; i++){
            sum=sum+1;
        }
        return sum ; 
    }

    static int sumOfItmaes(int x, int y){
        int sum=0;
        for(int i=x; i<=y; i++){
            sum=sum +i;
        }
        return sum;
    }

    static double meanOfItems(int x, int y){
        double sum= sumOfItmaes(x, y);
        double num=numberOfItmaes(x, y);
        double mean= sum/num;
        return mean;
    }

    public static void main(String[] args) {
        System.out.println(numberOfItmaes(5, 10));
        System.out.println(sumOfItmaes(5, 10));
        System.out.println(meanOfItems(5, 10));
    }
}

