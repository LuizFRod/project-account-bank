import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Por favor, insira o número da conta: ");
        int Numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o numero da agência: ");
        String Agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo: ");
        String NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        Double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta " + Numero + " 200e seu saldo "+ Saldo +" já está disponível para saque");









}   





}