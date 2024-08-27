package br.com.joaomiguelg.dao;

import br.com.joaomiguelg.dao.generic.IGenericDAO;
import br.com.joaomiguelg.domain.Venda;
import br.com.joaomiguelg.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
