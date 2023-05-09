import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.Node;

public class CadastroPessoaController implements Initializable{

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button btnConfirmarPessoa;

    @FXML
    private Button btnVoltar2;

    @FXML
    private TextField campoDestino;

    @FXML
    private TextField campoIdade;

    @FXML
    private TextField campoNome;

    @FXML
    private ChoiceBox<String> campoSexo;

    @FXML
    private TableColumn<Pessoa, String> destino;

    @FXML
    private TableColumn<Pessoa, String> idade;

    @FXML
    private TableColumn<Pessoa, String> nome;

    @FXML
    private TableColumn<Pessoa, String> sexo;

    @FXML
    private TableView<Pessoa> tabelaPessoas;

    ObservableList<String> sexos = FXCollections.observableArrayList("Masculino", "Feminino", "Prefiro não especificar");

    ObservableList<Pessoa> listaPessoas = FXCollections.observableArrayList();

    @FXML
    void confirmarPessoa(ActionEvent event) {
        String nome = campoNome.getText();
        String sexo = campoSexo.getValue();
        String idade = campoIdade.getText();
        String destino = campoDestino.getText();

        Pessoa pessoa = new Pessoa(nome, sexo, idade, destino);
        listaPessoas.add(pessoa);
    }

    @FXML
    void voltarPessoa(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("organizador_menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Organize Sua Viagem");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        nome.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("nome"));
        sexo.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("sexo"));
        idade.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("idade"));
        destino.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("destino"));

        tabelaPessoas.setItems(listaPessoas);

        campoSexo.setValue("Masculino");
        campoSexo.setItems(sexos);
    }

}
