package vetor;
import javax.swing.JOptionPane;

public class vetorAula {
	public static void main(String[]args) {
		
//		//Array Unidimencional - vetor 
//		
//		String nome[] = new String[50];
//		double valor[] = new double[1000];
//		int idade[] = new int[20];
//		boolean verificado[] = new boolean[100];
//		
//		nome[0] = JOptionPane.showInputDialog("Entre com o nome");
//		nome[1] = "Maria";
//		System.out.println("Nome: " + nome[0]);
//		System.out.println("Nome: " + nome[1]);
//		
//		valor[0] = 1000;
//		valor[1] = 3;
//		double total = valor[0] * valor[1];
//		System.out.println("Total: " + total);
//		
//		for (int i = 0; i < 1000 ; i++) {
//			valor[i] = (int)(Math.random() * 100);
//			System.out.println(valor[i]);
//		}
		
		String alunos[] = {"Gabril Ribeiro","João Pedro", "José Antonio", "José Elias", "Kauã Ribeiro", "Luiz Antonio", "Lyncon Gabriel",
						   "Manuela Reis", "Maria Fernanda", "Mariana Silva", "Messias Castro", "Murillo Valent", "Rebecca Jesus", 
						   "Taissa Nunes", "Tiago Dias", "Valentina Morei", "Yuri Gabriel"};
		
		double nota1[] = new double[20];
		double nota2[] = new double[20];
		double media[] = new double[20];
		String situacao[] = new String[20];
		
		int totalReprovados = 0;
		int totalRecuperacao = 0;
		int totalAprovados = 0;
		double maiorMedia = 0;
		double menorMedia = 11;
		String nomeMaior = "";
		String nomeMenor = "";
		
		System.out.println("=======================================================================");
		System.out.println("Nome:\t\tNota 1:\tNota 2:\tMédia:\tSituação: ");
		System.out.println("=======================================================================");
		for (int i = 0; i < alunos.length; i++) {
			nota1[i] = (int)(Math.random() * 11);
			nota2[i] = (int)(Math.random() * 11);
			media[i] = (nota1[i] + nota2[i]) / 2;
			
			if(media[i] > maiorMedia) {
				maiorMedia = media[i];
				nomeMaior = alunos[i];
			}
			
			if(media[i] < menorMedia) {
				menorMedia = media[i];
				nomeMenor = alunos[i];
			}
			
			if(media[i] <= 4.9) {
				situacao[i] = "Reprovado";
				totalReprovados++;
			}else if(media[i] <= 6.9) {
				situacao[i] = "Recuperação";
				totalRecuperacao++;
			} else {
				situacao[i] = "Aprovado";
				totalAprovados++;
			}
			
			System.out.println(alunos[i] + "\t" + nota1[i] + "\t" + nota2[i] + "\t" + media[i] + "\t" + situacao[i]);
		    System.out.println("-------------------------------------------------------------------");
		}
		
		System.out.println("=======================================================================");
		System.out.println("\t\t\tReprovados:\t" + totalReprovados);
		System.out.println("\t\t\tRecuperação:\t" + totalRecuperacao);
		System.out.println("\t\t\tAprovados:\t" + totalAprovados);
		System.out.println("=======================================================================");
		System.out.println("\t\t\tMaior media:\t" + maiorMedia);
		System.out.println("\t\t\tNome:\t" + nomeMaior);
		System.out.println("\t\t\tMenor media:\t" + menorMedia);
		System.out.println("\t\t\tNome:\t" + nomeMenor);
		
		}
		
	}


