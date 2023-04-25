public class Viagem {
    
    private String nome;
    private String localizacao;
    private String veiculo;
    private String trajeto;

    public Viagem(String nome, String localizacao, String veiculo, String trajeto) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.veiculo = veiculo;
        this.trajeto = trajeto;
    };

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public String getTrajeto() {
        return trajeto;
    }

    public void metodoTeste() {
        System.out.println("teste");
    }

}
