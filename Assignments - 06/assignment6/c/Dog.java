package assignments.assignment6.c;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Dog extends Pet implements Boardable {
    private String size;
    private Date startDate;
    private Date endDate;

    public Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public String toString() {
        String result = super.toString();
        result = "DOG:\n" + result;
        return result;
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        Date startDate = toDate(month, day, year);
        this.startDate = startDate;
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        Date endDate = toDate(month, day, year);
        this.endDate = endDate;
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        Date date = toDate(month, day, year);
        if (date != null && this.startDate != null && this.endDate != null && date.compareTo(this.startDate) >= 0 && date.compareTo(this.endDate) <= 0)
            return true;
        else
            return false;
    }

    private Date toDate(int month, int day, int year) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("PDT"));
        df.setLenient(false);
        String datestr = year + "-" + month + "-" + day + " 12:00:00";
        Date date = null;
        try {
            date = df.parse(datestr);
        } catch (ParseException e) {
            System.out.println("***error: " + year + "-" + month + "-" + day + " is a wrong date!" + "***");
        }
        return date;
    }
}
