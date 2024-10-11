/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop8;

/**
 *
 * @author joser
 * @version 1.0
 */
public class InstrumentoDeViento extends Object implements InstrumentoMusical {
    
    public InstrumentoDeViento() {
        /**
         * Constructor vacio 
         */
    }

    
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento Musical");
    }
    /**
     * 
     * @return una cadena que indica que es un isntrumento de viento 
     */
    @Override
    public String tipoDeInstrumento() {
        System.out.println("");
        return "Instrumento de Viento";
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Instrumento de viento");
    }
    /**
     * @return una cadena que representa un instrumento de viento  
     */
    @Override
    public String toString() {
        return "InstrumentoDeViento{" + '}';
    }
    
}
