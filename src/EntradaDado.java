import javax.swing.*;

public class EntradaDado {
    public static void main(String[] args){
        //Entrada de Dados via JOPtionPane
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Informa a idade da pessoa"));
        //System.out.println("A pessoa tem " + idade + " anos");
        JOptionPane.showMessageDialog(null, "A pessoa tem " + idade + " anos");
    }
}
