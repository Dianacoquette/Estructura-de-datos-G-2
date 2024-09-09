/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ciclosIterativos;

/**
 *
 * @author Dell
 */
public class Serie {
    private int n;
//constructor de manera implicita
    public Serie() {
        this.n = 1;
    }
                //parametro
    public Serie (int n){
        if(n<=0){
            this.n = 1;
        }else{
            this.n = n;
        }
    }
    //encapsular

    public int getN() {
        return n;
    }

        //validar en set
    public void setN(int n) {
         if(n<=0){
            this.n = 1;
        }else{
            this.n = n;
        }
    }
    //metodo de trabajo
    public double calcular(){
        //acumulador
        double r = 0.0;
        for (int i = 1; i <= n; i++) {
            r+=1.0/i;
        }
        return r;
    }
    @Override
    public String toString(){
        return "El resultado de la serie es: "+this.calcular();
    }
    
}
