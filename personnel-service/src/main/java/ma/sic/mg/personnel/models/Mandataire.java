package ma.sic.mg.personnel.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ma.sic.mg.personnel.models.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue("Mandataire")
public class Mandataire  extends Personne {

	
}
