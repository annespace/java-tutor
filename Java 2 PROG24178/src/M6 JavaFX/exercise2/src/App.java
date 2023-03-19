import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

    public static void main(String[] args) throws Exception {
    /* This launch method is going to instantiate this class into an object.
    Also, it calls the start method. */
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("This is my first Java FX Application");
        Label label2 = new Label("Enter your name: ");
        TextField textfield1 = new TextField();
        Button button = new Button("Click");
        VBox layout = new VBox(20, label, label2, textfield1, button);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Learn JavaFX");
        primaryStage.show();
    }

}