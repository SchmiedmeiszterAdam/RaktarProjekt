/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.text.Collator;
import java.util.Comparator;

/**
 *
 * @author vizsgaszf
 */
public class GyartoComparator implements Comparator<Elelmiszer>{
    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        Collator c = Collator.getInstance();
        return c.compare(o1.getGyarto(),(o2.getGyarto()));
    }
}
