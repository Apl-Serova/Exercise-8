import java.util.Scanner;
public class Exercise8 {
    public static void main (String [] args){
        System.out.println("Введите 5 элементов массива: ");
        int[] chis = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            chis[i] = s.nextInt();
        }
        System.out.println("Элементы массива, умноженные на 2:");
        for (int I =0;I<5;I++ ) {
            System.out.print(chis[I]*2 + ", ");
        }
    }
}
