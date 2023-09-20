 public class deviceTest{
    public static void main(String[] args) {
        Dates d1 = new Dates(24, 2, 2021);
        Dates d2 = new Dates(24, 4, 2022);

        Device p1 = new Device("lays", 56.6, d1);
        Device p2 = new Device("choc", 89.6, d2);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Recent Product: "+p1.recentProduct(p1,p2));

    }
}

