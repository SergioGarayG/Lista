/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.factura;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author marle
 */
public class LaFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entr=new Scanner(System.in);
        Lista l=new Lista();
        int opcion=0,ELEMENTO;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar Un elemento al inicio\n2.Mostrar lista\n"
                        +"3. Salir","Menu",3));
                switch(opcion){
                    case 1:
                        try{
                            ELEMENTO=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el ELEMENTO:","Insertado en el Inicio",3));
                            //SE AGREGA EL NODO
                            l.AgregarAlInicio(ELEMENTO);
                        }catch(NumberFormatException a){
                            JOptionPane.showMessageDialog(null,"ERROR:"+a.getMessage());
                        }
                        break;
                    case 2:
                        l.MostrarTodaLista();;
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"SU OPCION ES INVALIDA");
                }
                
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"HUBO UN ERROR"+e.getMessage());
            }
        }while(opcion!=3);
    
    }
    
}
