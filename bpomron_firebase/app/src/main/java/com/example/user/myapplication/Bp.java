package com.example.user.myapplication;

import android.widget.TextView;

/**
 * Created by User on 2/21/2018.
 */

public class Bp {

    private String SYS;
    private String DIA;
    private String HR;

    public Bp(TextView textView, TextView sys, TextView SYS){

    }

    public Bp(String SYS, String DIA, String HR) {
        this.SYS = SYS;
        this.DIA = DIA;
        this.HR = HR;
    }

    public String getSYS() {
        return SYS;
    }

    public void setSYS(String SYS) {
        this.SYS = SYS;
    }

    public String getDIA() {
        return DIA;
    }

    public void setDIA(String DIA) {
        this.DIA = DIA;
    }

    public String getHR() {
        return HR;
    }

    public void setHR(String HR) {
        this.HR = HR;
    }
}
