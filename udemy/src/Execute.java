


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Execute {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Qual o departamento do funcionário? ");
        String nomeDepartamento = sc.next();
        System.out.println("Informe o nome do trabalhador: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.println("Informe o level do trabalhador: ");
        String levelTrabalhador = sc.next();
        System.out.println("Informe o salário dele");
        Double salarioTrabalhador = sc.nextDouble();
        Funcionario worker_felipe = new Funcionario(new Departamento(nomeDepartamento), nomeTrabalhador, Level.valueOf(levelTrabalhador), salarioTrabalhador);

        System.out.println("Quantos contratos a cadastrar? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Informe o valor por hora: ");
            Double vph = sc.nextDouble();
            System.out.println("Informe a data do contrato (DD/MM/YYYY) ");
            Date data = sdf.parse(sc.next());
            System.out.println("Informe a quantas horas traballhadas");
            int h = sc.nextInt();

            Contrato ct = new Contrato(data, vph, h);
            worker_felipe.addContrato(ct);
        }

        sc.close();
        
    }
}
