package br.com.moip.resource;

/**
 * This class implements the messages returned from WireCard API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class Message {

    /**
     * Required: False
     * Description: This attribute will keep the message return from the WireCard API
     */
    private String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
