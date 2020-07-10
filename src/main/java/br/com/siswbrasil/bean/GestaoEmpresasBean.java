package br.com.siswbrasil.bean;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.siswbrasil.model.Empresa;
import br.com.siswbrasil.model.TipoEmpresa;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Empresa empresa ;
    
    public void salvar() {
        System.out.println("Razão social: " + empresa.getRazaoSocial()
                + " - Nome fantasia: " + empresa.getNomeFantasia()
                + " - Tipo: " + empresa.getTipo());
    }
    
    public String ajuda() {
        return "AjudaGestaoEmpresas?faces-redirect=true";
    }
    
    
    public Empresa getEmpresa() {
        return empresa;
    }
    
    public TipoEmpresa[] getTiposEmpresa() {
        return TipoEmpresa.values();
    }
}
