package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.text.html.ImageView;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("Calculator");
        stage.setResizable(false);

        stage.setOnCloseRequest(e ->
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("Are you sure you want to exit?");
            alert.setContentText("Are you ok with this?");
            if(alert.showAndWait().get() == ButtonType.OK)
            {
                stage.close();
            }
        });


        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());
        Controller controller = new Controller();

        Image image = new Image(getClass().getResourceAsStream("icon.png"));
        stage.getIcons().add(image);

        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
