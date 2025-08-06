import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, me informe o código do Item");
        int codigo = sc.nextInt();

        int item1 = 4, item3 = 5, item4 = 2;
        double item2 = 4.5, item5 = 1.5;

        double valorItem = 0;
        if (codigo == 1){
            valorItem = item1;
        }else if (codigo == 2){
            valorItem = item2;
        }else if (codigo == 3){
            valorItem = item3;
        }else if (codigo == 4){
            valorItem = item4;
        }else if (codigo == 5){
            valorItem = item5;
        }else {
            System.out.println("Código inválido");
        }

        System.out.println("Quantos deste Item você vai desejar?");
        int quantidade = sc.nextInt();

        System.out.printf("O valor total a pagar é de %.2f", valorItem * quantidade);

        sc.close();
    }

}
