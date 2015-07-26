package ec.edu.epn.modelo.dao;

import ec.edu.epn.modelo.entity.Campo;

public interface CampoDAO extends GenericDAO<Campo,Integer> {
  public List<Campo> findAllbyEstado(Integer campoEstadoBorrado);
}
