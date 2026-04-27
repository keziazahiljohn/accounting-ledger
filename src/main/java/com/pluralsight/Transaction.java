package com.pluralsight;

public class Transaction {
    private String date = "";
    private String time = "";
    private String description = "";
    private String amount = "";

    public Transaction(String date, String time, String description, String amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date + " | " + time + " | " + description + " | " + amount;
    }
}
