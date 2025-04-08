
public class ProdutoImportado extends Produto{
   private double taxaDeImportacao;

   public ProdutoImportado() {
   }

   public ProdutoImportado(String nome, double preco, double taxaDeImportacao) {
    super(nome, preco);
    this.taxaDeImportacao = taxaDeImportacao;
   }

   public double getTaxaDeImportacao() {
    return taxaDeImportacao;
   }

   public void setTaxaDeImportacao(double taxaDeImportacao) {
    this.taxaDeImportacao = taxaDeImportacao;
   }

   @Override
   void mostrarEtiqueta() {
    System.out.println("Produto: " + getNome() + "Preço: " + precoTotal() + "Taxa de importação: " + taxaDeImportacao);
   }

   double precoTotal(){
        return getPreco() + taxaDeImportacao;
   }
}
