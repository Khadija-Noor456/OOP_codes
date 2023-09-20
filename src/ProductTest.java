public class ProductTest {
    public static void main(String[] args) {
        Date date1 = new Date(19, 7, 2020);
        Date date2 = new Date(24, 2, 2019);
        Date date3 = new Date(14, 1, 2022);

        Product p1 = new Product("crackers", 98.7, 1, date1);
        Product p2 = new Product("gum", 21.0, 5, date2);
        Product p3 = new Product("Ice Cream", 70.0, 3, date3);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println("recent product:" +p2.isRecent(p2,p3));
    }
}

