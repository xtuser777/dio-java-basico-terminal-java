import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {
        //String nome = args[0];
        //String sobrenome = args[1];
        //int idade = Integer.valueOf(args[2]);
        //double altura = Double.valueOf(args[3]);

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        String sobrenome = scanner.next();
        int idade = scanner.nextInt();
        double altura = scanner.nextDouble();

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Minha idade é " + idade);
        System.out.println("Minha altura é " + altura);
    }
}