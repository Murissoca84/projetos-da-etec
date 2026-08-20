import javax.swing.JOptionPane;

public class exemplo2 {
	public static void main(String[] args) {
		String nomeDoProduto = JOptionPane.showInputDialog("Digite o nome do produto");
		double precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitário"));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade"));
		double total = precoUnitario * quantidade;
		
		JOptionPane.showMessageDialog(null, "Nome do produto: " + nomeDoProduto +
									  		"\nPreço Unitário: R$ " + precoUnitario +
									  		"\nQuantidade comprada: " + quantidade +
									  		"\nTotal a Pagar: R$ " + total);
		
		String nomeDoAluno = JOptionPane.showInputDialog("Digite o nome do aluno");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("entre com a 1ª nota "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a 2ª nota"));
		
		double media = (nota1 + nota2) / 2;
		
		JOptionPane.showMessageDialog(null, "Nome do aluno: " + nomeDoAluno +
											"\n1ª nota: " + nota1 +
											"\n1ª nota: " + nota2 +
											"\nMedia:" + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
 }
