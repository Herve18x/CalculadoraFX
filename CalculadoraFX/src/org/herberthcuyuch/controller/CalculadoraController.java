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
    private String decimal = "";
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
            }else if (!operador.equals("√")){
                n2 += entrada;
            }else {
                n2 = "";
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
            }else if (entrada.equals("÷")){
                operador = entrada; 
                actualizarPantalla(pantalla);
            }else if (entrada.equals("√")){
                operador = entrada; 
                n1 = resultadoRaiz(n1);
                actualizarPantalla(pantalla);
            }else if (entrada.equals("x²")){
                operador = entrada;
                actualizarPantalla(pantalla);
            }else if (entrada.equals(".")){
            if (operador.isEmpty()) {

                // El punto pertenece a n1
                if (!n1.contains(".")) {
                    if (n1.isEmpty()) {
                        n1 = "0.";
                    } else {
                        n1 += ".";
                    }
                }
            } else {

                // El punto pertenece a n2
                if (!n2.contains(".")) {
                    if (n2.isEmpty()) {
                        n2 = "0.";
                    } else {
                        n2 += ".";
                    }
                }
            }
                actualizarPantalla(pantalla);
            }else if (entrada.equals("=")){
            switch (operador) {
                case "+":
                    n1 = resultadoSuma(n1, n2);
                    operador = "";
                    n2 = "";
                    calucloTerminado = true;
                    actualizarPantalla(pantalla);
                    break; 
                case "-":
                    n1 = resultadoResta(n1, n2);
                    operador = "";
                    n2 = "";
                    actualizarPantalla(pantalla);
                    break;
                case "x":
                    n1 = resultadoMultiplicacion(n1, n2);
                    operador = "";
                    n2 = "";
                    actualizarPantalla(pantalla);
                    break;
                case "÷":
                    n1 = resultadoDivision(n1, n2);
                    operador = "";
                    n2 = "";
                    actualizarPantalla(pantalla);
                    break;
                case "x²":
                    n1 = resultadoPotencia(n1, n2);
                    operador = "";
                    n2 = "";
                    actualizarPantalla(pantalla);
                    break;       
                default:
                    break;
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
        double datoUno = Double.parseDouble(n1);
        double datoDos = Double.parseDouble(n2);
        double suma = datoUno + datoDos;
        return resultado = String.valueOf(suma);
    }
    private String resultadoResta(String numeroUno, String numeroDos){
        String resultado; 
        double datoUno = Double.parseDouble(n1);
        double datoDos = Double.parseDouble(n2);
        double resta = datoUno - datoDos;
        return resultado = String.valueOf(resta);
    }
    private String resultadoMultiplicacion (String numeroUno, String numeroDos) {
        String resultado;
        double datoUno = Double.parseDouble(n1);
        double datoDos = Double.parseDouble(n2);
        double multiplicacion = datoUno * datoDos;
        return resultado = String.valueOf(multiplicacion);
    }
    private String resultadoDivision (String numeroUno, String numeroDos) {
        String resultado;
        double datoUno = Double.parseDouble(n1);
        double datoDos = Double.parseDouble(n2);
        double division = datoUno / datoDos;
        return resultado = String.valueOf(division);
    }
    private String resultadoRaiz (String numeroUno) {
        String resultado; 
        double datoUno = Double.parseDouble(n1);
        double raiz = Math.sqrt(datoUno);
        return resultado = String.valueOf(raiz);
    }
    private String resultadoPotencia (String numeroUno, String numeroDos) {
        String resultado; 
        double datoUno = Double.parseDouble(n1);
        double datoDos = Double.parseDouble(n2); 
        double potencia = Math.pow(datoUno, datoDos);
        return resultado = String.valueOf(potencia);
    }
}

