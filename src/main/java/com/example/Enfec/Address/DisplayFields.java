package com.example.Enfec.Address;

public class DisplayFields {

    private String email;
    private String username;

    private String zipCode;

    public DisplayFields(String email, String username, String zipCode) {
        this.email = email;
        this.username = username;
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
