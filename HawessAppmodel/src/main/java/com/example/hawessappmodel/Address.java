package com.example.hawessappmodel;

public class Address {
    private int id;
    private double latitude;
    private double longitude;
    private String street;
    private String city;
    private String country;
    private String zipCode;

    public Address(int id, double latitude, double longitude, String street, String city, String country, String zipCode) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    //methods
    public String getWilayaCode(){
        String w;
        int code=0;
        String [] Wilaya = {"adrar","chlef","laghouat","oum el bouaghi","batna","bejaïa","biskra", "béchar","blida","bouira","tamanrasset","tebessa","tlemcen","tiaret","tizi ouzou","alger", "djelfa", "jijel", "sétif", "saïda", "skikda", "sidi bel abbès", "annaba", "guelma", "constantine", "médéa", "mostaganem", "msila", "mascara", "ouargla", "oran", "el bayadh", "illizi","bordj bou arreridj", "boumerdès","el tarf", "tindouf","tissemsilt","el oued","khenchela","souk ahras","tipaza","mila","aïn defla","naâma","aïn témouchent","ghardaia","relizane"};
        w = getCity();
        for (int i =0 ;i< Wilaya.length;i++){
            if (w == Wilaya[i]) {
                code = i+1;
            }
        }
        return String.valueOf(code);
    }
}
