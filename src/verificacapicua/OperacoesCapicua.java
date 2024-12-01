/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verificacapicua;

/**
 *
 * @author REGYANE
 */
public class OperacoesCapicua {
    // Método que calcula o reverso de um número
    public int reverso(int numero) {
        int soma = 0, resto;
        
        while (numero != 0) {
            resto = numero % 10;  // Último dígito
            soma = soma * 10 + resto;  // Adiciona o dígito ao reverso
            numero /= 10;  // Remove o último dígito
        }
        return soma;
    }
}
    
