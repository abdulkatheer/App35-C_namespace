package org.katheer.bean;

public class Address {
    private String firstLine;
    private String secondLine;
    private String pin;

    public Address(String firstLine, String secondLine, String pin) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.pin = pin;
    }

    public void getAddress() {
        System.out.println(this.firstLine);
        System.out.println(this.secondLine);
        System.out.println("PIN : " + this.pin);
    }
}
