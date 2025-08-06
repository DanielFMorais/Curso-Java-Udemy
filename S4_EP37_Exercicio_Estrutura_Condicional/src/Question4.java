import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, me diga que horas você começou a jogar?");
        int hora = sc.nextInt();

        System.out.println("Por favor, me diga que horas você terminou a jogar?");
        int horaFinal = sc.nextInt();

        int diferenca;

        if (horaFinal < hora){
            diferenca = 24 - hora + horaFinal;
            System.out.printf("A duração da partida foi de %d horas", diferenca);
        }else{
            diferenca = horaFinal - hora;
            System.out.printf("A duração da partida foi de %d horas", diferenca);
        }

        sc.close();
    }
}
