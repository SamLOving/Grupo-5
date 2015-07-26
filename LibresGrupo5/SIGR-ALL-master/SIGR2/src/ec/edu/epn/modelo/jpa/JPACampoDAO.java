package ec.edu.epn.modelo.jpa;

import ec.edu.epn.modelo.dao.CampoDAO;
import ec.edu.epn.modelo.entity.Campo;

public class JPACampoDAO extends JPAGenericDAO<Campo, Integer>
implements CampoDAO {

public JPACampoDAO() {
		super(Campo.class);
	// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Campo> findAllbyEstado(String campoEstadoBorrado) {
		try {
			Query query = em.createNamedQuery("Campo.findAllbyEstado");
			query.setParameter("estadoCampo", campoEstadoBorrado);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Campo>();
		}
	}
}

