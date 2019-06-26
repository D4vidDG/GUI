/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.de.información;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class SistemasDeInformación extends Application{
private TextField tnombre;
private TextField tapellido;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Organizacion de elementos
        VBox layoutPrincipal =new VBox();
        HBox layoutFila1=new HBox();
        HBox layoutFila2=new HBox();
        //Labels
        Label lnombre=new Label ("Nombre");
        Label lapellido=new Label ("Apellido");
        //Texto
        this.tnombre=new TextField();
        this.tapellido=new TextField();
        layoutFila1.getChildren().add(lnombre);
        layoutFila1.getChildren().add(tnombre);
        layoutFila2.getChildren().add(lapellido);
        layoutFila2.getChildren().add(tapellido);
        layoutPrincipal.getChildren().add(layoutFila1);
        layoutPrincipal.getChildren().add(layoutFila2);
        //Toggle
        ToggleGroup genero = new ToggleGroup();
        RadioButton masculino=new RadioButton("Masculino");
        RadioButton femenino=new RadioButton("Femenino");
        RadioButton otro=new RadioButton("Otro");
        masculino.setToggleGroup(genero);
        femenino.setToggleGroup(genero);
        otro.setToggleGroup(genero);
        layoutPrincipal.getChildren().add(masculino);
        layoutPrincipal.getChildren().add(femenino);
        layoutPrincipal.getChildren().add(otro);
        //Botones
        Button b1=new Button("Ver");
        layoutPrincipal.getChildren().add(b1);
        //Tablas
        TableView tabla1=new TableView();
        tabla1.setEditable(true);
        TableColumn nombres=new TableColumn("Nombre");
        TableColumn apellidos=new TableColumn("Apellido");
        TableColumn generos=new TableColumn("Genero");
        TableColumn emails=new TableColumn("Email");
        tabla1.getColumns().addAll(nombres,apellidos,emails,generos);
        layoutPrincipal.getChildren().add(tabla1);
        ActionEvent t=new ActionEvent();
        //Evento
        b1.setOnAction(new Evento());
        
        Scene scene = new Scene (layoutPrincipal,200,250);
        stage.setTitle("Sistemas de informacion");
        stage.setScene(scene);
        stage.show();
        
       
    }
    
    //Clases internas y Eventos
     private class Evento implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent t) {
        System.out.println(tnombre.getText());
        }
   
}


    }
    

