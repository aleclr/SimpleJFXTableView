public class Viagem {
    
    private Pessoa pessoa;
    private Veiculo veiculo;
    private Lugar lugar;

    public Viagem(Pessoa pessoa, Veiculo veiculo, Lugar lugar) {
        this.pessoa = pessoa;
        this.veiculo = veiculo;
        this.lugar = lugar;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

}
