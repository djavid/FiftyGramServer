package fiftygram.repository;

import fiftygram.entity.Party;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PartyRepository extends JpaRepository<Party, Integer> {
}
