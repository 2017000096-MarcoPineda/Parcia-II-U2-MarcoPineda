
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ConversorMonedas {
    public static void main (String[] args){
        
        String clave = JOptionPane.showInputDialog(null,
                "Ingrese la Contraseña",
                "Inicio de Sesion",
                JOptionPane.QUESTION_MESSAGE);
       if (clave != null &&clave.equals("Pineda123")) {
           
         JOptionPane.showMessageDialog(null,
                 "Bienvenido Estudiante",
                 "Acceso Correcto",
                 JOptionPane.INFORMATION_MESSAGE);
         
         jfrmConversor pine = new jfrmConversor();
         pine.setVisible(true);
    } else{
           JOptionPane.showMessageDialog(null,
                   "Contraseña Incorrecta. La ventana se va Cerrar",
                   "Acesso Denegado",
                   JOptionPane.ERROR_MESSAGE);
           System.exit(0);
       }
    }
}
