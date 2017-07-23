/**
 * Created by Murshid on 6/4/2017.
 */

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class test extends Application implements EventHandler<ActionEvent>
{
    Stage win;
    private Button but, but2, but3, but4, but5, but6, but7, but8, but9, but10 ;
    private final IntegerProperty value = new SimpleIntegerProperty();
    private TextField text;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane grid=new GridPane();
        text=new TextField();

        win =primaryStage;
        win.setTitle("Calpulator");
        but=new Button("0");
        but2=new Button("1");
        but3=new Button("2");
        but4=new Button("3");
        but5=new Button("4");
        but6=new Button("5");
        but7=new Button("6");
        but8=new Button("7");
        but9=new Button("8");
        but10=new Button("9");


        but.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        but2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        but3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        but4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        but5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        but6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        but7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        but8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        but9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        but10.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);


        grid.add(but, 0,3);
        but.setPrefWidth(25);
        but.setPrefHeight(25);
        grid.add(but2, 0,2);
        grid.add(but3, 1,2);
        grid.add(but4, 2,2);
        grid.add(but5, 0,1);
        grid.add(but6, 1,1);
        grid.add(but7, 2,1);
        grid.add(but8, 0,0);
        grid.add(but9, 1,0);
        grid.add(but10, 2,0);

        but.setOnAction(this);
        but2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(1);
            }
        });
        but3.setOnAction(event -> System.out.println(2));
        but4.setOnAction(this);
        but5.setOnAction(this);
        but6.setOnAction(this);
        but7.setOnAction(this);
        but8.setOnAction(this);
        but9.setOnAction(this);
        but10.setOnAction(this);

        BorderPane border=new BorderPane();

        text.textProperty().bind(Bindings.format("%d", value));
        text.setEditable(false);
        text.setAlignment(Pos.CENTER_RIGHT);

        border.setPadding(new Insets(20));
        border.setTop(text);
        border.setCenter(grid);


     //   StackPane layout=new StackPane();
     //   layout.getChildren().addAll(but, but2);
        Scene sce=new Scene(border, 300,300);

        primaryStage.setScene(sce);
        primaryStage.setResizable(true);
        primaryStage.show();


    }

    @Override
    public void handle(ActionEvent event) {
        //System.out.println(0);
        if (event.getSource()==but) {
            text.setText("0");
        }
        else if (event.getSource()==but2)
        {
            System.out.println(1);
        }
        else if (event.getSource()==but3)
        {
            System.out.println(2);
        }
        else if (event.getSource()==but4) {
            System.out.println(3);
        }
        else if (event.getSource()==but5){
            System.out.println(4);
        }
        else if (event.getSource()==but6){
            System.out.println(5);
        }
        else if (event.getSource()==but7){
            System.out.println(6);
        }
        else if (event.getSource()==but8){
            System.out.println(7);
        }
        else if (event.getSource()==but9){
            System.out.println(8);
        }
        else if (event.getSource()==but10){
            System.out.println(9);
        }
    }

    public test() {
        super();
    }
}
