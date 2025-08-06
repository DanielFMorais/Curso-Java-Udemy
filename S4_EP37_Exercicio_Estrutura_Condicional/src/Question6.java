import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Por favor, me diga um valor e irei informar se ele esta em um dos intervalos:");
        System.out.println("\n\n(0,25), (25,50), (50,75), (75,100)\n\n");
        
        int valor = sc.nextInt();

        if (valor >= 0 && valor <= 25){
            System.out.println("O valor está entre 0 e 25");
        }else if (valor > 25 && valor <= 50){
            System.out.println("O valor está entre 25 e 50");
        }else if (valor > 50 && valor <= 75){
            System.out.println("O valor está entre 50 e 75");
        }else if (valor > 75 && valor <= 100){
            System.out.println("O valor está entre 75 e 100");
        }else{
            System.out.println("O valor está fora dos intervalos propostos");
        }

        sc.close();
    }

}
