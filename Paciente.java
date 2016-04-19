package br.com.hospital;

public class Paciente {
    
    private String nome;
    private String tipoSanguinio;
    private String convenio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguinio() {
        return tipoSanguinio;
    }

    public void setTipoSanguinio(String tipoSanguinio) {
        this.tipoSanguinio = tipoSanguinio;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
}
