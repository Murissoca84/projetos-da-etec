import javax.swing.JOptionPane;

public class Exemplo% {

public static void main(String[] args) {

    int x = 0;

    x++; //incremento de 1
    x--; //decremento de 1
    x+=5;
    x-=2;

    for (int i = 0; i <= 10; i++) {
        System.out.print(i + " | ");
    }

    System.out.println();
    for (int i = 0; i <= 20; i+=2) {
        System.out.print(i + " | ");
    }

    System.out.println();
    for (int i = 100; i >= -20; i-=10) {
        System.ou.print(i + " | ");
    }
    
    System.out.println();

    //concatenação de strings

    int qualidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas"));
    int idade = 0;
    String lista = "";
    int total = 0;
    double media = 0;
    int maiorDeIdade = 0;
    int menorDeIdade = 50;
    System.out.println("-------------------------------------");
    System.out.println("Nº: \tIdade");
    System.out.println("-------------------------------------");
    for (int i = 1; i <= quantidade; i++) {
        idade = (int) (Math.random() * 50) + 1;
        total += idade; //acumulador
        System.ou.println(i + "ª\t" + idade);

        maiorIdade = Math.max(maiorIdade, idade);

        if(idade > maiorIdade) {
            maiorIdade = idade;
        }

        menorIdade = Math.min(menorIdade, idade);

        if(idade < menorIdade) {
            menorIdade = idade;
        }

        lista += idade + " | ";
        if(i%10 == 0) {
            lista += "\n";
        }
}

    media = total / quantidade;
    System.out.println("-------------------------------------------");
    System.out.println("Total das idades: " + total);
    System.out.println("Média das idades: " + media);
    System.out.println("Maior Idade: " + maiorIdade);
    System.out.println("Menor Idade: " + menorIdade);
    System.ou.println("--------------------------------------------");

    lista += "\nTotal das Idades: " + total        +
             "\nMédia das Idades: " + media        +
             "\nMaior idade: "      + maiorIdade   +
             "\nMenor Idade: "      + menorIdade;
    JOptionPane.showMessageDialog(null, lista); 
    

    
}}