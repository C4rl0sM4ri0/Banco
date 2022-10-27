/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carlos Hack
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
            Banco_Ventana ventana= new Banco_Ventana();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
            ventana.setResizable(false);
    }
    
}
