package pro.filaretov.spring.data.equalshashcode.mapper;

import org.mapstruct.Mapper;
import pro.filaretov.spring.data.equalshashcode.domain.Hobbit;
import pro.filaretov.spring.data.equalshashcode.dto.HobbitDTO;

@Mapper(componentModel = "spring")
public interface HobbitMapper {

    HobbitDTO toDTO(Hobbit hobbit);

    Hobbit fromDTO(HobbitDTO hobbitDTO);
}
