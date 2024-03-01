/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraparajugarxd;



/**
 *
 * @author 97114
 */
import javax.swing.JOptionPane;
public class OperacionesXD {
    //Atributos

    int suma;
    int resta;
    int multiplicacion;
    int Division;
    
    //Metodos
    

    //Metodo de suma
    
    public void sumar(int numero1, int numero2){
        suma=numero1+numero2;
    }
    //Metodo de resta
    
    public void resta(int numero1, int numero2){
        resta=numero1-numero2;
    }
    //Metodo de multiplicacion
    public void multiplicacion(int numero1, int numero2){
        multiplicacion= numero1*numero2;
    }
    //Metodo de Division
    public void Division(int numero1, int numero2){
        Division=numero1/numero2;
    }
    
    public void mostrarResultado(){
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicacion es "+multiplicacion);
        System.out.println("La division es "+Division);
    }
            
} 
    

