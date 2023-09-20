public class Dates{
    int date;
    int month;
    int year;

    Dates(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public void setDate(int date){
        this.date = date;
    }
    public int getDate(){
        return date;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        String Display = String.format("%d%d%d", date, month, year);
        return Display;
    }
    public Dates recentMost(Dates d1, Dates d2){
        if(d1.getYear()>d2.getYear()){
            return d1;
        }
        else if (d1.getMonth()>d2.getMonth()) {
            return d1;

        } else if (d1.getDate()> d2.getDate()){
            return d1;

        }
        else{
            return d2;
        }

    }
}

