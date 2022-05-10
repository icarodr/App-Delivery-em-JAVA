import javax.swing.*;
import java.util.*;

public class Usuarios {

    void user(){
        
        List myArrayList = new ArrayList();
    
    if(opcao_entrada == 2){
        int entrar_usuario = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo: \n" +
        "(1) - Quero me cadastrar\n"+
        "(2) - Já possuo um cadastro"));

        if(entrar_usuario == 1){
            String nome_usuario = JOptionPane.showInputDialog(null, "Insira o seu nome: ");
            String cpf_usuario = JOptionPane.showInputDialog(null, "Insira o CPF: ");
            String endereco_usuario = JOptionPane.showInputDialog(null, "Insira o endereço: ");

            myArrayList.add(nome_usuario);
            myArrayList.add(cpf_usuario);
            myArrayList.add(endereco_usuario);

            JOptionPane.showMessageDialog(null,"Bem-Vindo(a) " + nome_usuario);

        }
        JOptionPane.showMessageDialog(null, "-----------------------------------------\n" + 
                                            "                CADASTRADO               \n" +
                                            "-----------------------------------------");
    }
}
    



    // String nome_usuario;
    // String cpf_usuario;

    //     if(opcao_entrada == 2){
    //         int entrar_usuario = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo: \n" +
    //         "(1) - Quero me cadastrar\n"+
    //         "(2) - Já possuo um cadastro"));

    //         if(entrar_usuario == 1){
    //             nome_usuario = JOptionPane.showInputDialog(null,"Insira o nome do Usuário: ");
    //             cpf_usuario = JOptionPane.showInputDialog(null,"Insira o CPF do Usuário: ");

    //             myArrayList.add(nome_usuario);
    //             myArrayList.add(cpf_usuario);

    //         }
    //         JOptionPane.showMessageDialog(null, "-----------------------------------------\n" + 
    //                                             "                CADASTRADO               \n" +
    //                                             "-----------------------------------------");
    // }
}
