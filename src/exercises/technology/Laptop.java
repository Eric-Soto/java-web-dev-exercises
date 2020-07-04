package exercises.technology;

public class Laptop extends Computer {

    private String brand;
    private int ram;

    public Laptop(String Id,String name, int releaseYear, String brand, int ram) {
        super(Id, name, releaseYear);
        this.ram = ram;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean ramIsOutdated(){

        if(ram >= 8){
            return false;
        }
        else{
            return true;
        }
    }
    @Override
    public String computerStatus(){
        String upToDate;
        if (ramIsOutdated()){
            upToDate = "needs an upgrade";
        }
        else {
            upToDate = "is up to date";
        }
        return name + " was released on " + releaseYear + " and Ram wise " + upToDate + ".";
    }

}
