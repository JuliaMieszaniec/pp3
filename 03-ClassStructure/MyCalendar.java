public class MyCalendar {
    static int year=2024;
    static int month=2 ;
    static int day=1 ;
    static int days[]= {31,28,31,30,31,30,31,31,30,31,30,31};
    static String months[]={"Jan","Feb","Mar","Ap","May","Jun","July","Sie","wrz","paz","lis","gru"};

    static String myDate(){
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    static int days(){
        int sum=0;
        for (int i = 0; i <month; i++){
            sum = sum + days[i];
        }
        return sum = sum + day;
    }

    static String monthName(){
        return months[month-1];
    }
}
