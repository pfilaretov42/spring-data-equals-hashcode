package pro.filaretov.spring.data.equalshashcode.domain;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hobbit {

    @Id
    @GeneratedValue
    private UUID id;
    private String firstName;
    private String lastName;


}
