/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicio;

import java.util.Scanner;

/**
 *
 * @author venilson_gomes
 */
public class Cliente {
    
    Scanner scan = new Scanner(System.in);
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldoConta;
    private boolean status;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public void abrirConta(){
        int conta;
        System.out.println("Digite Seu nome Completo");
        this.dono = scan.nextLine();
        
        System.out.println("Deseja abrir uma conta Poupança ou Corrente ?"
                           + " digite 1 para poupança e 2 para Corrente ");
        
        conta = scan.nextInt();
        switch (conta) {
            case 1:
                this.tipo = "Conta Poupança";
                this.setSaldoConta(150f);
                this.setNumConta(111111111);
                this.setStatus(true);
                System.out.println("Conta Poupança Criada com sucesso");
                break;
            case 2:
                this.tipo = "Conta Corrente";
                this.setSaldoConta(50f);
                this.setNumConta(222222222);
                this.setStatus(true);
                 System.out.println("Conta Corrente Criada com sucesso");
                break;
            default:
                System.out.println("Valor Invalido Digite 1 ou 2 ");
                break;
        }
        
    }
    public void Extrato(){
        System.out.println("Cliente: " + this.getDono() + "\n" + "Tipo da Conta: " + this.getTipo() + "\n"
                + "Numero da Conta: " + this.getNumConta()+ "\n" + "Saldo Conta: " + this.getSaldoConta() 
                + "\n" + "Status Conta: " + this.isStatus() );
    }
    
public void FecharConta(){
    if(this.status == false){
        System.out.printf("Impossivel Fechar conta, A mesma ja esta fechada");
    }else if(this.saldoConta != 0){
        System.out.println("Impossivel Fechar conta, A mesma se encontra com saldo");
    }else{
    this.setStatus(false);
    System.out.println("Conta Fechada com Sucesso");
    }
}    

    public void depositar(){
         if(this.status == false){
            System.out.println("Impossivel Depositar, sua conta se encontrar fechada");
        }else{
            System.out.println("Informe o valor a Depositar");
            float valor = scan.nextShort();
            
            this.setSaldoConta(this.saldoConta+= valor);
    }
    }
    
    public void sacar(){
        if(this.status == false){
            System.out.println("Impossivel sacar, sua conta se encontrar fechada");
        }else{
            System.out.println("Informe o valor a se Sacado");
            float valor = scan.nextShort();
            if(valor > this.saldoConta){
                System.out.println("Saldo insuficiente");
            }else{
            this.setSaldoConta(this.saldoConta - valor);
            System.out.println("Saque realizado com sucesso");
            Extrato();
            }
        }
    }
    public void pagarMensalidade(){
         if(this.status == false){
        System.out.printf("A conta se encontra fechada "); 
    }else{
             if(" conta Poupança".equals(this.tipo)){
                 this.setSaldoConta(this.saldoConta -= 20);
             }else{
                  this.setSaldoConta(this.saldoConta -= 12);
             }
             
         }
}
}