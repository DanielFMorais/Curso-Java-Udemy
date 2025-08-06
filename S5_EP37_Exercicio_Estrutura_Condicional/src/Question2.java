import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor me informe um número (irei dizer se ele é par ou ímpar)");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é ímpar");
        }
        
    sc.close();
    }
}
