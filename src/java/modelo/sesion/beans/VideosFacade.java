/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.sesion.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entidades.Videos;

/**
 *
 * @author Flavio Molina
 */
@Stateless
public class VideosFacade extends AbstractFacade<Videos> {

    @PersistenceContext(unitName = "ProyectoHDPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VideosFacade() {
        super(Videos.class);
    }
    
}
