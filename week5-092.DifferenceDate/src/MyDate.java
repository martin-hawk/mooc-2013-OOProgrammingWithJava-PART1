
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        return this.year == compared.year && this.month == compared.month
                && this.day < compared.day;
    }

    public int differenceInYears(MyDate comparedDate) {
        // int days1;
        // int days2;
        // Converting Julian calendar date to Julian Day Number
        // JDN = 367 × Y − (7 × (Y + 5001 + (M − 9)/7))/4 + (275 × M)/9 + D + 1729777
        // days1 = 367 * this.year - (7 * (this.year + 5001 + (this.month - 9) / 7)) / 4 + (275 * this.month) / 9 + this.day + 1729777;
        // days2 = 367 * comparedDate.year - (7 * (comparedDate.year + 5001 + (comparedDate.month - 9) / 7)) / 4 + (275 * comparedDate.month) / 9 + comparedDate.day + 1729777;
        // return Math.abs(days1 - days2) / 364; 
        double yearDiff;
        if (this.year > comparedDate.year) {
            yearDiff = (this.year + (double) this.month / 12 + (double) this.day / 365)
                    - (comparedDate.year + (double) comparedDate.month / 12
                    + (double) comparedDate.day / 365);
        } else {
            yearDiff = (comparedDate.year + (double) comparedDate.month / 12
                    + (double) comparedDate.day / 365)
                    - (this.year + (double) this.month / 12 + (double) this.day / 365);
        }
        return (int) yearDiff;
    }
}
