package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class Main extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);

        Controller controller = loader.getController();

        stage.setTitle("Calculator");
        stage.setResizable(false);
        stage.setOnCloseRequest(e ->
        {
            e.consume();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);


            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("Are you sure you want to exit?");
            alert.setContentText("Are you ok with this?");


            if (alert.showAndWait().get() == ButtonType.OK)
            {
                stage.close();
            }
        });


        scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());

        scene.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent event)
            {
//                controller.keyEvent(event);
                System.out.printf("%s\n", event.getCode());
            }
        });

        Image image = new Image(getClass().getResourceAsStream("icon.png"));
        stage.getIcons().add(image);

        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}





