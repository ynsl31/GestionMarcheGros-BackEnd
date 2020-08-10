package ma.sic.mg.personnel.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue("AgentCommission")
public class AgentCommission extends Personne {

}
