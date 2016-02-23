package fiftygram.repository;

import fiftygram.entity.Followers;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FollowersRepository extends JpaRepository<Followers, Long> {
}
