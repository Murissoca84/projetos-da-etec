package menu;

import javax.swing.JOptionPane;

public class CarlinhosMenu {
    public static void main(String[] args) {
        
        int opcao = 0;
        int menuAdm = 0;
        
        do {
           
            opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL"           +
            													 "\n1 - Cliente "           +
            													 "\n2 - Fornecedor "        +
            													 "\n3 - Funcionario "       +
            													 "\n4 - Administrador "     +
            													 "\n5 - Sair"));
            
            switch(opcao) {
            case 0:
            	opcao = JOptionPane.showConfirmDialog(null, "Deseja sair do programa?", "Encerrar o programa", JOptionPane.YES_NO_OPTION);
            	break;
            case 1:
            	JOptionPane.showMessageDialog(null, opcao + " - Cliente");
            	break;
            case 2:
            	JOptionPane.showMessageDialog(null, opcao + " - Fornecedor");
            	break;
            case 3:
            	JOptionPane.showMessageDialog(null, opcao + " - Funcionário");
            	break;
            case 4:
            	do {
            		
            		menuAdm = Integer.parseInt(JOptionPane.showInputDialog("MENU ADMINISTRADOR"     +
            															   "\n1 - Cadastrar"        +
            															   "\n2 - Excluir"          +
            															   "\n3 - Editar"			+
            															   "\n4 - Pesquisar"        +
            															   "\n0 - Voltar"));
            		
        	switch(menuAdm) {
        	case 0:
        		
        		break;
        	case 1:
        		JOptionPane.showMessageDialog(null, menuAdm + " - Cadastrar");
        		break;
        	case 2:
        		JOptionPane.showMessageDialog(null, menuAdm + " - Excluir");
        		break;
        	case 3:
        		JOptionPane.showMessageDialog(null, menuAdm + " - Editar");
        		break;
        	case 4:
        		JOptionPane.showMessageDialog(null, menuAdm + " - Pesquisar");
        		break;
        	default:
        		JOptionPane.showMessageDialog(null, menuAdm + " - Opção inválida");
        		break;
        	}
        	
        }while (menuAdm != 0);
        break;
     default:
    	JOptionPane.showMessageDialog(null, opcao + " - Opção Invalida!");
    	break;
        
        }
            
 }while(opcao != 0);
        
        } 
        
    }
    
