package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import models.Funcionario;
import utils.RepositorioGenerico;

@Stateless
public class FuncionarioDAO extends RepositorioGenerico<Funcionario, Long>{
	
    @PersistenceContext(unitName = "MyPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FuncionarioDAO() {
        super(Funcionario.class);
    }

    // Other methods of this service

}
