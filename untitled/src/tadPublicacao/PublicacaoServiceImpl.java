package tadPublicacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PublicacaoServiceImpl implements PublicacaoService {
    private List<Publicacao> publicacoes = new ArrayList<>();

    @Override
    public void adicionar(Publicacao publicacao) {
        publicacoes.add(publicacao);
    }

    @Override
    public void atualizar(int id, String novoConteudo) {
        for (Publicacao pub : publicacoes) {
            if (pub.getId() == id) {
                pub.setConteudo(novoConteudo);
                return;
            }
        }
        System.out.println("Publicação com ID " + id + " não encontrada.");
    }

    @Override
    public void remover(int id) {
        Iterator<Publicacao> iterator = publicacoes.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Publicação com ID " + id + " não encontrada.");
    }

    @Override
    public List<Publicacao> listar() {
        return new ArrayList<>(publicacoes);
    }
}

