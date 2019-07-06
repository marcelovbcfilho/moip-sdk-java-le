package br.com.moip.resource;

/**
 * This
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class InvoiceStatusSubscription {

    /**
     * Description: Invoice description
     */
    private String description;

    /**
     * Description: Invoice's code
     */
    private int code;

    public InvoiceStatusSubscription() {
    }

    public InvoiceStatusSubscription(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
