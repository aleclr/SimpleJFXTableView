public class Pessoa {

    private String nome;
    private String sexo;
    private String idade;
    private String destino;

    public Pessoa(String nome, String sexo, String idade, String destino) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.destino = destino;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getIdade() {
        return idade;
    }

    public String getDestino() {
        return destino;
    }
    
}
