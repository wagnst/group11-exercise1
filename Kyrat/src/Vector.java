/**
 * Copyright by Steffen Wagner (D059727)
 *
 * Created on 12.03.2015, 13:33 Project: Kyrat
 */

public class Vector extends java.lang.Object {

    private double x, y, z;

    /**
     * Erzeugt einen Null-Vector, d.h. den Vektor bei dem alle Komponenten den
     * Wert 0 haben.
     */
    public Vector() {
        super();
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
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Skalarmultiplikation: Multiplikation des Vektors mit einem Skalar.
     *
     * @param skalar Skalar, mit dem der Vektor multipliziert werden soll
     *
     * @return das Ergebnis der Skalar-Multiplikation
     */
    public Vector multipliziere(double skalar) {

    }

    /**
     * Skalarmultiplikation: Multiplikation des Vektors mit einem Vektor.
     *
     * @param vektor Vektor, mit dem dieser Vector multipliziert werden soll
     *
     * @return das Ergebnis der Skalar-Multiplikation
     *
     * @throws java.lang.IllegalArgumentException wenn der Typ von vektor nicht
     *                                            passt
     */
    public double multipliziere(Vector vektor) throws java.lang.IllegalArgumentException {

    }

    /**
     * Liefert einen Vektor zurück, der diesem Vektor bezüglich der Richtung
     * entspricht, aber auf die Länge 1 normiert ist
     *
     * @return der Einheitsvektor zu diesem Vector
     *
     * @throws java.lang.IllegalStateException wenn dieser Vector ein Nullvektor
     *                                         ist
     */
    public Vector einheitsvektor() throws java.lang.IllegalStateException {

    }

    /**
     * Addiert den gegebenen Vektor zu diesem
     *
     * @param vektor Vektor, der addiert werden soll
     *
     * @return das Ergebnis der Addition
     *
     * @throws java.lang.IllegalArgumentException wenn der Typ von vektor nicht
     *                                            passt
     */
    public Vector addiere(Vector vektor) throws java.lang.IllegalArgumentException {

        Vector ergebnis = new Vector();

        this.x += vektor.x ;
        this.y += vektor.y ;
        this.z += vektor.z ;

        ergebnis.x = this.x;
        ergebnis.y = this.y;
        ergebnis.z = this.z;

        return ergebnis;

    }

    /**
     * Bestimmt den Betrag (die Länge) dieses Vektors
     *
     * @return den Betrag (die Länge) des Vektors
     */
    public double betrag() {

    }

    /**
     * Bestimmt das Kreuzprodukt dises mit dem gegebenen Vektor.
     *
     * @param v der Vektor, mit dem das Kreuzprodukt gebildet werden soll
     *
     * @return das Kreuzprodukt
     */
    public Vector kreuzprodukt(Vector v) {

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
     * @param v der Vektor, für den der Winkel mit diesem bestimmt werden soll
     *
     * @return Winkel in Grad (0-180)
     */
    public double winkel(Vector v) {

    }

    @Override
    public int hashCode() {

    }

    @Override
    public boolean equals(java.lang.Object o) {

    }

    @Override
    public java.lang.String toString() {

    }

}
