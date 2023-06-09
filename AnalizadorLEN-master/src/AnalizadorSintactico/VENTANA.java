/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VENTANA.java
 *
 * Created on 31/03/2011, 12:16:39 PM
 */

package AnalizadorSintactico;

import AnalizadorLexico.AnalizadorLexico;
import AnalizadorLexico.Token;
import java.util.ArrayList;

/**
 *
 * @author TV
 */
public class VENTANA extends javax.swing.JFrame {

    /** Creates new form VENTANA */
    AnalizadorSintactico sintactico = new AnalizadorSintactico();
    AnalizadorLexico lexico = new AnalizadorLexico();
    TAS t = new TAS();
    ArrayList<String> pila = new ArrayList<String>();

    public VENTANA() {
        initComponents();
        setTitle("Analizador Sintactico");
        setLocation(200, 100);
        pila.add("0");
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pant1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        pant2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pant1.setColumns(20);
        pant1.setRows(5);
        jScrollPane1.setViewportView(pant1);

        pant2.setColumns(20);
        pant2.setRows(5);
        jScrollPane2.setViewportView(pant2);

        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(294, 294, 294)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 697,
                                                                Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(322, 322, 322)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(23, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        pant2.setText("");
        // a.separar(pant1.getText());
        // pant2.setText(t.analizar(pila, a.tokens));

        lexico.analizar(pant1.getText());
        sintactico.alt = lexico.getAlen().getAltokens();
        sintactico.alt.add(new Token("$", 0));
        pant2.setText(t.analizar1(pila, sintactico.alt));
        lexico = new AnalizadorLexico();
        pila = new ArrayList<String>();
        sintactico.tokens = new ArrayList<String>();
        sintactico.alt = new ArrayList<Token>();
        pila.add("0");

    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTANA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea pant1;
    private javax.swing.JTextArea pant2;
    // End of variables declaration//GEN-END:variables

}
