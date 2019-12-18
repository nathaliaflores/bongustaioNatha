package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipoproducto")
public class TipoProducto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipoproducto")
    private int idTipoProducto;
    
    @Column(name = "tipoproducto")
    private String tipoProducto;
    
    @Column(name = "estado")
    private int estado;
    
    @OneToMany(mappedBy = "tipoProducto", cascade = CascadeType.ALL)
    private List<Catalogo> catalogos;

    public TipoProducto() {
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Catalogo> getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(List<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }

    @Override
    public String toString() {
        return "TipoProducto{" + "idTipoProducto=" + idTipoProducto + ", tipoProducto=" + tipoProducto + ", estado=" + estado + ", catalogos=" + catalogos + '}';
    }
    
}
