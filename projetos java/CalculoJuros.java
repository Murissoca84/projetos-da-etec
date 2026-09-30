import javax.swing.JOptionPane;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
//1)
/*public class Exemplo {
	public static void main(String args[]) {*/
       
		/*double kilometros = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de km rodados"));
		double gasolina = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui os litros gastos de gasolina"));
		double media = kilometros / gasolina;
		double total = media;
		
		JOptionPane.showMessageDialog(null, "Quilometros rodados: " 	  + kilometros + 
											"\nGasolina: "                + gasolina   +
											"\nMédia gasta de gasolina: " + total);*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//2)
/*public class Exemplo {
	public static void main(String args[]) {
		
		int segundos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de segundos"));
		double horas = segundos / 3600;
		double minutos = segundos / 60;
		
		JOptionPane.showMessageDialog(null, "Numero de segundos: "                + segundos + 
											"\nSegundos convertidos em horas: "   + horas    +
											"\nSegundos convertidos em minutos: " + minutos);*/
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//3)	
/*public class Exemplo {
	public static void main(String args[]) {
		 
		double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite o nume de celsius"));
		double fahrenheit = (celsius * 9/5) + 32;
		double kelvin = celsius + 273.15;
		
		JOptionPane.showMessageDialog(null, "Numero de celsius: "                     + celsius    + 
											"\nCelsius convertidos para Fahrenheit: " + fahrenheit + 
											"\nCelsius convertidos para Kelvin: "     + kelvin);*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//4)
/*public class Exemplo {
	public static void main(String args[]) {
		
		int peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
		double alturaQuadrado = altura * altura;
		double imc = peso / alturaQuadrado;
		
		JOptionPane.showMessageDialog(null, "Seu peso: "     + peso   + 
											"\nSua altura: " + altura +
											"\nIMC: "        + imc);*/
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//5)
public class Exemplo {
	public static void main(String args[]) {
		
		double capital = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui a capital inicial"));
		double juros = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui o juros"));
		double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui o tempo"));
		double jurosSimples = capital * juros * tempo;
		double montane = juros + capital;
		double jurosCompostos = capital * (1 + juros) * tempo;
		
		JOptionPane.showMessageDialog(null, "Juros simples: "     + jurosSimples + 
											 "\nMontane: "         + montane      + 
											 "\nJuros compostos: " + jurosCompostos);
		
		
				
}}


