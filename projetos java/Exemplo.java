import javax.swing.JOptionPane;

public class Exemplo {
	public static void main(String args[]) {
        //criar variáveis: tipo nome de variável
        //inicializa
        double precoUnitario = 25.5;
        int quantidade = 10;
        double total = precoUnitario * quantidade;

        // + concatenação
        System.out.println("Preço unitario: R$" + precoUnitario);
        System.out.println("Quantidade Comprada:" + quantidade);
        System.out.println("Total da compra: R$" + total);
        
        System.out.println("-------------------------------------");
        
        System.out.println("Preço Unitário" + precoUnitario +
        		           "\nQuantidade Comprada:" + quantidade +
        		           "\nTotal da compra: R$" + total);
       
        
        //boolean: armazena somente true (verdadeiro) ou false (falso)
        boolean maior = true;
        boolean dependente = false;
        boolean matriculado = true;
        
        // String : é uma classe, não variável, e armazena qualquer caracter do teclado
        // sempre estar entre aspas duplas para armazenar
        
        String qualquer = "872834874{}{}]][{}?s";
        String nome = "Prof. Alfredo de Barros Santos";
        String endereço = "R. Afonso Giannico, nº 350 - Pedregulho";
        String cpf = " 123.456.789-00";
        String rg = "56.845.038- x";
        
        /* Operadores aritmeticos: + - / divisão  *multiplicação
         * Operadores relacionais: > < >= ==igualdade =!diferente !negação,inversão
         * Operadores Lógicos: && ("e" de adição) || ( ou )
         */
        
  //      JOptionPane.showMessageDialog(null,"Preço Unitário" + precoUnitario +
        	//	                          "\nQuantidade Comprada:" + quantidade +
        		//                          "\nTotal da compra: R$" + total);
        
        String nome1 = JOptionPane.showInputDialog("Digite seu nome");
        String endereco = JOptionPane.showInputDialog("Entre com o endereço");
        String cpf1 = JOptionPane.showInputDialog("Digite seu cpf");
        String rg1 = JOptionPane.showInputDialog("Digite seu rg");
        
        JOptionPane.showConfirmDialog(null, "nome: " + nome1 +
        							 		"\nEndereco: " + endereco +
        							 		"\nCpf: " + cpf1 +
        							 		"\nRg: " + rg1);
}}
