/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Inicio;

public class App {
 
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.abrirConta();
        cliente.Extrato();
        
        cliente.sacar();
        cliente.Extrato();
       
        cliente.FecharConta();
        cliente.Extrato();
        
        
        
    }
}
