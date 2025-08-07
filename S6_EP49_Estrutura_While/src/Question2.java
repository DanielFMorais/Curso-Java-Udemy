import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = 1,y =1;
        
        System.out.println("Por favor, me informe o valor do eixo X");
        x = sc.nextDouble();
        System.out.println("Por favor, me informe o valor do eixo Y");
        y = sc.nextDouble();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
            System.out.println("O ponto está no quadrante Q1");
            } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no quadrante Q2");
            } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no quadrante Q3");
            } else if (x > 0 && y < 0) {
            System.out.println("O ponto está no quadrante Q4");
            }
            System.out.println("Por favor, me informe o valor do eixo X");
            x = sc.nextDouble();
            System.out.println("Por favor, me informe o valor do eixo Y");
            y = sc.nextDouble();
        }

        sc.close();
    }
}
