package exercises.technology;

public class Computer extends AbstractEntity{

    String name ;
    private Boolean isRecent;
    int releaseYear;

    private int Id ;

    public Computer(String Id, String name, int releaseYear) {
        super(Id);
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRecent() {
        return isRecent;
    }

    public void setRecent(Boolean recent) {
        isRecent = recent;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public boolean computerIsRecent() {
        Integer recency = 2020 - releaseYear;
        if (recency <= 5) {
            return true;
        } else {
            return false;
        }
    }

    public String computerStatus(){
        String upToDate;

        if(computerIsRecent()){
            upToDate = "is recent";
        }
        else{
            upToDate = "is not recent";
        }
        return name + " was released on " + releaseYear + " and " + upToDate + ".";
    }

    @Override
    public String Id() {
        return null;
    }
}
