package com.iesemilidarder.base;

import com.iesemilidarder.base.data.Moto;
import com.iesemilidarder.base.data.SystemUtilHelper;
import com.iesemilidarder.base.data.Vehicle;

public class Launcher {
    public static void main(String... args) {
        System.out.println("Concesionario brumbrum App 2.0");
        Moto moto = new Moto();
        moto.setNumWheels(2);
        moto.setPrice(123.45);
        moto.setColor("Blanco");
        System.out.println(moto.getNumWheels());
        moto.start();
        SystemUtilHelper.consolePrint("pista que voy!");
        moto.brake();
        Vehicle aux = new Moto ();
        SystemUtilHelper.consolePrint("yuhu");
    }
}
