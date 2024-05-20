import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        // Inportando o Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Mensagem Inícial
        System.out.println("---------------CONTA BANCÁRIA---------------");
		System.out.println();

        // Mensagem de boas vindas
        System.out.println("Olá, seja bem vindo, ao Banco Itaú!");

        // Separador de texto ----------
        System.out.println("----------------------------------------------");
        // Input para inserir o nome do úsuario
        System.out.printf("Digite seu nome: ");
        String nomeCliente = sc.nextLine();
        // Input para inserir o sobre nome do úsuario
        System.out.printf("Digite seu sobre nome: ");
        String sobreNome = sc.nextLine();
        // Separador de texto ----------
        System.out.println("----------------------------------------------");
        // Input para insrir a agência
        System.out.println("Digite o numero de sua agência: Exemplo 000-0");
        String agencia = sc.nextLine();
        // Separador de texto ----------
        System.out.println("----------------------------------------------");
        // Input para inserir sia conta
        System.out.println("Digite o número da conta: Exemplo: 0000 ");
        int numero = sc.nextInt();
        // Separador de texto ----------
        System.out.println("----------------------------------------------");
        // Input para inserir o valor a ser depositado
        System.out.println("Digite o Valor do seu deposito inicial : ");
        Double saldo = sc.nextDouble();


        System.out.println("Olá, Sr " + nomeCliente + " " + sobreNome + ", Obrigado por criar sua conta em nosso Banco,\n" +
        "sua agência é " + agencia + " conta " + numero + " e seu saldo R$: "  + saldo +"\nJá está disponível para Saque!\n");
        // Separador de texto ----------
        System.out.println("----------------------------------------------");

        double bonus = 0.0;
        
        if(saldo >= 2000){
            //Adiciona 20% de bônus se o valor inserido for maior igual que 2000
            bonus = saldo * 0.2;
            saldo += bonus;       
        }
        // Input para mostar o novo saldo com o bônus do clíente
        System.out.println("Você ganhou um bônus de " + bonus + " então esse é seu novo saldo: " + saldo);
      
        System.out.println("----------------------------------------------");

        // Finalização do Código
        sc.close();

    }
}