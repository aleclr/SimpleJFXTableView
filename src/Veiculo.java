public class Veiculo {
    
    private String tipo;
    private String cor;
    private String marca;
    private String placa;

    public Veiculo(String tipo, String cor, String marca, String placa) {
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    
    
}
