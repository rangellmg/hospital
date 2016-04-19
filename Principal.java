package br.com.hospital;

import javax.swing.JOptionPane;

public class Principal {
    
    static final int MAX_PACIENTE = 100;
    static Paciente pacientes[] = new Paciente[MAX_PACIENTE];
        
    public static void adicionarPaciente(Paciente paciente){
        
        int contador = 0;
        boolean procurandoEspaco = true;
        
        while(procurandoEspaco && contador < MAX_PACIENTE){
            if(pacientes[contador] == null){
                pacientes[contador] = paciente;
                procurandoEspaco = false;
            }
            contador++;
        }
    }

    public static void main(String[] args) {
        
        Bebe bebe;
        Mae mae;
        int controle;
        
        do{
            controle = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n" +
                                                                    "\n1)Inserir o cadastro da mãe e recém nascidos:" +
                                                                    "\n2)Mostrar a listagem de pacientes: "+ 
                                                                    "\nDigite 0 para sair"));
            
            
            switch(controle){
                
                case 1:
                    mae = new Mae();
                    mae.setNome(JOptionPane.showInputDialog("Insira o nome da mãe"));
                    mae.setTipoSanguinio(JOptionPane.showInputDialog("Insira o tipo sanguínio da mãe"));
                    mae.setConvenio(JOptionPane.showInputDialog("Insira o convênio da mãe"));
                    adicionarPaciente(mae);
                    
                    int filhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos bebês serão concebidos: "));
                    for(int i = 0; i < filhos; i++){
                        bebe = new Bebe();
                        bebe.setNome(JOptionPane.showInputDialog("Insira o nome do recém nascido"));
                        bebe.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Insira o peso do bebê em kg: ")));
                        bebe.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do bebê em cm: ")));
                        bebe.setTipoSanguinio(JOptionPane.showInputDialog("Insira o tipo sanguínio do recém nascido"));
                        bebe.setConvenio(JOptionPane.showInputDialog("Insira o convênio do recém nascido"));
                        mae.adicionarBebe(bebe);
                        bebe.setMae(mae);
                        adicionarPaciente(bebe);
                    }
                break;
                    
                case 2:
                    for(int i = 0; i < MAX_PACIENTE; i++){
                        if(pacientes[i] != null){
                            if(pacientes[i] instanceof Mae){
                                mae = (Mae) pacientes[i];
                                System.out.println(mae.toString());
                            }else{
                                bebe = (Bebe) pacientes[i];
                                System.out.println(bebe.toString());
                            }
                        }
                    }
                break;
            }   
        }while(0!=(controle));
    }
}
