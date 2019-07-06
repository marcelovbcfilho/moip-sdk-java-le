package br.com.moip.resource;

/**
 * This class implements all the needed attribute for the Next Invoice Date WireCard API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class NextInvoiceDate {

    /**
     * Description: Day of the next invoice
     */
    private int day;

    /**
     * Description: Month of the next invoice
     */
    private int month;

    /**
     * Description: Year of the next invoice
     */
    private int year;

    public NextInvoiceDate() {
    }

    public NextInvoiceDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
