package ma.sic.mg.personnel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.sic.mg.personnel.models.Mandataire;

public interface IMandataireRep extends JpaRepository<Mandataire,Integer> {
	Mandataire findById(int id);

}

