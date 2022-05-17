/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author vizsgaszf
 */
public abstract class Elelmiszer implements Serializable, Comparable<Elelmiszer>{

    private String nev;
    private String gyarto;
    private Date lejaratiDatum;
    private static Calendar c = Calendar.getInstance();

    public Elelmiszer(String nev, String gyarto, Date lejaratiDatum) throws LejártException {
        this.nev = nev;
        this.gyarto = gyarto;
        if (lejaratiDatum.before(c.getTime()) || lejaratiDatum == c.getTime()) {
            throw new LejártException("Nem jó dátum");
        } else {
            this.lejaratiDatum = lejaratiDatum;
        }
    }

    public Elelmiszer(String nev, String gyarto) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        this.nev = nev;
        this.gyarto = gyarto;
        this.lejaratiDatum = calendar.getTime();
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }
}
