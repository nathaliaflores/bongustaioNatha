package controllers;

import ejbs.CatalogoFacadeLocal;
import entities.Catalogo;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;


@Named(value = "catalogoController")
@SessionScoped
public class CatalogoController implements Serializable {

    //Variables
    @EJB
    private CatalogoFacadeLocal catalogoEJB;
    private List<Catalogo> catalogos;
    private Catalogo catalogo;
    
    
    //Constructores
    public CatalogoController() {
    }
    
    //PostConstruct
    @PostConstruct
    public void init(){
        catalogos = new LinkedList<>();
        catalogo = new Catalogo();
    
    }
    
    //Getters y Setters

    public CatalogoFacadeLocal getCatalogoEJB() {
        return catalogoEJB;
    }

    public void setCatalogoEJB(CatalogoFacadeLocal catalogoEJB) {
        this.catalogoEJB = catalogoEJB;
    }

    public List<Catalogo> getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(List<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    
    //Mis metodos
    
    public void obtenerTodos(){
        catalogos = catalogoEJB.findAll();
    }
    
    public void obtenerUno(){
        catalogo = catalogoEJB.find(catalogo.getIdCatalogo());
    }
    
    public void insertar(){
        catalogoEJB.create(catalogo);
    }
    
    public void actualizar(){
        catalogoEJB.edit(catalogo);
    }
    
    public void eliminar(){
        catalogoEJB.remove(catalogo);
    }
    
    
    
}
