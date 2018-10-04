package com.iesemilidarder.base;

import com.iesemilidarder.base.data.Moto;

public class Launcher {
    public static void main(String... args) {
        System.out.println("Concesionario brumbrum App 2.0");
        Moto moto = new Moto();
        moto.start();
        System.out.println("pista que voy!");
        moto.brake();
    }
}
