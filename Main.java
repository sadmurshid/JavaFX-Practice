
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Murshid on 6/4/2017.
 */
public abstract class Main extends Application
{
    Stage window;
    Button button;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window=primaryStage;
        window.setTitle("Nice");
        button=new Button("Click");
        try {
            button.setOnAction(e -> {
                try {
                    new listView();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            });
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        Scene scene =new Scene(layout, 300,200);

        window.setScene(scene);
        window.show();



    }
}
