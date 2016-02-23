package fiftygram.repository;

import fiftygram.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by mikhailarzumanov on 23.02.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
