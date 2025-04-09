import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Execute t = new Execute();
        ListaEncadeadaViagem l = new ListaEncadeadaViagem();
        int opc;

        do{ 
            t.menu();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("\nDigite o nome da viagem: ");
                    l.adicionar(sc.next());
                    break;
                case 2:
                    l.remover();
                    break;
                case 3:
                    l.listar();
                    break;
                default:
                    break;
            }
        }while(opc != 0);
        sc.close();
    }

    public void menu(){
        System.out.println("\n1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Listar");
        System.out.println("0 - Sair");
        System.out.println("Insira a opeção desejada: ");
    }
}