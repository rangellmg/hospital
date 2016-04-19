package br.com.hospital;

public class Bebe extends Paciente {
    
    private double altura;
    private double peso;
    private Mae mae;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Mae getMae() {
        return mae;
    }

    public void setMae(Mae mae) {
        this.mae = mae;
    }
    
    @Override
    public String toString(){
        return "Bebê: " + this.getNome() + ", " + 
                          this.getTipoSanguinio() + ", " + 
                          this.getConvenio() + ", "+  
                          this.getAltura() + "cm" + ", " + 
                          this.getPeso() + "kg" + "\n" +
                          "Mãe: " + this.getMae().getNome() + "\n"; //NOME DA MÃE
    }
    
}
