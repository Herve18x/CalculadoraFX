/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.herberthcuyuch.systen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.herberthcuyuch.view.CalculadoraView;
 
public class Main extends Application {
 
 
    public static void main(String[] args) {   
        System.out.println("Hola mundo, esta es mi calculadora en JavaFX"); 
        launch(args); 
    }
 
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        //vista de la calculadora 
        CalculadoraView calculadora = new CalculadoraView(); 
        //nodos
        Pane raiz = new Pane(calculadora.getView());
        //escena(nodoRaiz, ancho, largo)
        Scene escena = new Scene(raiz, 266, 390); 
        //cargar escena y mostrar escenario principal
        escenarioPrincipal.setTitle("Calculadora de Diego");
        escenarioPrincipal.setScene(escena); 
        escenarioPrincipal.show();
    }
}

 

 

 
