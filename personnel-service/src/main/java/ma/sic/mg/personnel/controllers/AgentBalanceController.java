package ma.sic.mg.personnel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.sic.mg.personnel.models.AgentBalance;
import ma.sic.mg.personnel.repository.IAgentBalanceRep;



@RestController
@RequestMapping("AgentBalances")
@CrossOrigin(origins = "http://localhost:4200")  
public class AgentBalanceController {
	@Autowired
	private IAgentBalanceRep AgentBalanceRepository;
	
	@GetMapping("/all")
	public List<AgentBalance> findAll(){
		return (List<AgentBalance>) AgentBalanceRepository.findAll();
	}
	@GetMapping("/find/{id}")
	public AgentBalance findAgentBalance(@PathVariable(required = true) String id){
		return AgentBalanceRepository.findById(Integer.parseInt(id));
	}
	
	@PostMapping("/save")
	public void save(@RequestBody AgentBalance AgentBalance) {
		AgentBalanceRepository.save(AgentBalance);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id){
		System.out.println("id = "+id);
		AgentBalance AgentBalance=AgentBalanceRepository.findById(Integer.parseInt(id));
		AgentBalanceRepository.delete(AgentBalance);	
	}
	

}
