package controllers;

import ejbs.TipoProductoFacadeLocal;
import entities.TipoProducto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;


@Named(value = "tipoProductoController")
@SessionScoped
public class TipoProductoController implements Serializable {

    //Variables
    @EJB
    private TipoProductoFacadeLocal tipoProductoEJB;
    private List<TipoProducto> tipoProductos;
    private TipoProducto tipoProducto;
    
    
    //Constructores
    public TipoProductoController() {
    }
    
    //PostConstruct
    @PostConstruct
    public void init(){
        tipoProductos = new LinkedList<>();
        tipoProducto = new TipoProducto();
    
    }
    
    //Getters y Setters

    public TipoProductoFacadeLocal getTipoProductoEJB() {
        return tipoProductoEJB;
    }

    public void setTipoProductoEJB(TipoProductoFacadeLocal tipoProductoEJB) {
        this.tipoProductoEJB = tipoProductoEJB;
    }

    public List<TipoProducto> getTipoProductos() {
        return tipoProductos;
    }

    public void setTipoProductos(List<TipoProducto> tipoProductos) {
        this.tipoProductos = tipoProductos;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    //Mis metodos
    
    public void obtenerTodos(){
        tipoProductos = tipoProductoEJB.findAll();
    }
    
    public void obtenerUno(){
        tipoProducto = tipoProductoEJB.find(tipoProducto.getIdTipoProducto());
    }
    
    public void insertar(){
        tipoProductoEJB.create(tipoProducto);
    }
    
    public void actualizar(){
        tipoProductoEJB.edit(tipoProducto);
    }
    
    public void eliminar(){
        tipoProductoEJB.remove(tipoProducto);
    }
    
    
    
}
