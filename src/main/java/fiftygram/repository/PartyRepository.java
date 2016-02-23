package fiftygram.repository;

import fiftygram.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PartyRepository extends JpaRepository<Party, Long> {

}
