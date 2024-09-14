import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String agency;
        String name;
        double balance;

        System.out.println("Por favor, digite o seu nome.");
        name = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência.");
        agency = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta.");
        number = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta");
        balance = scanner.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta" +
                " em nosso banco, sua agência é " + agency + "," +
                " conta " + number + " e seu saldo " + balance + " já está disponível para saque");
    }

}