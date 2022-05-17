/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vizsgaszf
 */
public class Raktar implements Iterable<Elelmiszer>{
    private ArrayList<Elelmiszer> elelmiszerek;

    public Raktar() {
        this.elelmiszerek = new ArrayList<>();
    }
    public void elelmiszerFelvetele(Elelmiszer elelmiszer){
        this.elelmiszerek.add(elelmiszer);
    }

    @Override
    public Iterator<Elelmiszer> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Elelmiszer> getElelmiszerek() {
        return Collections.unmodifiableList(elelmiszerek);
    }
    
     class ElelmiszerIterator implements Iterator<Elelmiszer> {

        private int i;

        public ElelmiszerIterator() {
            i = 0;
        }

        @Override
        public boolean hasNext() {
            return i < elelmiszerek.size();
        }

        @Override
        public Elelmiszer next() {
            return elelmiszerek.get(i++);
        }

    }
}
