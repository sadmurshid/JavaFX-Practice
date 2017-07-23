/**
 * Created by Murshid on 7/4/2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.logging.Level;

public class userLogIn extends Application {

    Stage window;
    private static String str;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("User Log In Page");

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(50, 50, 50, 50));
        gp.setVgap(8);
        gp.setHgap(12);

        //Name Label
        Label name = new Label("User Name");
        GridPane.setConstraints(name, 0, 0);

        //Name input
        TextField nameIn = new TextField();
        nameIn.setPromptText("User name");
        GridPane.setConstraints(nameIn, 1, 0);

        //Password label
        Label pass = new Label("Password");
        GridPane.setConstraints(pass, 0, 1);

        //Password TextField
        TextField passIn = new TextField();
        passIn.setPromptText("Password");
        GridPane.setConstraints(passIn, 1, 1);


        Button but = new Button("LOG IN");
        but.setOnAction((ActionEvent e) -> {
            if(isValid(nameIn))
                System.out.println(nameIn.getText());
            else
                System.out.println("Invalid Username");
        });

        GridPane.setConstraints(but, 1, 2);

        gp.getChildren().addAll(name, nameIn, pass, passIn, but);

        Scene sce = new Scene(gp);

        window.setScene(sce);
        window.show();


    }


    private boolean isValid(TextField in) {
        try{
            String str=in.getText();
            boolean boo=false;
            for(int i=0; i<str.length(); i++)
            {
                char c=str.charAt(i);
                if((int)str.charAt(i)<48||(int)str.charAt(i)>123)
                {
                    boo=false;
                    System.out.println("Invalid Character '"+c+"' found");
                    return false;
                }
                else
                    boo=true;
            }
            return boo;

        }catch(Exception e){
            System.out.println(e);
            return false;
        }


    }
}