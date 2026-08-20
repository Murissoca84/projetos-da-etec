import javax.swing.JOptionPane; 

public class eleicao { 
    public static void main(String args[]) { 
        int eleitores = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de eleitores")); 
        
        String nome1 = JOptionPane.showInputDialog("Digite o nome do candidato 1"); 
        String nome2 = JOptionPane.showInputDialog("Digite o nome do candidato 2"); 
        String nome3 = JOptionPane.showInputDialog("Digite o nome do candidato 3"); 
        String nome4 = JOptionPane.showInputDialog("Digite o nome do candidato 4"); 
        
        int votos1 = 0; 
        int votos2 = 0; 
        int votos3 = 0; 
        int votos4 = 0; 
        int nulo = 0; 
        
        for (int i = 1; i <= eleitores; i++) { 
            int numero = (int) (Math.random() * 5) + 1; 
            
            if(numero == 1) { 
                votos1 = votos1 + 1; 
            } else if(numero == 2) { 
                votos2 = votos2 + 1; 
            } else if(numero == 3) { 
                votos3 = votos3 + 1; 
            } else if(numero == 4) { 
                votos4 = votos4 + 1; 
            } else if(numero == 5) { 
                nulo = nulo + 1; 
            }
        }

        String vencedorNome = "Empate ou sem votos válidos";
        int maiorVotos = -1;

        if (votos1 > maiorVotos) {
            maiorVotos = votos1;
            vencedorNome = nome1;
        }
        if (votos2 > maiorVotos) {
            maiorVotos = votos2;
            vencedorNome = nome2;
        } else if (votos2 == maiorVotos && maiorVotos > 0) {
            vencedorNome = "Empate";
        }
        if (votos3 > maiorVotos) {
            maiorVotos = votos3;
            vencedorNome = nome3;
        } else if (votos3 == maiorVotos && maiorVotos > 0) {
            vencedorNome = "Empate";
        }
        if (votos4 > maiorVotos) {
            maiorVotos = votos4; 
            vencedorNome = nome4;
        } else if (votos4 == maiorVotos && maiorVotos > 0) {
            vencedorNome = "Empate";
        }


        double perc1 = ((double) votos1 / eleitores) * 100;
        double perc2 = ((double) votos2 / eleitores) * 100;
        double perc3 = ((double) votos3 / eleitores) * 100;
        double perc4 = ((double) votos4 / eleitores) * 100;
        double percNulo = ((double) nulo / eleitores) * 100;
        double porVencedor = ((double) maiorVotos / eleitores) * 100; 
        
        String resultado = "quantidade de eleitores : " + eleitores + "\n" +
                           "------------------------------------------------------------\n" +
                           "Candidato vencedor: " + vencedorNome + " - " + maiorVotos  + " votos - "+ String.format("%.2f", porVencedor) + "%\n" +
                           "------------------------------------------------------------\n" +
                           nome1 + " - " + votos1 + " votos - " + String.format("%.2f", perc1) + "%\n" +
                           nome2 + " - " + votos2 + " votos - " + String.format("%.2f", perc2) + "%\n" +
                           nome3 + " - " + votos3 + " votos - " + String.format("%.2f", perc3) + "%\n" +
                           nome4 + " - " + votos4 + " votos - " + String.format("%.2f", perc4) + "%\n" +
                           "Nulos - " + nulo + " votos - " + String.format("%.2f", percNulo) + "%\n"  +
                           "------------------------------------------------------------" ;

        JOptionPane.showMessageDialog(null, resultado); 
    } 
}
