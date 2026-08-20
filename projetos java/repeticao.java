package bla;
import javax.swing.JOptionPane;

public class repeticao {

	public static void main(String[] args) {
	
	
	int i = 100;
	System.out.println("Comando do - while: ");
	
	do {
		System.out.println(i + " - ");
		i = i + 1;
	} while(i <= 10);
	
	System.out.println();
	
	i = 100;
	System.out.println("Comando while: ");
	
	while (i <= 10) {
		System.out.println(i + " - ");
		i = i + 1;
	};
	
	
	
	String resposta = "";
	
	do {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade"));
		String condicao = "";
		
		if(idade < 16) {
			condicao = "Não eleitor";
		} else if(idade <= 17 || idade >= 65) {
			condicao = "Eleitor Facultativo";
		} else {
			condicao = "Eleitor Obrigátório";
		}
		
		JOptionPane.showMessageDialog(null, condicao);
		resposta = JOptionPane.showInputDialog("Digite 'sim' para executar novamente ou qualquer tecla para sair");
		
	} while(resposta.equalsIgnoreCase("sim") || !resposta.equalsIgnoreCase("não"));
	
	int resposta2 = 0;
	while(resposta2 == 0) {
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Entre com os dias"));
		double diaria = dias * 380;
		double taxa = 0;
		
		if(dias >= 10) {
			taxa = 30 * dias;
		} else {
			taxa = 40 * dias;
		}
		
		double total = taxa + diaria;
		int voucher = JOptionPane.showConfirmDialog(null, "pussui Voucher", "", JOptionPane.YES_NO_OPTION);
		
		if(voucher == 0) {
			total = total * 0.9;
		}
		
		JOptionPane.showMessageDialog(null, "Diaria: " + diaria +
											"\nTaxa: " + taxa   +
											"\nTotal: "+ total);
		resposta2 = JOptionPane.showConfirmDialog(null, "Executar Nolvamente?", "Escolha uma opcão", JOptionPane.YES_NO_OPTION);
	}

	String resposta3 = "sim";
	while(resposta3.equalsIgnoreCase("sima")) {
		double velocidadePermitida = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade Permitida"));
		double velocidadeVeiculos = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade do Veiculo"));
		String infracao = "";
		boolean multado = true;
		double acima = 0;
		
		if(velocidadeVeiculos <= velocidadePermitida) {
			JOptionPane.showMessageDialog(null, velocidadeVeiculos + "km/p - Veículo na velocidade Permitida");
			multado = false;
		} else if (velocidadeVeiculos <= velocidadePermitida * 1.12) {
			infracao = "R$ 130,16 - 4 pontos na Carteira";
			acima = (velocidadeVeiculos - velocidadePermitida) / velocidadePermitida * 100;
		} else if (velocidadeVeiculos <= velocidadePermitida * 1.5) {
			infracao = "R$ 195,23 - 5 ponttos na Carteira";
			acoma = (velocidadeVeiculos - velocidadePermitida) / velocidadePermitida * 100;
		} else {
			infracao = "R$ 880,41 - 7 pont0os na carteira";
			acima = (velocidadeVeiculos - velocidadePermitida) / velocidadePermitida * 100;
		}
		infracao = infracao + " - " + acima + "% acima do permitido";
		
		if(multado) {
			JOprtionPane.showMessageDialog(null, infracao);
		}
		
		resposta3 = JOptionPane.showInputDialog("digite sim para fazer dnv ou qualquer tecla para nao"0);
	}
		
		
		
		
		
		
		
		
		
		
	}

}
