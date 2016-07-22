package fiftygram.repository;

import fiftygram.entity.Followers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FollowersRepository extends JpaRepository<Followers, Long> {

}
