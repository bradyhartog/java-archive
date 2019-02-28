/**
 * Decision-making for the number of days in a month
 */
public class Month {
    /**
     * Accepting input for month number (1-12)
     */
    private int monthNum;

    public Month(int monthNum) {
        this.monthNum = monthNum;
    }

    /**
     * Makes decisions to determine number of days in the given month
     * @return number of days: 31, 30, or 28
     */
    public int getLength() {
        int days = 0;
        if (monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10 || monthNum == 12) {
            days = 31;
        }
        if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) {
            days = 30;
        }
        if (monthNum == 2) {
            days = 28;
        }
        return days;
    }
}