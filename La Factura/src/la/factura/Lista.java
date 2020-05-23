/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.factura;

import com.sun.javafx.scene.layout.region.Margins;

public class Lista {
    private Factura Inicio,fin;
    private int Tamaño;
    public void Lista(){
        Inicio=null;
        Tamaño=0;
        fin=null;
    }
    
    public boolean ListaVacia(){
        return Inicio==null;
    }
    
    public int getTamaño(){
        return Tamaño;
    }
    
    public void AgregarAlInicio(int valorElemento){
        // Define un nuevo nodo.
        Factura FAC = new Factura();;
        // Agrega al valor al nodo.
        FAC.setValorLista(valorElemento);
        // Consulta si la lista esta vacia.
        Inicio = new Factura(valorElemento,Inicio);
            if(fin==null){
                fin=Inicio;
            }
    }
    public void MostrarTodaLista(){
        Factura recorre=Inicio;
        System.out.println();
        while(recorre!=null){
            System.out.println("["+recorre.ValorLista+"]--->");
            recorre=recorre.ArticuloSiguiente;
        }
    }
        Articulo AR=new Articulo();
        public void Agregar(Articulo AR){
        
    }
 
}
