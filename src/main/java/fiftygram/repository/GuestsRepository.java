package fiftygram.repository;

import fiftygram.entity.Guests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GuestsRepository extends JpaRepository<Guests, Long> {
    List<Guests> findByPartyId(long partyId);
}
