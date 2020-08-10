package ma.sic.mg.personnel.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
@DiscriminatorValue("Personne")
public class Personne {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int idPers;
private String nom ;
private String prenom ;
private String tel ;
private String adresse;
@Column(name="type", insertable=false, updatable=false)
private String type  ;


}
