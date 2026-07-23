/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.herberthcuyuch.controller;

import javafx.scene.control.Label;

/**
 *
 * @author informatica
 */
public class CalculadoraController {
    
    private String n1 = "";
    private String operador = "";
    private String n2 = "";
   private boolean calucloTerminado = true;
    
    public CalculadoraController(){
        
    }
    public void procesoDeEntrada(String entrada, Label pantalla){
        if (entrada.equals("C")){
            n1 = "";
            operador = "";
            n2 = "";
        }
        actualizarPantalla(pantalla);
        if (entrada.matches("[0-9]")) {
            if (operador.isEmpty()) {
                n1 += entrada;
            }else {
                n2 += entrada;
            }
            actualizarPantalla(pantalla);
            }else if (entrada.equals("+")){
                operador = entrada; 
                actualizarPantalla(pantalla);
            }else if (entrada.equals("-")){
                operador = entrada;
                actualizarPantalla(pantalla);
            }else if (entrada.equals("x")){
                operador = entrada;
                actualizarPantalla(pantalla);
            }else if (entrada.equals("=")){
                if (operador.equals("+")){
                    n1 = resultadoSuma(n1, n2);
                    operador = "";
                    n2 = "";
                    calucloTerminado = true;
                actualizarPantalla(pantalla);
                }else if (operador.equals("-")){ 
                    n1 = resultadoResta(n1, n2);
                    operador = "";
                    n2 = "";
                    actualizarPantalla(pantalla);
                
                }else if (operador.equals("x")) {
                    n1 = resultadoMultiplicacion(n1, n2);
                    operador = "";
                    n2 = "";
                    actualizarPantalla(pantalla);
                }
                
                
            }
        }
    private void actualizarPantalla(Label pantalla){
        if (operador.isEmpty()){
            pantalla.setText(n1);
        }else {
            pantalla.setText(n1 + "" + operador + "" + n2);
        }
    }
    private String resultadoSuma(String numeroUno, String  numeroDos){
        String resultado;
        int datoUno = Integer.parseInt(n1);
        int datoDos = Integer.parseInt(n2);
        int suma = datoUno + datoDos;
        return resultado = String.valueOf(suma);
    }
    private String resultadoResta(String numeroUno, String numeroDos){
        String resultado; 
        int datoUno = Integer.parseInt(n1);
        int datoDos = Integer.parseInt(n2);
        int resta = datoUno - datoDos;
        return resultado = String.valueOf(resta);
    }
    private String resultadoMultiplicacion (String numeroUno, String numeroDos) {
        String resultado;
        int datoUno = Integer.parseInt(n1);
        int datoDos = Integer.parseInt(n2);
        int multiplicacion = datoUno * datoDos;
        return resultado = String.valueOf(multiplicacion);
        
    }
}
