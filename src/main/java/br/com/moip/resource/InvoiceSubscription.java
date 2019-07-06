package br.com.moip.resource;

/**
 * This class implements the needed attribute for the invoice Subscription
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class InvoiceSubscription {

    /**
     * Descriptions: Invoice amount in cents
     */
    private int amount;

    /**
     * Description: Invoice's ID
     */
    private int id;

    /**
     * Description: Invoice's status
     */
    private InvoiceStatusSubscription invoice;

    public InvoiceSubscription() {
    }

    public InvoiceSubscription(int amount, int id, InvoiceStatusSubscription invoice) {
        this.amount = amount;
        this.id = id;
        this.invoice = invoice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InvoiceStatusSubscription getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceStatusSubscription invoice) {
        this.invoice = invoice;
    }
}
