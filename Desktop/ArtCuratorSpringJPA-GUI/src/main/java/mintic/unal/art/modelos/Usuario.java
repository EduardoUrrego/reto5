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
@Table(name = "Usuario")
public class Usuario {
    
    @Id
    @GeneratedValue
    @Column(name="Usuario_id")
    private Long UsuarioId;
    
    @Column(name="Usuario_alias")
    private String UsuarioAlias;
    
    @Column(name="Usuario_nombre")
    private String UsuarioNombre;
    
    @Column(name="Usuario_Apellido")
    private String UsuarioApellido;
    
    @Column(name="Usuario_email")
    private String UsuarioEmail;
       
        
    @Column(name="Usuario_contra")
    private String UsuarioContra;
        

    @Column(name="contenido_id")
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "exp_id")
    Long ContenidoId;

    public Long getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(Long UsuarioId) {
        this.UsuarioId = UsuarioId;
    }

    public String UsuarioAlias() {
        return UsuarioAlias;
    }

    public void UsuarioAlias(String UsuarioAlias) {
        this.UsuarioAlias = UsuarioAlias;
    }

    public String getUsuarioNombre() {
        return UsuarioNombre;
    }

    public void setUsuarioNombre(String UsuarioNombre) {
        this.UsuarioNombre = UsuarioNombre;
    }
    
    public String getUsuarioApellido() {
        return UsuarioApellido;
    }

    public void setUsuarioApellido(String UsuarioApellido) {
        this.UsuarioApellido = UsuarioApellido;
    }

    public String getUsuarioEmail() {
        return UsuarioEmail;
    }

    public void setUsuarioEmail(String UsuarioEmail) {
        this.UsuarioEmail = UsuarioEmail;
    }

    public String getUsuarioContra() {
        return UsuarioContra;
    }

    public void setPeliculaAnio(String UsuarioContra) {
        this.UsuarioContra = UsuarioContra;
    }

   

    @Override
    public String toString() {
        return "El usuario " + UsuarioId + " tiene el alias de; " + UsuarioAlias + " y se llama " + UsuarioNombre + "." ;
    }




       
    
    
}