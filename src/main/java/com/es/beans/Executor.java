package com.es.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Executor {
    private double a;
    private double b;
    private double c;

    private double res;

    public Executor() {

    }

    public String execute() {
        double intermediateRes = Math.max(a, b);
        res = Math.max(intermediateRes, c);
        return "result";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}
