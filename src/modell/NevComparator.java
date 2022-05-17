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
public class NevComparator implements Comparator<Elelmiszer>{

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        Collator c = Collator.getInstance();
        return c.compare(o1.getNev(),(o2.getNev()));
    }
}
