/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class GUI_con_Interfaces extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Application.launch(args);
    }
    @Override
     public void start(Stage stage) throws Exception {
        Image fondo=new Image("/Imagenes/fondo.png");
        VBox layoutPrincipal =new VBox();
        Canvas tablero=new Canvas(300,300);
        layoutPrincipal.getChildren().add(tablero);
        GraphicsContext lapiz=tablero.getGraphicsContext2D();
        HBox layoutFila1=new HBox();
        HBox layoutFila2=new HBox();
        layoutPrincipal.getChildren().add(layoutFila1);
        layoutPrincipal.getChildren().add(layoutFila2);
        lapiz.drawImage(fondo, 0, 0);
        Button b1=new Button("Adelante");
        Button b2=new Button("Atras");
        layoutFila1.getChildren().add(b1);
        layoutFila1.getChildren().add(b2);
        Scene scene = new Scene (layoutPrincipal,200,250);
        stage.setTitle("Sistemas de informacion");
        stage.setScene(scene);
        stage.show();
        
    }
    
}
