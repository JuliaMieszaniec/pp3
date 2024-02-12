public class Temperature {
    static double CelsiusToKelvin(double temp){
        return temp + 273.15;
    }
    static double CelsiusToFarenheit(double temp){
        return (temp*1.8)+32;
    }
    static double KelvinToCelsius(double temp){
        return temp - 273.15;
    }
    static double KelvinToFarenheit(double temp){
        return (temp -273.15)*1.8 + 32;
    }
    static double FarenheitToCelsius(double temp){
        return(temp-32)*5.0/9.0;
    }
    static double FarenheitToKelvin(double temp){
        return (temp - 32)*5.0/9.0 + 273.15;
    }

    public static void main(String[] args) {
        //a
        System.out.println(CelsiusToFarenheit(25)+" "+CelsiusToKelvin(25));
        //b
        System.out.println(FarenheitToCelsius(100)+" "+FarenheitToKelvin(100));
        //c
        System.out.println(KelvinToCelsius(0) +" "+KelvinToFarenheit(0));
   }
}
