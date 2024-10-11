/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop8;

/**
 *
 * @author joser
 * @
 */
public class Flauta  extends InstrumentoDeViento{
        public Flauta() {
            /**
             * constructor vacio 
             */
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Flauta");
    }
    /**
     * @return string que indica el tipo de isntrumento(flauta) 
     */
    @Override
    public String tipoDeInstrumento() {
        System.out.println("Flauta");
        return "Flauta";
    }
    /**
     * Imprime un mensaje indicado que se esta tocando la flauta 
     */
    @Override
    public void tocar() {
        System.out.println("Tocando Flauta");
    }
    /**
     * 
     * @return cadena que representa al objeto flauta 
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }

    
    
}
