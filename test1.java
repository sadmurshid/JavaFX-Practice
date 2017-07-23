/**
 * Created by Murshid on 6/10/2017.
 *
 * Change the scene one to another
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class test1 extends Application {
    Stage window;
    Scene scene1, scene2;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window =primaryStage;

        //Button1 Action
        Label label=new Label("Scene 1");
        Button button1=new Button("Click to go Scene2");
        button1.setOnAction(event -> window.setScene(scene2));

        //Layout1 Action
        VBox layout1=new VBox(20);
        layout1.getChildren().addAll(label, button1);
        scene1=new Scene(layout1, 300,300);

        //Button2 Action
        Button button2=new Button("Go to Scene1");
        //button2.setOnAction(event -> window.setScene(scene1));
        button2.setOnAction(event ->new testAlartBox().alart("Alart", "click to go back"));



                //Layout2 Action
        StackPane layout2=new StackPane();
        layout2.getChildren().add(button2);
        scene2=new Scene(layout2, 500,600);

        //Display Scene 1 first
        window.setScene(scene1);
        window.setTitle("HI");
        window.show();


    }
}
