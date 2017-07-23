/**
 * Created by Murshid on 6/11/2017.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;

public class testAlartBox  {

    Button [] but=new Button[10];



    public void alart(String title, String messege)
    {
        Stage window=new Stage();

        final URL resource=getClass().getResource("3613325882.mp3");
        final Media media=new Media(resource.toString());
        final MediaPlayer mediaPlayer=new MediaPlayer(media);
        mediaPlayer.play();

        //Block event for other window
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(300);

        Label label=new Label();
        label.setText(messege);
        Button button=new Button("Click to Close");
        button.setOnAction(event -> window.close());

        VBox layout=new VBox(20);
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);

        //Display window & wait for it to closed before returning
        Scene scene=new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}
