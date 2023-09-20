
    public class Date {
        private int date;
        private int month;
        private int year;

        public Date(int date, int month, int year) {
            this.date = date;
            this.month = month;
            this.year = year;
        }

        public int getDate() {
            return date;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }
        public void setDate(){
            this.date = date;
        }
        public void setMonth(){
            this.month = month;
        }
        public void setYear(){
            this.year = year;

        }

        public String toString() {
            return String.format("%02d/%02d/%04d", date, month, year);
        }
        public Date recentTime(Date d1, Date d2) {
            if (d1.getYear() > d2.getYear()) {
                return d1;
            } else if (d1.getYear() < d2.getYear()) {
                return d2;
            } else {
                if (d1.getMonth() > d2.getMonth()) {
                    return d1;
                } else if (d1.getMonth() < d2.getMonth()) {
                    return d2;
                } else {
                    if (d1.getDate() > d2.getDate()) {
                        return d1;
                    } else if (d1.getDate() < d2.getDate()) {
                        return d2;
                    } else {
                        return d1;
                    }
                }
            }
        }

    }

    // ... Other fields and methods ...

