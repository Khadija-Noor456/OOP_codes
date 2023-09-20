public class Device{
    private int id;
    private String name;
    private double price;
    private Dates mfgdate;
    static int counter = 1;

    Device(String name, double price, Dates mfgdate){

        this.id = counter++;
        this.name = name;
        this.price = price;
        this.mfgdate = mfgdate;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void setDate(Dates mfgdate){
        this.mfgdate = mfgdate;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getId(){
        return id;
    }

    public String toString() {
        String display = String.format("%04d\t%s\t%.2f\t%s", id, name, price, mfgdate.toString());
        return display;
    }


    public Device recentProduct(Device p1, Device p2){

        Dates temp = mfgdate.recentMost(p1.mfgdate, p2.mfgdate);
        if(temp == p1.mfgdate){
            return p1;
        }
        else{
            return p2;
        }
    }


}
