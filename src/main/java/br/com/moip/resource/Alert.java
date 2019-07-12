package br.com.moip.resource;

/**
 * This class implements the alerts that wire card api ca send
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class Alert {
    private String description;
    private String code;

    public Alert() {
    }

    public Alert(String description, String code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
