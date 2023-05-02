import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OrganizadorMenuController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button btnCadastrarLugar;

    @FXML
    private Button btnCadastrarPessoa;

    @FXML
    private Button btnCadastrarVeiculo;

    @FXML
    void switchToCadastrarLugar(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("cadastro_lugar.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Organize Sua Viagem");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void switchToCadastrarPessoa(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("cadastro_pessoa.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Organize Sua Viagem");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void switchToCadastrarVeiculo(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("cadastro_veiculo.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Organize Sua Viagem");
        stage.setScene(scene);
        stage.show();
    }

}
