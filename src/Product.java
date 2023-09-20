public class Product {
    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        private int id;
        private String name;
        private double price;
        private int quantity;
        static int counter=1;
        private Date date;

        Product(String name, double price,int quantity,Date date) {
            this.id=counter++;
            this.name=name;
            this.price=price;
            this.quantity=quantity;
            this.date=date;

        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }


        public int getId() {
            return id;
        }
        public String toString() {
            return String.format("%04d\t%-20s%,.2f\t%4d/%d/%d", id, name, price, quantity,
                    date.getDate(), date.getMonth(), date.getYear());
            }
            public Product isRecent(Product p1, Product p2){
             Date temp = date.recentTime(p1.date, p2.date);
             if (temp == p1.date)
                 return p1;
             else
                 return p2;

            }

    }

