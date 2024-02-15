public class DrivingLicense {
    private String name;
    private String surname;
    private String adress;
    private String postalcode;
    private String city;
    //private String license_no;
    private int year;
    private String category;

    @Override
    public String toString() {
        return "DrivingLicence [name=" + name + ", driverAdress=" + adress + ", postCode=" + postalcode + ", city="
                + city + ", year=" + year + ", category=" + category + "]";
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        String f = name.substring(0,1);
        String rest = name.substring(1);
        f = f.toUpperCase();
        rest = rest.toLowerCase();
        this.name = f+rest;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String newSurname){
        this.surname= newSurname;
    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String newAdress){
        this.adress= newAdress;
    }
    public String getPostalcode(){
        return postalcode;
    }
    public void setPostalcode(String newPostalcode){
        this.postalcode= newPostalcode;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1800){
            this.year = year;
        }
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
