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

public class CadastroLugarController implements Initializable{

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button btnConfirmarLugar;

    @FXML
    private Button btnVoltar3;

    @FXML
    private TextField campoCidade;

    @FXML
    private ChoiceBox<String> campoLingua;

    @FXML
    private ChoiceBox<String> campoObjetivo;

    @FXML
    private TextField campoPais;

    @FXML
    private TableColumn<Lugar, String> cidade;

    @FXML
    private TableColumn<Lugar, String> lingua;

    @FXML
    private TableColumn<Lugar, String> objetivo;

    @FXML
    private TableColumn<Lugar, String> pais;

    @FXML
    private TableView<Lugar> tabelaLugar;

    ObservableList<String> objetivos = FXCollections.observableArrayList("Trabalho", "Praia", "Museu", "Turismo", "Família", "Estudo", "Outro");

    ObservableList<String> linguas = FXCollections.observableArrayList("Português", "Inglês", "Alemão", "Japonês", "Espanhol", "Francês", "Outro");

    ObservableList<Lugar> listaLugar = FXCollections.observableArrayList();

    @FXML
    void confirmarLugar(ActionEvent event) {
        String cidade = campoCidade.getText();
        String pais = campoPais.getText();
        String objetivo = campoObjetivo.getValue();
        String lingua = campoLingua.getValue();

        Lugar lugar = new Lugar(cidade, pais, objetivo, lingua);
        listaLugar.add(lugar);
    }

    @FXML
    void voltarLugar(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("organizador_menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Organize Sua Viagem");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        cidade.setCellValueFactory(new PropertyValueFactory<Lugar, String>("cidade"));
        pais.setCellValueFactory(new PropertyValueFactory<Lugar, String>("pais"));
        objetivo.setCellValueFactory(new PropertyValueFactory<Lugar, String>("objetivo"));
        lingua.setCellValueFactory(new PropertyValueFactory<Lugar, String>("lingua"));

        tabelaLugar.setItems(listaLugar);

        campoObjetivo.setValue("Trabalho");
        campoObjetivo.setItems(objetivos);

        campoLingua.setValue("Português");
        campoLingua.setItems(linguas);
    }

}
