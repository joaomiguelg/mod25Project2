package br.com.joaomiguelg.services;

import br.com.joaomiguelg.dao.IClienteDAO;
import br.com.joaomiguelg.domain.Cliente;
import br.com.joaomiguelg.exceptions.TipoChaveNaoEncontradaException;
import br.com.joaomiguelg.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        this.clienteDAO = clienteDAO;
    }
    //@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
	return clienteDAO.cadastrar(cliente);
}

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }

	@Override
	public void excluir(Long cpf) {
		clienteDAO.excluir(cpf);
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
		clienteDAO.alterar(cliente);
	}

}
