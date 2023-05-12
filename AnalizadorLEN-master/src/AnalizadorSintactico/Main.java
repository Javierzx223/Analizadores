/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AnalizadorSintactico;

import java.util.ArrayList;



/**
 *
 * @author TV
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        a.add("f");
        a.remove(a.size()-1);a.remove(a.size()-1);
        a.remove(a.size()-1);
        a.remove(a.size()-1);
        a.remove(a.size()-1);
        a.remove(a.size()-1);
        
        System.out.println(" "+a.size());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTANA().setVisible(true);
            }
        });
    }*/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTANA().setVisible(true);
            }
        });
    }

}
