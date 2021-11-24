package pro.filaretov.spring.data.equalshashcode.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import pro.filaretov.spring.data.equalshashcode.domain.Hobbit;

public interface HobbitRepository extends JpaRepository<Hobbit, UUID> {

}
