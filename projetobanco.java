package aulas_java;

import java.util.ArrayList;
import java.util.Scanner;

public class projetobanco {
    public static void main(String[] args) {
        ArrayList<String> listacartao = new ArrayList<>();
        String[] cpfenome = {"093.004.029-51","09300402951"};
        String[] nomes = {"Fernando", "Maria eduarda"};
        
        String cpfdigitado;
        boolean encontrado = false;

        String nomedigitado;
        boolean nomeecontrad = false;

        boolean feito = false;

        int saldo = 1200;
        int saldototal = 1200;
        int opcao = -1;

        
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bem vindo ao banco digital!");

            System.out.println("Digite seu nome: ");
                String nome = scanner.nextLine();
            System.out.println("Digite seu CPF: ");
                cpfdigitado = scanner.nextLine();

                    for (int i = 0; i < cpfenome.length; i++) {
                        
                        if (cpfdigitado.equals(cpfenome[i])) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                            System.out.println("CPF incorreto ou não cadastrado, digite novamente!");
                    }
            } while(!encontrado);
            System.out.println("login efetuado com sucesso");
            scanner.nextLine();
            
                do {                          
                        System.out.println("1- saldo");
                        System.out.println("2- transferencia");
                        System.out.println("3- Criar cartão virtual");
                        System.out.println("0- Sair do app");
                            opcao = scanner.nextInt();
                                if (opcao == 1) {
                                    System.out.println("seu saldo: " + saldototal);
                                    System.out.println("para sair aperte 2..");
                                        scanner.nextInt();
                                        break;      
                                } 

                            
                                do {
                                    if(opcao == 2) {
                                        System.out.println("Digite a chave pix do usuario: ");
                                        int chavepix = scanner.nextInt();
                                        System.out.println("digite o valor da transferencia: ");
                                            int valor = scanner.nextInt();

                                                if (saldototal >= valor) {
                                                    System.out.println("Transação feita com sucesso!");
                                                    int descont = (saldototal - valor);
                                                    feito = true;
                                                    System.out.println("Pressione ENTER para sair..");
                                                    scanner.nextLine();
                                                    scanner.nextLine();                                                   
                                                    
                                                }else {
                                                    System.out.println("Saldo indisponivel!, verifique seu saldo ou digite novamente!");
                                                    scanner.nextLine();
                                                    scanner.nextLine();  
                                                }                                               
                                    }
                                } while(!feito);
                                    scanner.nextLine();                     
                                    if (opcao == 3) {
                                        int opcao3;
                                        do{
                                            System.out.println("Cartões virtuais");
                                            System.out.println("Para adicionar um cartão virtual digite 1: ");
                                            System.out.println(listacartao);
                                            System.out.println("2- Sair");

                                                opcao3 = scanner.nextInt();
                                                scanner.nextLine();
                                            
                                                if (opcao3 == 1) {
                                                    System.out.println("Digite um nome novo para seu cartão");
                                                    String nomedocartao = scanner.nextLine();
                                                        listacartao.add(nomedocartao);  
                                                    System.out.println("Nome criado com sucesso!");  
                                                                                
                                                } else if (opcao3 == 2) {
                                                    System.out.println("saindo do menu de cartões..");
                                                } else {
                                                    System.out.println("opção invalida");
                                                }
                                        } while(opcao3 != 2);
                                            
                                            
                                    }


                    } while (opcao != 0);
            







        scanner.close();

    }
}
