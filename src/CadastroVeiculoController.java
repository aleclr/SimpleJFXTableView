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

public class CadastroVeiculoController implements Initializable{

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button btnConfirmarVeiculo;

    @FXML
    private Button btnVoltar1;

    @FXML
    private TextField campoCor;

    @FXML
    private TextField campoMarca;

    @FXML
    private TextField campoPlaca;

    @FXML
    private ChoiceBox<String> campoTipo;

    @FXML
    private TableView<Veiculo> tabelaVeiculos;

    @FXML
    private TableColumn<Veiculo, String> cor;

    @FXML
    private TableColumn<Veiculo, String> marca;

    @FXML
    private TableColumn<Veiculo, String> placa;

    @FXML
    private TableColumn<Veiculo, String> tipo;

    @FXML
    void confirmarVeiculo(ActionEvent event) {
        String tipo = campoTipo.getValue();
        String cor = campoCor.getText();
        String marca = campoMarca.getText();
        String placa = campoPlaca.getText();

        Veiculo veiculo = new Veiculo(tipo, cor, marca, placa);
        listaVeiculos.add(veiculo);
    }

    @FXML
    void voltarVeiculo(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("organizador_menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Organize Sua Viagem");
        stage.setScene(scene);
        stage.show();
    }

    ObservableList<String> tipos = FXCollections.observableArrayList("Carro", "Ônibus", "Trem", "Avião");

    ObservableList<Veiculo> listaVeiculos = FXCollections.observableArrayList();


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        tipo.setCellValueFactory(new PropertyValueFactory<Veiculo, String>("tipo"));
        cor.setCellValueFactory(new PropertyValueFactory<Veiculo, String>("cor"));
        marca.setCellValueFactory(new PropertyValueFactory<Veiculo, String>("marca"));
        placa.setCellValueFactory(new PropertyValueFactory<Veiculo, String>("placa"));

        tabelaVeiculos.setItems(listaVeiculos);

        campoTipo.setValue("Carro");
        campoTipo.setItems(tipos);
    }

}
