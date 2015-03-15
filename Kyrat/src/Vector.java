/**
 * Copyright by Steffen Wagner (D059727)
 * <p/>
 * Created on 12.03.2015, 13:33 Project: Kyrat
 */

import java.util.Locale;

public class Vector extends java.lang.Object {

    private double x, y, z;

    /**
     * Erzeugt einen Null-Vector, d.h. den Vektor bei dem alle Komponenten den
     * Wert 0 haben.
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
     */
    public Vector(double x, double y, double z) {

        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Skalarmultiplikation: Multiplikation des Vektors mit einem Skalar.
     *
     * @param skalar Skalar, mit dem der Vektor multipliziert werden soll
     * @return das Ergebnis der Skalar-Multiplikation
     */
    public Vector multipliziere(double skalar) {

        Vector vector = new Vector();

        // to prevent the result of -0
        if (skalar == 0) {
            vector.x = 0.0;
            vector.y = 0.0;
            vector.z = 0.0;

        } else {
            // multiplication of each vector path with the scalar
            vector.x = this.x * skalar;
            vector.y = this.y * skalar;
            vector.z = this.z * skalar;

            if (vector.x == -0.0) {
                vector.x = 0.0;
            } else if (vector.y == -0.0) {
                vector.y = 0.0;
            } else if (vector.z == -0.0) {
                vector.z = 0.0;
            }
        }

        return vector;
    }

    /**
     * Skalarmultiplikation: Multiplikation des Vektors mit einem Vektor.
     *
     * @param vector Vektor, mit dem dieser Vector multipliziert werden soll
     * @return das Ergebnis der Skalar-Multiplikation
     * @throws java.lang.IllegalArgumentException wenn der Typ von vektor
     *                                            nicht passt
     */
    public double multipliziere(Vector vector)
            throws java.lang.IllegalArgumentException {

        Vector vector2 = new Vector();

        vector2.x = this.x * vector.x;
        vector2.y = this.y * vector.y;
        vector2.z = this.z * vector.z;

        return (vector2.x + vector2.y + vector2.z);
    }

    /**
     * Liefert einen Vektor zurück, der diesem Vektor bezüglich der Richtung
     * entspricht, aber auf die Länge 1 normiert ist
     *
     * @return der Einheitsvektor zu diesem Vector
     * @throws java.lang.IllegalStateException wenn dieser Vector ein Nullvektor ist
     */
    public Vector einheitsvektor() throws java.lang.IllegalStateException {

        Vector result = new Vector();
        double amount;

        //get amount of vector
        amount = betrag();

        //divide each part of vector with amount
        result.x = this.x / amount;
        result.y = this.y / amount;
        result.z = this.z / amount;

        return result;
    }

    /**
     * Addiert den gegebenen Vektor zu diesem
     *
     * @param vector Vektor, der addiert werden soll
     * @return das Ergebnis der Addition
     * @throws java.lang.IllegalArgumentException wenn der Typ von vektor
     *                                            nicht passt
     */
    public Vector addiere(Vector vector)
            throws java.lang.IllegalArgumentException {

        Vector result = new Vector();

        result.x = this.x + vector.x;
        result.y = this.y + vector.y;
        result.z = this.z + vector.z;

        return result;
    }

    /**
     * Bestimmt den Betrag (die Länge) dieses Vektors
     *
     * @return den Betrag (die Länge) des Vektors
     */
    public double betrag() {

        //sqrt(aX^2+aY^2)
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }


    /**
     * Bestimmt den Betrag (die Länge) eines Vektors
     *
     * @param vector Vektor, von dem der Betrag bestimmt werden soll
     * @return den Betrag (die Länge) eines Vektors
     */
    public double betrag(Vector vector) {

        //sqrt(aX^2+aY^2)
        return Math.sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z);
    }

    /**
     * Bestimmt das Kreuzprodukt dises mit dem gegebenen Vektor.
     *
     * @param vector der Vektor, mit dem das Kreuzprodukt gebildet werden soll
     * @return das Kreuzprodukt
     */
    public Vector kreuzprodukt(Vector vector) {

        Vector result = new Vector();

        // aY*bZ - aZ*bY
        result.x = this.y * vector.z - this.z * vector.y;
        //aZ*bX - aX*bZ
        result.y = this.z * vector.x - this.x * vector.z;
        //aX*bY - aY*bX
        result.z = this.x * vector.y - this.y * vector.x;

        return result;
    }

    /**
     * Liefert die x-Komponente des Vektors zurück
     *
     * @return die x-Komponente
     */
    public double getX() {

        return x;
    }

    /**
     * Liefert die y-Komponente des Vektors zurück
     *
     * @return die y-Komponente
     */
    public double getY() {

        return y;
    }

    /**
     * Liefert die z-Komponente des Vektors zurück
     *
     * @return die z-Komponente
     */
    public double getZ() {

        return z;
    }

    /**
     * Bestimmt den eingeschlossenen Winkel von diesem und dem gegebenen Vektor
     *
     * @param v der Vektor, für den der Winkel mit diesem bestimmt werden
     *          soll
     * @return Winkel in Grad (0-180)
     */
    public double winkel(Vector v) {

        // 360° - cos^-1 ((u*v) / (|u|*|v|))
        return (360.0 - Math.cosh(multipliziere(v) / ( betrag() * betrag(v))));
    }

    /**
     * @return hash of all vector paths to int
     */
    @Override
    public int hashCode() {

        return (int) (this.x + this.y + this.z);
    }

    @Override
    public boolean equals(java.lang.Object o) {

        return true;
    }

    /**
     * @return comma seperated vector path
     */
    @Override
    public java.lang.String toString() {

        return ("[ " +
                String.format(Locale.GERMAN, "%1$,.2f", this.x) + "  " +
                String.format(Locale.GERMAN, "%1$,.2f", this.y) + "  " +
                String.format(Locale.GERMAN, "%1$,.2f", this.z) + " ]");
    }

}
