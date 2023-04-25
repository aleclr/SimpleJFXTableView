import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class OrganizadorController implements Initializable{

    @FXML
    private Button btnConfirmar11;

    @FXML
    private TextField campoLocal;

    @FXML
    private TextField campoNome;

    @FXML
    private ChoiceBox<String> campoTrajeto;

    @FXML
    private ChoiceBox<String> campoVeiculo;

    @FXML
    private TableView<Viagem> tabelaViagens;

    @FXML
    private TableColumn<Viagem, String> nome;
    
    @FXML
    private TableColumn<Viagem, String> localizacao;

    @FXML
    private TableColumn<Viagem, String> veiculo;

    @FXML
    private TableColumn<Viagem, String> trajeto;

    // public String[] veiculos = {"Carro", "Ônibus", "Trem", "Avião"};

    // private String[] trajetos = {"Ida", "Ida e volta"};

    

    ObservableList<String> veiculos = FXCollections.observableArrayList("Carro", "Ônibus", "Trem", "Avião");
    ObservableList<String> trajetos = FXCollections.observableArrayList("Ida", "Ida e volta");

    ObservableList<Viagem> listaTeste = FXCollections.observableArrayList(
        new Viagem("Alec", "Canadá", "Avião", "Ida e Volta"),
        new Viagem("Cecilia", "Suécia", "Avião", "Ida e Volta"),
        new Viagem("Bianca", "São Paulo", "Ônibus", "Ida")
    );

    @FXML
    void confirmarViagem(ActionEvent event) {
        String nome = campoNome.getText();
        String localizacao = campoLocal.getText();
        String veiculo = campoVeiculo.getValue();
        String trajeto = campoTrajeto.getValue();

        Viagem viagem = new Viagem(nome, localizacao, veiculo, trajeto);

        listaTeste.add(viagem);
    }

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println(this.nome);
        nome.setCellValueFactory(new PropertyValueFactory<Viagem, String>("nome"));
        localizacao.setCellValueFactory(new PropertyValueFactory<Viagem, String>("localizacao"));
        veiculo.setCellValueFactory(new PropertyValueFactory<Viagem, String>("veiculo"));
        trajeto.setCellValueFactory(new PropertyValueFactory<Viagem, String>("trajeto"));

        tabelaViagens.setItems(listaTeste);

        campoVeiculo.setValue("Carro");
        campoVeiculo.setItems(veiculos);
        campoTrajeto.setValue("Ida");
        campoTrajeto.setItems(trajetos);
    };
}
