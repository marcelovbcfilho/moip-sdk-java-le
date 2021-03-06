package br.com.moip.response;

import br.com.moip.resource.Alert;
import br.com.moip.resource.Message;

/**
 * This class implements the basis that all responses could have from WireCard API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class Response {
    private Error[] errors;
    private Message message;
    private Alert[] alerts;

    boolean hasErrors() {
        if (errors != null)
            return true;
        else
            return false;
    }

    boolean hasMessage() {
        if (message != null)
            return true;
        else
            return false;
    }

    boolean hasAlerts() {
        if (alerts != null)
            return true;
        else
            return false;
    }

    public Response() {
    }

    public Error[] getErrors() {
        return errors;
    }

    public void setErrors(Error[] errors) {
        this.errors = errors;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Alert[] getAlerts() {
        return alerts;
    }

    public void setAlerts(Alert[] alerts) {
        this.alerts = alerts;
    }
}
