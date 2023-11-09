
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);
        int valorCorreto = 1000;
        int palpite;

        System.out.println("Digite um palpite");
        palpite = Leitor.nextInt();

        while (palpite != valorCorreto){

            if(palpite > valorCorreto){
                System.out.println("Um pouco menos");
            } else {
                System.out.println("Um pouco mais");
            }
            System.out.println("Digite um palpite");
            palpite = Leitor.nextInt();
            }

        System.out.println("Você acertou");
    }
    }
