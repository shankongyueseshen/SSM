package com.training.domain;

import java.util.Date;

public class Customer {
    private Integer customerid;

    private String customername;

    private String customersex;

    private String customeridnumber;

    private String customertype;

    private String customerphone;

    private Date customercreatedate;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomersex() {
        return customersex;
    }

    public void setCustomersex(String customersex) {
        this.customersex = customersex;
    }

    public String getCustomeridnumber() {
        return customeridnumber;
    }

    public void setCustomeridnumber(String customeridnumber) {
        this.customeridnumber = customeridnumber;
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone;
    }

    public Date getCustomercreatedate() {
        return customercreatedate;
    }

    public void setCustomercreatedate(Date customercreatedate) {
        this.customercreatedate = customercreatedate;
    }
}