import java.util.Scanner;

public class PotenciaRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PotenciaRecursiva p = new PotenciaRecursiva();
        int x,y;

        System.out.println("Digite o valor da Base: ");
        x = sc.nextInt();
        System.out.println("Digite o índice potência: ");
        y = sc.nextInt();
        System.out.println(p.calcularPontecia(x, y));
    }

    public int calcularPontecia(int x, int y){
        if (y == 0) {
            return 1;
        }else if (y == 1) {
            return x;
        }else{
            return calcularPontecia(x, y-1) * x;
        }
    }
}
