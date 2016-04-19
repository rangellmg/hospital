package br.com.hospital;

public class Mae extends Paciente{
    
    private final int MAX_BEBES = 5;
    private Bebe bebes[] = new Bebe[MAX_BEBES];

    public Bebe[] getBebes() {
        return bebes;
    }

    public void setBebes(Bebe[] bebes) {
        this.bebes = bebes;
    }
    
    public void adicionarBebe(Bebe bebe){
        int contador = 0;
        boolean addBebe = true;
        
        while(addBebe && contador < MAX_BEBES){
            if(bebes[contador] == null){
                bebes[contador] = bebe;
                addBebe = false;
            }
            contador++;
        }
        if(contador == MAX_BEBES){
            System.out.println("Número máximo de bebês atingido");
        }
    }
    
    @Override
    public String toString(){
        String concatenarMae = "Mãe: " + this.getNome() + ", " + 
                                         this.getTipoSanguinio() + ", " + 
                                         this.getConvenio()+ "\n";
        for(int i = 0; i < MAX_BEBES; i++){
            if(bebes[i] != null){
                concatenarMae +=  "Bebê: " + bebes[i].getNome() + "; "; //PEGAR O NOME DO BEBÊ
            }
        }        
        return concatenarMae + "\n";
    }
}
