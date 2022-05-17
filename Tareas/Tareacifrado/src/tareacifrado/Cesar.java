
package tareacifrado;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cesar extends JPanel {
    
    private JTextField cuadro;
    private JTextArea cuadro1, cuadro2;
    private JButton boton;
    private JLabel label, label1, label2;
    private JLabel mensajeCifrado;
    private JScrollPane sc, sc1;

    public Cesar() {
        JPanel cifrar = new JPanel(); //creamos un panel que ejecute el cifrado del mensaje
        
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        label = new JLabel("Tipo de desplazamiento:");
        cuadro = new JTextField(5);
        label1 = new JLabel("Ingresa un mensaje:");
        cuadro1 = new JTextArea(20,20);
        sc = new JScrollPane(cuadro1);
        label2 = new JLabel("Mensaje Cifrado:");
        cuadro2 = new JTextArea(20,20);
        sc1 = new JScrollPane(cuadro2);
        
        boton = new JButton("Cifrar");
        boton.setBackground(Color.blue);
        boton.setOpaque(true);
        boton.setToolTipText("Clic para cifrar el mensaje");
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(cuadro,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label1,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(sc,gbc);
        
        gbc.gridx = 20;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label2,gbc);
        
        gbc.gridx = 20;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(sc1,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 15;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(boton,gbc);
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cifrado();
            }
            
        });
        
    }
    
    private void cifrado(){
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        int desplazamiento;
        String mensaje;
        
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        
        desplazamiento = Integer.parseInt(cuadro.getText());
        
        mensaje = cuadro1.getText();
        
        System.out.println(desplazamiento);
        System.out.println(cuadro1.getText());
        System.out.println(mensaje);

         
        String texto = codificar(letras, mensaje);
        cuadro2.setText(texto);
    }
    
    private String codificar(String letras, String texto){
        String textoCodificado = "";
        int desplazamiento;
        desplazamiento = Integer.parseInt(cuadro.getText());
        texto = texto.toUpperCase();
 
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
 
            int pos = letras.indexOf(caracter);
 
            if(pos == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += letras.charAt( (pos + desplazamiento) % letras.length() );
            }
 
        }
 
        return textoCodificado;
    }
    
}
  

