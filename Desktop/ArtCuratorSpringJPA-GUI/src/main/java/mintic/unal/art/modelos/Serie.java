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
@Table(name = "Serie")
public class Serie {
    
    @Id
    @GeneratedValue
    @Column(name="Serie_id")
    private Integer SerieId;
    
    @Column(name="Serie_nombre")
    private String SerieNombre;
       
    @Column(name="Serie_Temp")
    private Integer SerieTemp;
    
    @Column(name="Serie_Cap")
    private Integer SerieCap;
    

    @Column(name="contenido_id")
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "exp_id")
    Long ContenidoId;

    public Integer getSerieId() {
        return SerieId;
    }

    public void setSerieId(Integer SerieId) {
        this.SerieId = SerieId;
    }

    public String getSerieNombre() {
        return SerieNombre;
    }

    public void setSerieNombre(String SerieNombre) {
        this.SerieNombre = SerieNombre;
    }

    public Integer getSerieTemp() {
        return SerieTemp;
    }

    public void setSerieTemp(Integer SerieTemp) {
        this.SerieTemp = SerieTemp;
    }

    public Integer getSerieCap() {
        return SerieCap;
    }

    public void setSerieCap(Integer SerieCap) {
        this.SerieCap = SerieCap;
    }

   

    @Override
    public String toString() {
        return "La serie " + SerieNombre + " Tiene " + SerieTemp + " temporadas y " + SerieCap + " capitulos." ;
    }




       
    
    
}


