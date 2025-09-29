package co.edu.uniquindio.poo.app;
import co.edu.uniquindio.poo.model.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) {

        CuentaAhorro cuenta1= new CuentaAhorro(20000,0.1f,true);
        
        cuenta1.consignar(5000);
        cuenta1.retirar(1000);
        cuenta1.extractoMensual();
        JOptionPane.showMessageDialog(null,cuenta1.toString());
    
    
    
    
    
    }
}
