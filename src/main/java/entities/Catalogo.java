package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "catalogo")
public class Catalogo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcatalogo")
    private int idCatalogo;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "preciounit")
    private double precioUnitario;
    
    @Column(name = "cantidad")
    private int cantidad;
    
    @ManyToOne
    @JoinColumn(name = "idtipoproduc")
    private TipoProducto tipoProducto;

    public Catalogo() {
    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "idCatalogo=" + idCatalogo + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad + ", tipoProducto=" + tipoProducto + '}';
    }
    
}
