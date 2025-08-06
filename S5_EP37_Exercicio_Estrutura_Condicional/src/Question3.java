import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, me informe o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Por favor, me informe o segundo número");
        int num2 = sc.nextInt();

        if (num2 % num1 == 0 || num1 % num2 == 0){
            System.out.printf("o numero %d é multiplo do %d", num2, num1);
        }
        else{
            System.out.printf("o numero %d NÃO é multiplo do %d", num2, num1);
        }
        
    sc.close();
    }
}
