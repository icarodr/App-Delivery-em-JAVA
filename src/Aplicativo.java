import javax.swing.JOptionPane;
import java.util.*;

public class Aplicativo {
    void ligar(){
        JOptionPane.showMessageDialog(null,"Bem-Vindo(a) ao App Delivery!");

        Restaurante restaurante = new Restaurante();
        Usuarios usuarios = new Usuarios();
        
        String nome_restaurante;
        String cnpj_restaurante;

        int opcao_entrada = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo: \n" +
        "(1) - Entrar como um Restaurante \n" +
        "(2) - Entrar como um usuario \n"));

        List myArrayList = new ArrayList();

        if(opcao_entrada == 1){
            int entrar_restaurante = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo: \n" +
            "(1) - Quero cadastrar meu Restaurante\n"+
            "(2) - Tenho um restaurante cadastrado"));

            if(entrar_restaurante == 1){
                nome_restaurante = JOptionPane.showInputDialog(null,"Escreva o nome do Restaurante: ");
                cnpj_restaurante = JOptionPane.showInputDialog(null,"Escreva o CNPJ do Restaurante: ");

                myArrayList.add(nome_restaurante);
                myArrayList.add(cnpj_restaurante);

            }
            JOptionPane.showMessageDialog(null, "-----------------------------------------\n" + 
                                                "                CONFIRMADO               \n" +
                                                "-----------------------------------------");
        }
    }
}
