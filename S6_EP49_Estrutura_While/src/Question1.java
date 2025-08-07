import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaValida = 2002;
        System.out.println("Digite a senha: ");
        int senhaDigitada = sc.nextInt();

        while (senhaDigitada != 2002){
            System.out.println("Senha incorreta, digite novamente: ");
            senhaDigitada = sc.nextInt();
            if (senhaDigitada == senhaValida){
                System.out.println("Senha correta!");
                break;
            }
        }

        sc.close();
    }

}
