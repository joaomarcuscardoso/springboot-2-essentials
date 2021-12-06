package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/* 06/12/2021 Add Database Dependecy */
public interface AnimeRepository extends JpaRepository<Anime, Long> {
    // Associado com banco de dados

}
