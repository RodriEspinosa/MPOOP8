/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop8;

/**
 * Clase que representa a un cuadrilatero, que extienda a la clase poligono
 * que un cuadrilatero es un poligono de 4 lados
 * Permite calcular su area y perimetro
 * @author joser
 * @version 1.0
 */
public class Cuadrilatero extends Poligono {
    private int alfa, beta;
    private float a,b,c,d;
    private float base, altura;

    /**
     * Constructor vacìo.
     */
    public Cuadrilatero(){
    }
    /**
     * 
     * @param alfa su angulo 
     * @param beta su angulo 
     * @param a lado 
     * @param b lado 
     * @param c lado 
     * @param d lado 
     * @param base lado 
     * @param altura lado 
     */
    public Cuadrilatero(int alfa, int beta, float a, float b, float c, float d, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.base = base;
        this.altura = altura;
    }
    
    //Getters y Setters
    /**
    * @return alfa 
    */
    public int getAlfa() {
        return alfa;
    }
     /**
    *@param alfa regresa su valor 
    */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
    * @return beta
    */
    public int getBeta() {
        return beta;
    }
    /**
    *@param beta 
    */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
    * @return la longitud de lado a
    */
    public float getA() {
        return a;
    }
    /**
    * @param a 
    */
    public void setA(float a) {
        this.a = a;
    }
    /**
    @return la longitud de lado b 
    */
    public float getB() {
        return b;
    }
    /**
    *@param b 
    */
    public void setB(float b) {
        this.b = b;
    }
    /**
    *@return lado c 
    */
    public float getC() {
        return c;
    }
    /**
    * @param c 
    */
    public void setC(float c) {
        this.c = c;
    }
    /**
    *@return lado d 
    */
    public float getD() {
        return d;
    }
    /**
    * @param  d 
    */
    public void setD(float d) {
        this.d = d;
    }
    /**
    * @return longitud de la base 
    */
    public float getBase() {
        return base;
    }
    /**
     * 
     * @param  base 
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
    *@return altura 
    */
    public float getAltura() {
        return altura;
    }
    /**
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * @return  perimetro 
     */
    @Override
    public float perimetro() {
        return a+b+c+d; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public float area() {
        return base*altura; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    /**
     * 
     * @return cadena que representa a cuadrilatero  
     */
   
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", base=" + base + ", altura=" + altura + '}';
    }
}
