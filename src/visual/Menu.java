/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controlador.ControladorSumaMouse;
import controlador.ControladorSuma2Mouse;
import controlador.ControladorWindows;
import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame {
    
    ControladorSumaMouse controladorSumaMouse = new ControladorSumaMouse();
    ControladorSuma2Mouse controladorSuma2Mouse = new ControladorSuma2Mouse();
    ControladorWindows controladorwindows = new ControladorWindows();
    GridLayout contenedor = new GridLayout(0,2);
    
    public Menu() {
        this.setSize(300, 300);
        this.setTitle("Menu");
        this.setLocation(100, 100);
        this.addWindowListener(controladorwindows);
        this.setLayout(contenedor);
        this.AgregarComponente();
    }
    public void AgregarComponente() {
        JButton suma1 = new JButton();
        suma1.setName("Suma1");
        suma1.setText("Suma1");
        suma1.setVisible(true);
        
        suma1.addMouseListener(controladorSumaMouse);
        
        JButton suma2 = new JButton();
        suma2.setName("Suma2");
        suma2.setText("Suma2");
        suma2.setVisible(true);
        
        this.add(suma1);
        this.add(suma2);
        this.setVisible(true);  
    }
}