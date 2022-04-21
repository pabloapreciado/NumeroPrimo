/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;

import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        //Variables 
        int numero,i=1,d=0;
        //Ingresar Datos
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
        while(i<=numero)
        {
            //Contando Divisores
            if(numero % i == 0)
            {
                d++;
            }
            i++;
        }
        //Verificando 
        if(d==2)
        {
            JOptionPane.showMessageDialog(null,("El numero "+ numero +" es Primo"));
        }
        else
        {
            JOptionPane.showMessageDialog(null,("El numero "+ numero + " no es primo"));
        }
        
        //Fin
        System.exit(0);
    }
    
}