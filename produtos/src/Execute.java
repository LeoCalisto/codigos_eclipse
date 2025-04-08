import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Execute {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List <Produto> produtos= new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Quantos produtos para cadastrar ? ");
        int qtProdutos = sc.nextInt();
        
        for (int i = 0; i < qtProdutos; i++) {
            System.out.println("Qual o tipo de produto? (c/i/u)");
            char tipoProduto = sc.next().charAt(0);
            System.out.println("Informe o nome do produto: ");
            String  nome = sc.nextLine();
            System.out.println("Informe o nome do produto: ");
            int preco = sc.nextInt();
            
            if (tipoProduto == 'i') {
                System.out.println("Taxa de importação: ");
                double taxinha = sc.nextDouble();
                Produto p = new ProdutoImportado(nome, preco, taxinha);
                produtos.add(p);
                
            }else if(tipoProduto == 'u'){
                System.out.println("Informe a data do contrato (DD/MM/YYYY) ");
                Date data = sdf.parse(sc.next());
                Produto p = new ProdutoUsado(nome, preco, data);
                produtos.add(p);
            }  else{
                Produto p = new Produto(nome, preco);
                produtos.add(p);
            }
        }

        for (Produto produto : produtos) {
            produto.mostrarEtiqueta();
        }
    }
}
