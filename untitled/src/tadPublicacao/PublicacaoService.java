package tadPublicacao;

import java.util.List;

public interface PublicacaoService {
    void adicionar(Publicacao publicacao);
    void atualizar(int id, String novoConteudo);
    void remover(int id);
    List<Publicacao> listar();
}
