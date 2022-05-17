/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Elelmiszer;
import modell.Konzerv;
import modell.Raktar;

/**
 *
 * @author vizsgaszf
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Raktar raktar = new Raktar();
        mentes(raktar);
        betolt();
    }

    private static void mentes(Raktar raktar) throws IOException {
        try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("raktar.bin"))) {
            objKi.writeObject(raktar);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Raktar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Raktar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static Raktar betolt() {
        Raktar raktar = new Raktar();
        try (ObjectInputStream objKi = new ObjectInputStream(new FileInputStream("raktar.bin"))) {
            raktar = (Raktar) objKi.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Raktar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Raktar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Raktar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return raktar;
        }
    }
}
