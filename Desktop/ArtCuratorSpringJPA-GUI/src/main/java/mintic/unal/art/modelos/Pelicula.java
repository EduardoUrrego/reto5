/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.art.modelos;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 *
 * @author joag
 */
@Entity
@Table(name = "Pelicula")
public class Pelicula {
    
    @Id
    @GeneratedValue
    @Column(name="Pelicula_id")
    private Long PeliculaId;
    
    @Column(name="Pelicula_nombre")
    private String PeliculaNombre;
    
    @Column(name="Pelicula_resumen")
    private String PeliculaResumen;
       
        
    @Column(name="Pelicula_anio")
    private Long PeliculaAnio;
    

    @Column(name="contenido_id")
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "exp_id")
    Long ContenidoId;

    public Long getSerieId() {
        return PeliculaId;
    }

    public void setPeliculaId(Long SerieId) {
        this.PeliculaId = SerieId;
    }

    public String PeliculaNombre() {
        return PeliculaNombre;
    }

    public void PeliculaNombre(String SerieNombre) {
        this.PeliculaNombre = SerieNombre;
    }

    public String getPeliculaResumen() {
        return PeliculaResumen;
    }

    public void setPeliculaResumen(String PeliculaResumen) {
        this.PeliculaResumen = PeliculaResumen;
    }

    public Long getPeliculaAnio() {
        return PeliculaAnio;
    }

    public void setPeliculaAnio(Long SerieCap) {
        this.PeliculaAnio = SerieCap;
    }

   

    @Override
    public String toString() {
        return "La pelicula " + PeliculaNombre + " se trata de " + PeliculaResumen + " y fue estrenada en el año " + PeliculaAnio + "." ;
    }




       
    
    
}


