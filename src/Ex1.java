import java.util.Scanner;

public class Ex1 {
    static void main() {
        int num, total;
        Scanner sc = new Scanner(System.in);
        IO.println("--- ULTIMATE CALCULADOR DE FATORIAIS :D ---\n\n");
        IO.print("Digite o número a ser fatorado:");
        num = sc.nextInt();
        total = 1;
        for(int i = num; i >= 1; i--){
            total *= i;
            if (i != 1){
                IO.print(i+"x");
            }else{
                IO.print(i);
            }
        }
        IO.print("="+total);
    }
}
