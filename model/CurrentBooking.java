package com.onlinetourguide.model;

public class CurrentBooking {


    private int bid;
    private int packageId;
    private int customer_id;
    private String book_date;
    private String fname;
    private String lname;
    private String tourPkgName;
    private String price;
    private String email;
    private String imageURL_1;
    private String phone;
    private boolean book_status;
    private int adults;
    private int children;

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getImageURL_1() {
        return imageURL_1;
    }

    public void setImageURL_1(String imageURL_1) {
        this.imageURL_1 = imageURL_1;
    }

    public boolean isBook_status() {
        return book_status;
    }

    public void setBook_status(boolean book_status) {
        this.book_status = book_status;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getBook_date() {
        return book_date;
    }

    public void setBook_date(String book_date) {
        this.book_date = book_date;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getTourPkgName() {
        return tourPkgName;
    }

    public void setTourPkgName(String tourPkgName) {
        this.tourPkgName = tourPkgName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
