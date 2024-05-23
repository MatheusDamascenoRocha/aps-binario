import java.util.Scanner;
public class porta_logica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2,n3;
        System.out.printf("digite o primeiro numero: ");
        n1 = ler.nextInt();
        System.out.printf("digite o segundo numero: ");
        n2 = ler.nextInt();
        System.out.printf("digite o terceiro numero: ");
        n3 = ler.nextInt();

        if((n1< n2 && n2< n3) || (n3< n2 && n2<n1 )){
            System.out.println("n2 é o numero do meio");
        }
        else if((n2< n1 && n1< n3) || (n3< n1 && n1<n2 )){
            System.out.println("n1 é o numero do meio");
        }
        else{
            System.out.println("n3 é o numero do meio");
        }
    }
}
