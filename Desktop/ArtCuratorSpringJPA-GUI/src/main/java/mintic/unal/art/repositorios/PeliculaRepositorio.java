/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.art.repositorios;

import mintic.unal.art.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joag
 */
@Repository
public interface PeliculaRepositorio extends JpaRepository<Pelicula, Long>{
    
}
