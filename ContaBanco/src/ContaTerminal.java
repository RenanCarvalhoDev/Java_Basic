import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in); 
        int numero;
        String agencia, nomeCliente;
        double saldo;
        

        System.out.printf("Informe o numero da sua conta: ");
        numero = ler.nextInt(); 

        System.out.printf("Informe o numero da sua Agencia, separado com (-) o digito: ");
        agencia = ler.next(); 

        System.out.printf("Informe o seu nome: ");
        nomeCliente = ler.next(); 

        System.out.printf("Informe o saldo da sua conta: ");
        saldo = ler.nextDouble(); 

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);


  
    }
}
