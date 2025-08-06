import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor me informe um número (irei dizer se ele é positivo ou negativo)");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("O número é negativo");
        }else{
            System.out.println("O número é positivo");
        }
        
    sc.close();
    }

}
