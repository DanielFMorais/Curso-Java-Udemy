import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, me informe o valor do eixo X");
        double x = sc.nextDouble();
        System.out.println("Por favor, me informe o valor do eixo Y");
        double y = sc.nextDouble();

        if (x < 0 && y > 1){
            System.out.println("O ponto está no quadrante Q2");
        }else if (x > 0 && y > 1){
            System.out.println("O ponto está no quadrante Q1");
        }else if (x < 0 && y < 1){
            System.out.println("O ponto está no quadrante Q3");
        }else if (x > 0 && y < 1){
            System.out.println("O ponto está no quadrante Q4");
        }else if (x == 0 && y == 0){
            System.out.println("O ponto está no eixo central");
        }else if ((x < 0 || x > 0) && y == 0){
            System.out.println("O ponto está no eixo X");
        }else if ((y < 0 || y > 0) && x == 0){
            System.out.println("O ponto está no eixo Y");
        }else{
            System.out.println("O ponto está fora do quadrante");
        }

        sc.close();
    }

}
