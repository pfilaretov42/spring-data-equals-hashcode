package pro.filaretov.spring.data.equalshashcode.dto;

import java.util.UUID;
import lombok.Data;

@Data
public class HobbitDTO {

    private UUID id;
    private String firstName;
    private String lastName;

}
