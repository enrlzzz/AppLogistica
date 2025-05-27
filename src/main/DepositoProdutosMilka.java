package main;

import java.util.Arrays; //IMPORTAÇÃO DA CLASSE QUE LÊ OS DADOS
import java.util.Scanner; //IMPORTAÇÃO DA CLASSE QUE ARMAZENA ARRAYS

public class DepositoProdutosMilka {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		String[] Deposito = null;
		int opcao;
		
		do { //INICIO DO DO
			System.out.println("Bem vindo(a) ao Depósito da Fábrica! ");
			System.out.println("1. Cadastrar Chocolates Milka");
			System.out.println("2. Exibir Depósito inteiro");
			System.out.println("3. Buscar Chocolate");
			System.out.println("4. Ordenar em ordem alfabética");
			System.out.println("0. Sair");
			System.out.println("Escolha uma opção: ");
			opcao = sc.nextInt(); 
			sc.nextLine();		
		
			switch (opcao) {
			
			case 1: //INICIO DAS CASES
				System.out.println("Quantos chocolates deseja cadastrar?: ");
				int quantidade = sc.nextInt();
				sc.nextLine();
				
				Deposito = new String[quantidade]; //VETOR 
				System.out.println("Digite os nomes dos chocolates");
				for (int i = 0; i < Deposito.length; i++) {
					System.out.println("chocolate " + (i + 1) + ": ");
					Deposito[i] = sc.nextLine();
				}
				
					System.out.println("Cadastro concluído com sucesso ✅");
					break; //FIM DA CASE 1
					
			case 2:
				if (verificaDep(Deposito)) {
					System.out.println("Seu Deposito de chocolates: ");
					for (int i = 0; i < Deposito.length; i++) {
						System.out.println("Endereço [" +  i + "] = " + Deposito[i]);
						
					}		
				}
				
				break; //FIM DA CASE 2
				
			case 3:
				if (verificaDep(Deposito)) {
					System.out.println("Digite o nome do chocolate a procurar: ");
					String procurado = sc.nextLine();
					boolean encontrado = false;
					
					for (int i = 0; i < Deposito.length; i++) {
						if (Deposito[i].equalsIgnoreCase(procurado)) {
							
							System.out.println(" '" + procurado + "está na posição [" + i + "] do Deposito");
							encontrado = true;
							break; //FIM DA CASE 3
						}
						
						if (!encontrado) {
							System.out.println(" chocolate '" + procurado + "' está na posição [" + i + "] do Deposito");
						
					}
					
					
					}
				}
				
				break;
				
			case 4:
				if (verificaDep(Deposito)) {
					Arrays.sort(Deposito);
					
					System.out.println("O Depósito em ordem alfabética: ");
					for (String chocolate : Deposito) {
					}
				}
				
				
				break;
				
			case 0:
				System.out.println("Encerrando programa, até logo.");
				break;
				
				default:
					
					System.err.println("Erro, opção inválida.");
			}
		} while (opcao != 0);
			
		
		sc.close();
		
	}
	
	private static boolean verificaDep(String[] Deposito) {
		if (Deposito == null || Deposito.length == 0) {
		System.out.println("Depósito vazio. Cadastre chocolates primeiro (Opção 1.) ");
		return false;
		}
	
	return true;
	}
}
