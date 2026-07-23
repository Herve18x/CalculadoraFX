/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.herberthcuyuch.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.herberthcuyuch.controller.CalculadoraController;
 
public class CalculadoraView {
    private VBox view; 
    private Label pantalla; 
    private GridPane cuadroBotones; 
    //controller
    private CalculadoraController controlador; 
    
    
    
    public CalculadoraView() {
        controlador = new CalculadoraController();
        
        view = new VBox(15); 
        view.setPadding(new Insets(15)); 
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #D1ADBE;"); 
        
        pantalla = new Label("0");
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT); 
        pantalla.setPrefSize(235, 50); 
        pantalla.setStyle("-fx-background-color: #FFFFFF");
        
        cuadroBotones = new GridPane(); 
        cuadroBotones.setHgap(10);//Interlineado entre elementos de la cuadricula
        cuadroBotones.setVgap(10);
        cuadroBotones.setAlignment(Pos.CENTER);//Alineado al centro

        //Creacion de botones
        //Quinta Fila
        Button btnRaiz = crearBoton("√");
        Button btnPotencia = crearBoton("x²");
        Button btnBorrar = crearBoton("⌫");
        Button btnDividir = crearBoton ("÷");
        
        //Cuarta Fila
        Button btnCuatro = crearBoton("4");
        Button btnCinco = crearBoton("5");
        Button btnSeis = crearBoton("6");
        Button btnResta = crearBoton("-");
        
        //Tercera Fila
        Button btnSiete = crearBoton("7");
        Button btnOcho = crearBoton("8");
        Button btnNueve = crearBoton("9");
        Button btnMultiplicacion = crearBoton("x");
        
        //Segunda Fila
        Button btnUno = crearBoton("1");
        Button btnDos = crearBoton("2");
        Button btnTres = crearBoton("3");
        Button btnSuma = crearBoton("+");
        
        //Primera Fila
        Button btnCero = crearBoton("0");
        Button btnPunto = crearBoton(".");
        Button btnIgual = crearBoton("=");
        Button btnClear = crearBoton ("C");
        
        //Posicion de botones
        //Primera fila
        cuadroBotones.add(btnClear, 0, 5);
        cuadroBotones.add(btnCero, 1, 5);
        cuadroBotones.add(btnPunto, 2, 5);
        cuadroBotones.add(btnIgual, 3, 5);
        
        //Segunda Fila
        cuadroBotones.add(btnUno, 0, 4);
        cuadroBotones.add(btnDos, 1, 4);
        cuadroBotones.add(btnTres, 2, 4);
        cuadroBotones.add(btnSuma, 3, 4);
        
        //Tercera Fila
        cuadroBotones.add(btnCuatro, 0, 3);
        cuadroBotones.add(btnCinco, 1, 3);
        cuadroBotones.add(btnSeis, 2, 3);
        cuadroBotones.add(btnResta, 3, 3);
        
        //Cuarta Fila
        cuadroBotones.add(btnSiete, 0, 2);
        cuadroBotones.add(btnOcho, 1, 2);
        cuadroBotones.add(btnNueve, 2, 2);
        cuadroBotones.add(btnMultiplicacion, 3, 2);
       
        //Quinta 
        cuadroBotones.add(btnDividir, 2, 1);
        cuadroBotones.add(btnRaiz, 0, 1);
        cuadroBotones.add(btnPotencia, 1, 1);
        cuadroBotones.add(btnBorrar, 3, 1);
        view.getChildren().addAll(pantalla, cuadroBotones); 
    }
    public VBox getView() {
        return view; 

    }
        public Button crearBoton(String bType){
                
        Button btn = new Button(bType);
        btn.setPrefSize(50, 50);
        
        btn.setStyle("-fx-background-color: #B4C3FF; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
        btn.setOnMousePressed(e -> {
        btn.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:white; -ft-background-radops:5px");
        btn.setTranslateY(2);
        });
        
        btn.setOnMouseReleased(e -> {
            btn.setStyle("-fx-background-color: #B4C3FF; -fx-text-fill:white; -ft-background-radops:5px");
            btn.setTranslateY(0);
        });
                
        
        btn.setOnAction(e ->
            controlador.procesoDeEntrada(bType, pantalla)
        );

        return btn;

    }
        
}
