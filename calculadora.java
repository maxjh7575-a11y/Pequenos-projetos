package aulas_java;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("---PROJETO CALCULADORA---");
            System.out.println("-------------------------");
            System.out.println("Digite seu primeiro numero: ");//aqui o usuario digita os numeros
                int num1 = sc.nextInt();
            System.out.println("Digite seu segundo numero: ");
                int num2 = sc.nextInt();
            System.out.print("\033[H\033[2J"); //limpa a tela
                System.out.flush(); // envia o comando na hora
            System.out.println("Qual tipo de operação você vai usar?"); //o usuario seleciona o tipo da operação
            System.out.println("1-Soma");
            System.out.println("2-Subtração");
            System.out.println("3-Divisão");
            System.out.println("4-Multiplicação");
            System.out.println("5-sair");
                int op = sc.nextInt();
                    System.out.print("\033[H\033[2J");
                        System.out.flush();
                    
                
                    switch (op) { //começa os tipos das operações
                        case 1:
                            System.out.println("TIPO DE OPERAÇÃO: SOMA");
                                int resultado = (num1 + num2);
                            System.out.println("Resultado: " + resultado);
                            System.out.println("Aperte ENTER para continuar");
                                sc.nextLine();
                                    System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                    break;
                        case 2:
                            System.out.println("TIPO DE OPERAÇÃO: SUBTRAÇÃO");
                                int resultado2 = (num1 - num2);
                            System.out.println("Resultado: " + resultado2);
                            System.out.println("Aperte ENTER para continuar");
                                sc.nextLine();
                                    System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                    break;
                        case 3:
                            System.out.println("TIPO DE OPERAÇÃO: DIVISÃO");
                                int resultado3 = (num1 / num2);
                            System.out.println("Resultado: " + resultado3);
                            System.out.println("Pressione ENTER para continuar");
                                sc.nextLine();
                                    System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                    break;
                        case 4:
                            System.out.println("TIPO DE OPERAÇÃO: MULTIPLICAÇÃO");
                                int resultado4 = (num1 * num2);
                            System.out.println("Resultado: " + resultado4);
                            System.out.println("Pressione ENTER para continuar");
                                sc.nextLine();
                                    System.out.print("\033[H\003[2J");
                                        System.out.flush();
                                    break;
                        case 5:
                            break;
                        
                        default:
                            System.out.println("Opção inválida");
                        




                    }
            sc.close();        
                

            
    }
}
