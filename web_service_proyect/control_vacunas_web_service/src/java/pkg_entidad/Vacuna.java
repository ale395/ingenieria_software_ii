/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hiro
 */
@Entity
@Table(name = "vacuna")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vacunas.findAll", query = "SELECT v FROM Vacuna v")
    , @NamedQuery(name = "Vacunas.findById", query = "SELECT v FROM Vacuna v WHERE v.id = :id")
    , @NamedQuery(name = "Vacunas.findByNombre", query = "SELECT v FROM Vacuna v WHERE v.nombre = :nombre")
    , @NamedQuery(name = "Vacunas.findByFechaAplicacion", query = "SELECT v FROM Vacuna v WHERE v.fechaAplicacion = :fechaAplicacion")
    , @NamedQuery(name = "Vacunas.findByAplicada", query = "SELECT v FROM Vacuna v WHERE v.aplicada = :aplicada")})
public class Vacuna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 3)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fecha_aplicacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAplicacion;
    @Size(max = 1)
    @Column(name = "aplicada")
    private String aplicada;
    @JoinColumn(name = "id_hijo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Hijo idHijo;

    public Vacuna() {
    }

    public Vacuna(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public String getAplicada() {
        return aplicada;
    }

    public void setAplicada(String aplicada) {
        this.aplicada = aplicada;
    }

    public Hijo getIdHijo() {
        return idHijo;
    }

    public void setIdHijo(Hijo idHijo) {
        this.idHijo = idHijo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacuna)) {
            return false;
        }
        Vacuna other = (Vacuna) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkg_entidad.Vacuna[ id=" + id + " ]";
    }
    
}
