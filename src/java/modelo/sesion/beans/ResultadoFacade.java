/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.sesion.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entidades.Resultado;

/**
 *
 * @author Flavio Molina
 */
@Stateless
public class ResultadoFacade extends AbstractFacade<Resultado> {

    @PersistenceContext(unitName = "ProyectoHDPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResultadoFacade() {
        super(Resultado.class);
    }
    
}
