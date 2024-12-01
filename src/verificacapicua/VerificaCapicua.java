/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificacapicua;
import javax.swing.JOptionPane;

/**
 *
 * @author REGYANE
 */
public class VerificaCapicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacoesCapicua operacoes = new OperacoesCapicua();
        
        // Solicitar número ao usuário
        String input = JOptionPane.showInputDialog(null, "Digite um número:");
        
        try {
            int numero = Integer.parseInt(input);
            int reverso = operacoes.reverso(numero); // Calcula o reverso
            
            // Exibir número original e reverso
            String resultado = numero + " - " + reverso + "\n";
            
            // Verifica se o número é capicua
            if (numero == reverso) {
                resultado += "É um número capicua.";
            } else {
                resultado += "Não é um número capicua.";
            }
            
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número.");
        }
    }
}
        // TODO code application logic here
  