/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.factura;

/**
 *
 * @author marle
 */
public class Factura {
    public int ValorLista;
    public Factura ArticuloSiguiente;
    int i=0;
    
    public Factura(int VALOR){
        this.ValorLista=VALOR;
    }
    public Factura(int VALOR, Factura f){
        ValorLista=VALOR;
        ArticuloSiguiente=f;
    }
    /*public void Factura() {
        this.ValorLista=0;
        this.ArticuloSiguiente=null;
    }*/
    
    public int getValorLista() {
        return ValorLista;
    }

    public void setValorLista(int ValorLista) {
        this.ValorLista = ValorLista;
    }

    public Factura getArticuloSiguiente() {
        return ArticuloSiguiente;
    }

    public void setArticuloSiguiente(Factura ArticuloSiguiente) {
        this.ArticuloSiguiente = ArticuloSiguiente;
    }

    
    Lista L=new Lista();
    private Articulo AR;
    public Factura(){
        AR=new Articulo();
    }

    public Articulo getAR() {
        return AR;
    }

    public void setAR(Articulo AR) {
        this.AR = AR;
    }
    
    /*public void AgregarArticulo(Articulo AR){
        for(int i=0;i<this.AR.length;i++){
            if(this.AR==null){
                this.AR=AR;
                System.out.println("Agregado");
                return true;
            }
            
        }//System.out.println("NO AGREGADOR");
        //return false;
    }*/
    public void Agregar(Articulo AR){
        L.Agregar(AR);
    }
}
