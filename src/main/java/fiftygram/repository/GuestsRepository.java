package fiftygram.repository;

import fiftygram.entity.Guests;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GuestsRepository extends JpaRepository<Guests, Long> {

}
