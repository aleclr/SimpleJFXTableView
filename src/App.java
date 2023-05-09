import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {


    public static void main(String[] args) throws Exception {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("organizador_menu.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        // String css = this.getClass().getResource("style.css").toExternalForm();
        // tela.getStylesheets().add(css);
        tela.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setTitle("Organize Sua Viagem");
        stage.setScene(tela);
        stage.show();
    };
}
