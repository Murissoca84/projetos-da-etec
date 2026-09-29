package exemplo;

import javax.swing.JOptionPane;

public class Azure {

	 public static void main(String args[]) {
	
	//  >= maior ou igual   <= menor ou igual  == igual  != diferente  ! negação ou inverção
		 
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));
	
		
		if (idade < 0) {
			JOptionPane.showMessageDialog(null, "Idade Invalida!");
		} else if(idade <= 17) {
			JOptionPane.showMessageDialog(null, "Você é Menor");
		} else if(idade <= 64) {
			JOptionPane.showMessageDialog(null, "Você é Maior");
		} else {
			JOptionPane.showMessageDialog(null, "Você é Idoso");
		}
		
		
		//Case Sensitive
		String resposta = JOptionPane.showInputDialog("Digite a resposta Sim ou Não");
		
		if(resposta.equalsIgnoreCase("Sim")) {
		    JOptionPane.showMessageDialog(null, "Você respondeu Sim");
		} else if (resposta.equalsIgnoreCase("Não")) {
			 JOptionPane.showMessageDialog(null, "Você respondeu Não");
		} else {
			 JOptionPane.showMessageDialog(null, "Resposta Invalida");
		}
		
		int resposta2 = JOptionPane.showConfirmDialog(null, "Você possui dependentes?", "Escolha uma opção",
				JOptionPane.YES_NO_CANCEL_OPTION);
	
		if(resposta2 == 0) {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número de Dependentes "));
		} else if(resposta2 == 1) {
			JOptionPane.showMessageDialog(null, "Você não tem Dependentes ");
		} else {
			JOptionPane.showMessageDialog(null, "CANCELADO");
		}
		
		/* Salário
		 * Menos de 1500,00  =  Valor Invalido
		 * 1500,00 até 2000  =  30%
		 * 2000,01 até 3000  =  20%
		 * 3000,01 até 4000  =  10%
		 * acima de    4000  =  5%
		 */
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário"));
		double aumento = 0;
		double salarioAntigo = salario;
		boolean valido = true;
		
		if(salario < 1500) {
			JOptionPane.showInputDialog(null, "Valor do Salário Inválido");
			valido = false;
		} else if(salario <=2000) {
			aumento = salario * 0.3;
		} else if(salario <=3000) {
			aumento = salario * 0.2;
		} else if(salario <=4000) {
			aumento = salario * 0.1;
		} else {
			aumento = salario * 0.05;
		}
		
		
		
		if(valido) {
			salario = salario + aumento;
			JOptionPane.showMessageDialog(null, "Salário Antigo: " + salarioAntigo +
					                            "\nAumento: "      + aumento       +
					                            "\nSalário Novo:"  + salario);
		
		}
		
		// Operadores Lógicos: E (&&)    OU(||)    ! negação, inversão
		// Seleção de candidatos a vaga de motorista:
		// idade >=25 E cnh OU experiência
		
		idade = Integer.parseInt(JOptionpane.showInputDialog("Digite a idade"));
        String cnh = JOptionPane.showInputDialog("Possui cnh? Sim ou Não");
        String experiencia = JOptionPane.showInputDialog("Possui Experiência? Sim ou Não");
        String tipo = JOptionPane.showInputDialog("Possui cnh tipo D? Sim ou Não");
        //     V/F                 V/F
        if(idade >= 25 && experiencia.equalsIgnoreCase("sim") || !cnh.equalsIgnoreCase("sim") && tipo.equalsIgnoreCase("sim")) {
        	     JOptionPane.showMessageDialog(null, "Candidato Aprovado");
        } else {
        	JOptionPane.showMessageDialog(null, "Candidato Reprovado");
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
