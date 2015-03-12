/**
 * Copyright 2014 by Steffen Wagner (D059727) Created on 12.03.2015, 13:33
 * Project: Kyrat
 */

public class Vector extends java.lang.Object {

    private double x,y,z;

    /**
     * Erzeugt einen Null-Vector, d.h. den Vektor bei dem alle Komponenten den Wert 0 haben.
     *
     * @author wagnst
     */
    public Vector() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    /**
     * Erzeugt einen neuen Vektor mit den angebgebenen Elementen.
     *
     * @param x die x-Komponente des Vektors
     * @param y die y-Komponente des Vektors
     * @param z die z-Komponente des Vektors
     *
     * @author wagnst
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
