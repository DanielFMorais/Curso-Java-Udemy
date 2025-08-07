import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipo = 0, tipo1=0, tipo2=0, tipo3=0;

        System.out.println("Por favor, me informe qual seu combustível preferido");
    
            System.out.println("[1] Gasolina");
            System.out.println("[2] Alcool");
            System.out.println("[3] Diesel");
            System.out.println("[4] Sair da escolha");
            tipo = sc.nextInt();

        while (tipo != 4) {
            
            System.out.println("Por favor, me informe qual seu combustível preferido");
    
            System.out.println("[1] Gasolina");
            System.out.println("[2] Alcool");
            System.out.println("[3] Diesel");
            System.out.println("[4] Sair da escolha");
            tipo = sc.nextInt();
    
            if (tipo == 4){
                break;
            }

            switch ( tipo) {
                case 1:
                    tipo1 += 1;
                    break;
                case 2:
                    tipo2 += 1;
                break;
                case 3:
                    tipo3 += 1;
                break;
            }
        }

        System.out.println("Resultadod de escolhas");
        System.out.println("Gasolina: " + tipo1);
        System.out.println("Alcool: " + tipo2);
        System.out.println("Diesel: " + tipo3);

        sc.close();
    }

}
