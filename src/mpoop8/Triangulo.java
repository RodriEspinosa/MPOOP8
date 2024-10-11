/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop8;

/**
 *Clase que crea unn triangulo, siendo una extension de la clase abstracta de 
 * poligono
 * Esta clase incluye métodos para calcular el área y el perimetro de un 
 * triangulo 
 * @author joser
 * @version 1.0
 */
public class Triangulo extends Poligono {
    private int alfa, beta, gamma;
    private float a,b,c;
    private float base, altura;

    /**
     * Constructor Vacio
     * crea un triangulo sin valores inciales 
     */
    public Triangulo(){
    }
    
    /**
     * Constructor lleno
     * @param alfa
     * @param beta
     * @param gamma
     * @param a
     * @param b
     * @param c
     * @param base
     * @param altura 
     */
    public Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    
    //Getters y Setters
    
    /**
     * 
     * @return el angulo alfa  
     */
    public int getAlfa() {
        return alfa;
    }
    /**
     * 
     * @param alfa regresa su valor 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
     * 
     * @return el angulo beta 
     */
    public int getBeta() {
        return beta;
    }
    /**
     * 
     * @param beta regresa el valor  
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * 
     * @return el angulo gamma 
     */
    public int getGamma() {
        return gamma;
    }
    /**
     * 
     * @param gamma regresa su valor 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    //METODOS SOBREESCRITOS
    @Override
    public float area (){
        return (base*altura)/2;
    }
    
    @Override
    public float perimetro(){
        return a+b+c;
    }
    
    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
}
