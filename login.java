package projagenda;

import java.util.Scanner;

/**
 *
 * Autor: Rogério dos Santos Objetivo: Projeto Agenda telefonica
 */
public class ProjAgenda {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String[] nomes = new String[5];
        long[] telefone = new long[5];     
        String sNome = "", sDados = "";
        long iNrTelefone = 0;
        boolean bAchou = false;
        String endereco = "";

        System.out.println("Menu de opções");
        System.out.println("Escolha uma opção1");
        


        while (iOpcao != 6) {
            System.out.println("1-Cadastrar");
            System.out.println("2-Listagem");                                                   
            System.out.println("3-Procurar");
            System.out.println("4-Alterar");
            System.out.println("5-Excluir");
            System.out.println("6-Sair");
            System.out.println("Informe uma opção");
            iOpcao = leitura.nextInt();

            if (leitura.hasNextLine()) {
                leitura.nextLine();
            }

            switch (iOpcao) {
                case 1:
                    //Cadastrar
                    for (int x = 0; x < nomes.length; x++) {
                        if (nomes[x] == null) {
                            System.out.println("Informe o " + (x + 1) + "º Nome");
                            sNome = leitura.nextLine();

                            System.out.println("Informe o telefone");
                            iNrTelefone = leitura.nextLong();

                            nomes[x] = sNome;
                            telefone[x] = iNrTelefone;
                            if (leitura.hasNextLine()) {
                                leitura.nextLine();
                            }
                        } else {
                            System.out.println("Já existem nomes cadastrados");
                            break;
                        }
                    }
                    break;

                case 2:
                    //Listagem
                    for (int x = 0; x < nomes.length; x++) {
                        if (nomes[x] != null) {
                            System.out.println("Nome:.........." + nomes[x]);
                            System.out.println("Telefone:......" + telefone[x]);
                            System.out.println("----------------------------");
                            qtReg++;
                        }
                    }
                    System.out.println("Quantidade de registros..:" + qtReg); 
                    qtReg = 0;
                    break;
            
                case 3:
                    //Procurar
                    System.out.println("Digite o nome ");
                    sNome = leitura.nextLine();
                    for (int x = 0; x < nomes.length; x++) {
                        if (sNome.equals(nomes[x])) {
                            sDados = "Nome:...." + nomes[x]
                             + "\nTelefone:..." + telefone[x];
                            break;
                            
                        }
                    }
                    if (!sDados.isEmpty()) {
                        System.out.println(sDados);
                        sDados = "";
                    }
                    else{
                        System.out.println("Nome não encontrado");
                    }
                    break;                  
                case 4:
                    //Alterar
                    System.out.println("Digite o nome para alterar o telefone");
                    sNome = leitura.nextLine();
                    for(int x = 0; x< nomes.length;x++)
                    {
                        if(sNome.equals(nomes[x])){
                            System.out.println("Informe o novo nr do telefone");
                            iNrTelefone = leitura.nextLong();
                            telefone[x]= iNrTelefone;
                            bAchou = true;
                        }
                    }
                    if(bAchou)
                    {
                        System.out.println("Nr telefone alterado com sucesso");
                        bAchou = false;
                    }
                    else
                    {
                        System.out.println("Nome  não encontrado");
                    }
                  
                case 5:
                    //Excluir
                    System.out.println("Digite o nome para excluir da agenda");
                    sNome = leitura.nextLine();
                    
                    for(int x = 0; x< nomes.length;x++)
                    {
                        if(sNome.equals(nomes[x]))
                        {
                          nomes[x]=null;
                          telefone[x]= 0;
                          bAchou = true;
                          break;
                        }
                    }
                    if(bAchou)
                    {
                        System.out.println("Exclusão realizada com sucesso");
                        bAchou = false;
                    }
                    else
                    {
                        System.out.println("Nome não encontrado");
                    }
                    
                case 6:
                    break;

            }

        }

    }

}
