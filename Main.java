package com.mycompany.main;
import java.util.Scanner;

public class Main {
    
    public static String[][] registrar(String[][] alunos, int contador){ 
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < contador; i++){
            System.out.print("Digite o nome do aluno     " + "[" + (i+1) + "]" + ": ");
            alunos[i][0] = scanner.nextLine();
            System.out.print("Digite a matricula do aluno" + "[" + (i+1) + "]" + ": ");
            alunos[i][2] = scanner.nextLine();
        }            
        return alunos;
    }
    
    public static void consultar(String[][] alunos, int contador){
        System.out.println("\nCONSULTA DOS ALUNOS:");
        for(int i = 0; i < contador; i++){
            System.out.println("\nNome aluno      [" + (i+1) + "]: " + alunos[i][0]);
            System.out.println("Matricula aluno [" + (i+1) + "]: " + alunos[i][2]);
        }
        System.out.println("\nFIM DA CONSULTA\n");
    }

    public static void main(String[] args) {
        
        int op = 1, contador = 3, contadorLinhas = 3, contadorColunas = 3;
        String[][] alunos = new String[contadorLinhas][contadorColunas];
        
        Scanner scanner = new Scanner(System.in);
        
        while(op != 0){
            System.out.print("************ MENU ************\n1 - Registrar aluno\n2 - Consultar alunos\n0 - Sair\nOpcao escolhida: ");
            op = scanner.nextInt();
            
            switch(op){
                case 1: 
                    alunos = registrar(alunos, contador) ;
                    break;
                case 2: 
                    consultar(alunos, contador);
                    break;
                case 0: 
                    System.out.println("FIM!");
                    break;
                default: 
                    System.out.println("Coloque um valor valido!");
                    break;
            }
        }
    }
}
