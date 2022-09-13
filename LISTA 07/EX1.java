import java.util.Scanner;

public class EX1 {
    
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];
            Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<a.length;i++) {
            System.out.print("informe o "+(i+1)+" numero do vetor A: ");
            a[i] = scanner.nextInt();

        }
        System.out.println("================================================");
        for (int i = 0; i<b.length; i++) {
            System.out.print("informe o "+(i+1)+" numero do vetor B: ");
            b[i] = scanner.nextInt();
        }
        System.out.println("================================================");

        for (int i = 0; i<c.length; i++) {
            c[i]= (a[i]-(b[i]*a[i]));
            System.out.println("C posicao "+(i+1)+": "+c[i]);
        }

    }
}
