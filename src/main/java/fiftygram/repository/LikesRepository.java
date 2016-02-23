package fiftygram.repository;

import fiftygram.entity.Likes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LikesRepository extends JpaRepository<Likes, Long> {

}
