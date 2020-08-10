package ma.sic.mg.personnel.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue("Agent de Balance")
public class AgentBalance  extends Personne{
	private int matrecule;
	

}
