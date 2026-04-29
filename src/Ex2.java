import java.util.Scanner;

public class Ex2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n, num, maior, menor;
        IO.println("======ULTIMATE CALCULATOR DE MAIOR E MENOR======");
        IO.println("Digite o quanto de números você irá colocar no calculator:");
        n = sc.nextInt();
        IO.print("Digite: ");
        num = sc.nextInt();
        maior = num;
        menor = num;
        for(int i = 2; i <= n; i++){
            IO.print("Digite: ");
            num = sc.nextInt();
            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
        }
        IO.println("Menor número digitado: " + menor);
        IO.println("Maior número digitado: " + maior);
    }
}
