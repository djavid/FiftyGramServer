package fiftygram.repository;

/**
 * Created by mikhailarzumanov on 23.02.16.
 */
import fiftygram.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {

}
