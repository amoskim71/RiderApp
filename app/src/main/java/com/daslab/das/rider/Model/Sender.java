package com.daslab.das.rider.Model;

/**
 * Created by User on 12/15/2017.
 */

public class Sender {


        public String data ;
        public String to ;

    public Sender()
    {

    }

    public Sender(String data, String to) {
        this.data = data;
        this.to = to;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
