import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        int qtEmpregados;
        Scanner sc = new Scanner(System.in);
        List <Empregado> listaEmpregados = new ArrayList<>();


        System.out.println("Quantos empregados pretende cadastrar: ");
        qtEmpregados = sc.nextInt();
        for(int i=1;i<=qtEmpregados;i++){
            System.out.println("Terceirizado? (y/n)");
            char resp = sc.next().charAt(0);
            System.out.println("Name: ");
            String nome = sc.next();
            System.out.println("Horas: ");
            int horas = sc.nextInt();
            System.out.println("Valor por hora: ");
            double valorHora = sc.nextDouble();
            
            if (resp == 'y') {
                System.out.println("Gastro adicional: ");
                double gasto = sc.nextDouble();
                Empregado e = new EmpregadoTerceirizado(nome, horas, valorHora,gasto);
                listaEmpregados.add(e);
            }else{
                Empregado e = new Empregado(nome, horas, valorHora);
                listaEmpregados.add(e);
            }
        }

        for (Empregado empregado : listaEmpregados) {
            System.out.println(empregado.getNome());
            System.out.println(empregado.pagamento());
        }

    }
}
