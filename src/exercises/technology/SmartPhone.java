package exercises.technology;

public class SmartPhone extends  Computer {

    private String brand;
    private String operativeSystem;

    public SmartPhone(String Id, String name, int releaseYear, String brand, String operativeSystem) {
        super(Id, name, releaseYear);
        this.brand = brand;
        this.operativeSystem = operativeSystem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperativeSystem() {
        return operativeSystem;
    }

    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }

    public String operativeSystemMessage(){
        String status;
        if(operativeSystem.toUpperCase() == "iPhone"){
            status = "is fancy";

        }
        else if(operativeSystem == "Android"){
            status = "is better than iphone";
        }
        else{
            status = "is alright";
        }
        return status;
    }

    public String phoneDescription(){
        return "Your " + releaseYear + " " + operativeSystem + " " + brand + " phone " + operativeSystemMessage();
    }
}
