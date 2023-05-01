package ComponentesSwing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class DialogAcercaDe extends JDialog implements ActionListener{
	
JButton jbAceptar;
JTextArea jtAlumnos;

public DialogAcercaDe(JFrame jf){
super(jf, "Acerca de 'Analizador Lexico LEN' ", true);
this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
this.setLocationRelativeTo(jf);
this.setResizable( false );
this.setLayout(null);
this.setSize(349,270);

StringBuffer texto = new StringBuffer();
texto.append( "        Analizador Lexico TlatoaniTokenizer\n\n" );
texto.append( " Alumnos:    Javier Alviso Rivera\n\n");
texto.append( "                    Enrique Alfredo Dominguez Angeles\n\n" );
texto.append( "                    Juan Samuel Perez Gónzale\n\n" );
texto.append( "                    Cristian Alexis Lara Barcenas\n\n" );
texto.append( "                    Roman Soel Rivera Salinas\n\n" );


jtAlumnos = new JTextArea();
jtAlumnos.setText( texto.toString() );
jtAlumnos.setFont( new Font( "Times New Roman", 1, 14 ) );
jtAlumnos.setEditable( false );
jtAlumnos.setBounds(10,10,320,250);

jbAceptar = new JButton("Aceptar");
jbAceptar.addActionListener(this);
jbAceptar.setBounds(jtAlumnos.getX()+120,jtAlumnos.getY()
                    +jtAlumnos.getHeight()+6,80,25);

this.getContentPane().add(jtAlumnos);
this.getContentPane().add(jbAceptar);

}
//Accion del boton jbAceptar :cierra el JDialog
public void actionPerformed(ActionEvent e){
if ( e.getSource() == jbAceptar )
 this.dispose();
}
		
}
