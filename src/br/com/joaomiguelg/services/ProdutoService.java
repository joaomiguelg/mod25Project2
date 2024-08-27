package br.com.joaomiguelg.services;

import br.com.joaomiguelg.dao.IProdutoDAO;
import br.com.joaomiguelg.domain.Produto;
import br.com.joaomiguelg.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
