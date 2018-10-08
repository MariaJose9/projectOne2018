package com.iesemilidarder.base.data;

public abstract class Vehicle {
    public abstract void start();

    public void brake() {
        doLog("he frenado");
    }


    protected void doLog(String message) {
        System.out.println(message);
    }

    private String showLog(String message) {
        doLog(message);
        return message;
    }
}
