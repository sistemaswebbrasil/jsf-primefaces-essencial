package br.com.siswbrasil.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.siswbrasil.model.Empresa;
import br.com.siswbrasil.repository.EmpresaRepository;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private EmpresaRepository empresaRepository;
    
    private List<Empresa> listaEmpresas;
    
    public void todasEmpresas() {
        listaEmpresas = empresaRepository.todas();
    }
    
    public List<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }

}
