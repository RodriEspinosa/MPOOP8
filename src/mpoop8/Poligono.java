/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop8;

/**
 *  Clase abstracta que crea un poligono
 * Esta clase define las carcateristicas de un poligono y de las clases
 * derivadas proporciona los métodos.
 * 
 * @author joser
 * @version 1.0
 */
public abstract class Poligono {
    /*
    * Constructor del poligono que extiende a las otras clases derivadas de esta
    */
        public Poligono() {
    }
    
    /*
    public float area(){
        return 0.0f;
    }
    
    public float perimetro(){
        return 0.0f;
    }    
    */
        
    /*
    * @return el valor del area del poligono
    */
    public abstract float area();
    /*
    *@return el perimetro del poligno 
    */
    public abstract float perimetro();
    
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
