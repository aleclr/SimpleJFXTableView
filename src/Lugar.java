public class Lugar {
    
    private String cidade;
    private String pais;
    private String objetivo;
    private String lingua;

    public Lugar(String cidade, String pais, String objetivo, String lingua) {
        this.cidade = cidade;
        this.pais = pais;
        this.objetivo = objetivo;
        this.lingua = lingua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getPais() {
        return pais;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getLingua() {
        return lingua;
    }
    
}
