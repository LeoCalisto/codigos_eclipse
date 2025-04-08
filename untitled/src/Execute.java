public class Execute {
    public static void main(String[] args) {
        ListaEncadeadaViagem l = new ListaEncadeadaViagem();

        l.adicionar("Viagem para ilhas caimã");
        l.adicionar("Viagem para china");
        l.adicionar("Viagem para cairú");

        l.listar();
        System.out.println(l.acharpenultimo());
        l.remover();
        System.out.println("removeu");
        System.out.println(l.acharpenultimo());
        l.remover();
        System.out.println("removeu");
        System.out.println();
        l.listar();
    }
}