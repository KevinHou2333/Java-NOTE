package Q7;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return this.getYear() + "年" +
                this.getMonth() + "月"
                + this.getDay() + "日";
    }
}
