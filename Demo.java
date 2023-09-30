package labtask_1;



public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
        Music m1 = new Music("all by myself", "2:45", "pop", new Date(1, 4, 2021), new Artist("bayan", "male", "Pakistani", new Date(13, 2, 2008)));
        System.out.println(m1);
        Music m2 = new Music("arsonist", "2:45", "folk", new Date(1, 4, 2021), new Artist("hozier", "male", "Irish", new Date(13, 2, 2003)));
        System.out.println(m2);
        Music m3 = new Music("Freshly disowned", "3:00", "folk", new Date(1, 4, 2021), new Artist("Frank", "male", "English", new Date(13, 2, 2003)));
        System.out.println(m3);
        Music m4 = new Music("NDA", "2:45", "folk", new Date(1, 4, 2021), new Artist("Billie", "female", "American", new Date(13, 2, 2003)));
        System.out.println(m4);
        Music m5 = new Music("WOW", "2:45", "", new Date(1, 4, 2021), new Artist("post malone", "male", "American", new Date(13, 2, 2003)));
        System.out.println(m5);
        Music[] list = new Music[]{m1, m2, m3, m4, m5};

        for(int i = 0; i < 5; ++i) {
            System.out.println(list[i]);
        }

        System.out.println(m1.equals(m2));
    }
}

