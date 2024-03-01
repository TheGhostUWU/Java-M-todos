/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraparajugarxd;
import javax.swing.JOptionPane;
/**
 *
 * @author 97114
 */


public class CalculadoraParaJugarXD {
    
public static void main(String[] args){
    int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita un num1:"));
    int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita un num2:"));

    
        OperacionesXD op=new OperacionesXD();
        op.sumar(n1, n2);
        op.resta(n1, n2);
        op.multiplicacion(n1, n2);
        op.Division(n1, n2);
        op.mostrarResultado();
        
    }
} 
