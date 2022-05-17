/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

/**
 *
 * @author vizsgaszf
 */
public class Konzerv extends Elelmiszer{
    private String leiras;
    private String recept;

    public Konzerv(String leiras, String recept, String nev, String gyarto, Date lejaratiDatum) throws LejártException {
        super(nev, gyarto, lejaratiDatum);
        this.leiras = leiras;
        this.recept = recept;
    }

    public Konzerv(String leiras, String recept, String nev, String gyarto) {
        super(nev, gyarto);
        this.leiras = leiras;
        this.recept = recept;
    }

    public Konzerv(String leiras, String nev, String gyarto, Date lejaratiDatum) throws LejártException {
        super(nev, gyarto, lejaratiDatum);
        this.leiras = leiras;
    }

    public Konzerv(String leiras, String nev, String gyarto) {
        super(nev, gyarto);
        this.leiras = leiras;
    }
    
    public boolean receptMutat(){
         Path path = Paths.get(this.recept);
        if (Files.exists(path)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Elelmiszer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
