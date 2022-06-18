/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Flavio Molina
 */
@Entity
@Table(name = "videos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Videos.findAll", query = "SELECT v FROM Videos v")
    , @NamedQuery(name = "Videos.findByIdVideo", query = "SELECT v FROM Videos v WHERE v.idVideo = :idVideo")
    , @NamedQuery(name = "Videos.findByUrl", query = "SELECT v FROM Videos v WHERE v.url = :url")
    , @NamedQuery(name = "Videos.findByDescripcion", query = "SELECT v FROM Videos v WHERE v.descripcion = :descripcion")
    , @NamedQuery(name = "Videos.findByTitulo", query = "SELECT v FROM Videos v WHERE v.titulo = :titulo")})
public class Videos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVideo")
    private Integer idVideo;
    @Size(max = 10000)
    @Column(name = "url")
    private String url;
    @Size(max = 500)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 100)
    @Column(name = "titulo")
    private String titulo;
    @JoinColumn(name = "idCursos", referencedColumnName = "idCursos")
    @ManyToOne
    private Cursos idCursos;

    public Videos() {
    }

    public Videos(Integer idVideo) {
        this.idVideo = idVideo;
    }

    public Integer getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(Integer idVideo) {
        this.idVideo = idVideo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cursos getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(Cursos idCursos) {
        this.idCursos = idCursos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVideo != null ? idVideo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Videos)) {
            return false;
        }
        Videos other = (Videos) object;
        if ((this.idVideo == null && other.idVideo != null) || (this.idVideo != null && !this.idVideo.equals(other.idVideo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidades.Videos[ idVideo=" + idVideo + " ]";
    }
    
}
