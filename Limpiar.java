/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos1;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Héctor
 */
public class Limpiar {
        public void limpiarFormulario(JPanel jpanel){
        for(int i=0;jpanel.getComponents().length>i;i++){
            if(jpanel.getComponents()[i]instanceof JTextField){
                ((JTextField)jpanel.getComponents()[i]).setText("");
            }
            else if(jpanel.getComponents()[i]instanceof JPasswordField){
                ((JPasswordField)jpanel.getComponents()[i]).setText("");
            }
        }
    }
}


