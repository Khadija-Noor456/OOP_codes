package labtask_1;


public class Artist {
    private String name;
    private String gender;
    private String nationality;
    private Date debutYear;

    public Artist(String name, String gender, String nationality, Date debutYear) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.debutYear = debutYear;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDebutYear() {
        return this.debutYear;
    }

    public void setDebutYear(Date debutYear) {
        this.debutYear = debutYear;
    }

    public String toString() {
        return String.format("%-15s%-15s%-15s%-15s", this.name, this.gender, this.nationality, this.debutYear);
    }
}

