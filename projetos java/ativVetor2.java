package ativVetor2;

import javax.swing.JOptionPane;

public class ativVetor2 {
	public static void main(String[]args) {
		
		String funcionarios[] = {"Gabril Ribeiro","João Pedro", "José Antonio", "José Elias", "Kauã Ribeiro", "Luiz Antonio", "Lyncon Gabriel",
						   "Manuela Reis", "Maria Fernanda", "Mariana Silva", "Messias Castro", "Murillo Valent", "Rebecca Jesus", 
						   "Taissa Nunes", "Tiago Dias", "Valentina Morei", "Yuri Gabriel"};
		
				int matricula[] = new int[20];
				double bruto[] = new double[20];
				double descontos[] = new double[20];
				double liquido[] = new double[20];
				String valor[] = new String[20];
				
				int nMatricula = 0;
				double totalBruto = 0;
				double totalLiquido = 0;
				
		System.out.println("=======================================================================");
		System.out.println("Matr:\tFuncionarios:\tSalario bruto:\tDescontos:\tSaláro Liquido: ");
		System.out.println("=======================================================================");
		
		
				for (int i = 0; i < funcionarios.length; i++) {
					bruto[i] = (int)(Math.random() * 3001);
					descontos[i] = (int)(Math.random() * 21);
					matricula[i] = (int)(Math.random() * 1000);
					liquido[i] = (bruto[i] + descontos[i]) / 2;
					
					if (bruto[i] <= 1000) {
						descontos[i] = 0.9;
						liquido[i] = Math.floor(bruto[i] * descontos[i]);
						valor[i] = "10%";
					}
					else if (bruto[i] <= 2000) {
						descontos[i] = 0.85;
						liquido[i] = Math.floor(bruto[i] * descontos[i]);
						valor[i] = "15%";
					}
					else{
						descontos[i] = 0.8;
						liquido[i] = Math.floor(bruto[i] * descontos[i]);
						valor[i] = "20%";
					}
					
					totalBruto = totalBruto + bruto[i];
					totalLiquido = totalLiquido + liquido[i];
					
					System.out.println(matricula[i] + "\t" + funcionarios[i] + "\t" + bruto[i] + "\t\t" + valor[i] + "\t\t" + liquido[i]);
				}
		
		double mediaBruto = totalBruto / 20;
		double mediaLiquido = totalLiquido / 20;
		
		System.out.println("=======================================================================");
		System.out.println("\t\t\tMédia Salário Bruto:\t" + mediaBruto);
		System.out.println("\t\t\tMédia Salário Liquido:\t" + mediaLiquido);
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja efetuar uma consulta?", null, JOptionPane.YES_NO_OPTION);
		
		while (resposta == 0) {
			System.out.println("=======================================================================");
			
			int resposta1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de matricula:"));
			boolean encontrada = false;
			
			for (int i = 0; i < funcionarios.length; i++) {
				
				if (matricula[i] == resposta1) {
					System.out.println(matricula[i] + "\t" + funcionarios[i] + "\t" + bruto[i] + "\t\t" + valor[i] + "\t\t" + liquido[i]);
					encontrada = true;
				}
				
			}
			
			if (!encontrada) {
				System.out.println("Matricula não encontrada");
			}

			
			resposta = JOptionPane.showConfirmDialog(null, "Deseja efetuar outra uma consulta?", null, JOptionPane.YES_NO_OPTION);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
