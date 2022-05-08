import javax.swing.*;

public class Main{
        
    public static void main(String[] args) {
        String entrar_no_app = JOptionPane.showInputDialog(null, "Deseja entrar no restaurante?");
        Aplicativo app = new Aplicativo();
        
        while(true){
            if (entrar_no_app.equals("sim")){
                app.ligar();
                break;
            }
            if(entrar_no_app.equals("não")){
                JOptionPane.showMessageDialog(null,"Obrigado volte sempre!");
                break;
            }
            else{
                break;
            }
        }
    }
}