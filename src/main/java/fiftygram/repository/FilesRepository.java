package fiftygram.repository;

import fiftygram.entity.Files;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FilesRepository extends JpaRepository<Files,Long> {
}
