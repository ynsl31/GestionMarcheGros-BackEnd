package ma.sic.mg.personnel.repository;

import org.springframework.data.repository.CrudRepository;

import ma.sic.mg.personnel.models.AgentBalance;
import ma.sic.mg.personnel.models.Mandataire;

public interface IAgentBalanceRep  extends  CrudRepository<AgentBalance,Integer> {
	AgentBalance findById(int id );

}
