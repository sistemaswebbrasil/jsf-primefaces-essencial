package br.com.siswbrasil.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.siswbrasil.model.Empresa;
import br.com.siswbrasil.repository.EmpresaRepository;
import br.com.siswbrasil.util.Transacional;

public class CadastroEmpresaService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EmpresaRepository empresaRepository;

	@Transacional
	public void salvar(Empresa empresa) {
		empresaRepository.guardar(empresa);
	}

	@Transacional
	public void excluir(Empresa empresa) {
		empresaRepository.remover(empresa);
	}

}
