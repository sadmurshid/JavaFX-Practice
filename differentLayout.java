/**
 * Created by Murshid on 7/4/2017.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class differentLayout extends Application {

    Stage window;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        window=primaryStage;
        window.setTitle("VBox,HBox");

        HBox top=new HBox();
        Button HHome=new Button("Home");
        Button HBlueSheet=new Button("Blue Sheet");
        Button HAccount=new Button("Account");
        top.getChildren().addAll(HHome,HBlueSheet,HAccount);

        //       HHome.setMaxSize(160,20);
        //       HBlueSheet.setMaxSize(120,20);
        //       HAccount.setMaxSize(120,20);
        HHome.setMinSize(100,25);
        HBlueSheet.setMinSize(100,25);
        HAccount.setMinSize(100,25);



        VBox left=new VBox();
        Button LProfile=new Button("Profile");
        Button LBio=new Button("Bio");
        Button LClass=new Button("Class Teacher");
        Button LSubjectTeacher=new Button("Subject Teacher");
        Button LRoutine=new Button("Class Routine");
        left.getChildren().addAll(LProfile,LBio,LClass, LSubjectTeacher, LRoutine);

        LProfile.setMaxSize(120,20);
        LBio.setMaxSize(120,20);
        LClass.setMaxSize(120,20);
        LSubjectTeacher.setMaxSize(120,20);
        LRoutine.setMaxSize(120,20);

        LProfile.setOnAction(e -> {
            try {
                new listView();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });




        HBox bot=new HBox();
        Button BA=new Button("J");
        Button BB=new Button("K");
        Button BC=new Button("L");
        bot.getChildren().addAll(BA,BB,BC);

//        Image image=new Image("file:e:/Backtrack-Coding-HD-Wallpaper.jpg");
//        BackgroundImage bi=new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
//        Background back=new Background(bi);


        BorderPane bp=new BorderPane();
        bp.setTop(top);
        bp.setLeft(left);
//        bp.setCenter(center);
        bp.setBottom(bot);
        bp.setStyle("-fx-background-image: url(\"file:e:/Backtrack-Coding-HD-Wallpaper.jpg\")");


        Scene sce=new Scene(bp, 1000,700);
        window.setScene(sce);
        window.show();


    }
}
