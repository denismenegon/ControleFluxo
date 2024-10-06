package desafio;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ControleFluxo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = s.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = s.nextInt();
		
		try {
			//invocar o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException ex) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		
		if (parametroUm >= parametroUm) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
