package pro.filaretov.spring.data.equalshashcode.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.filaretov.spring.data.equalshashcode.dto.HobbitDTO;
import pro.filaretov.spring.data.equalshashcode.service.HobbitService;

@RestController
@RequiredArgsConstructor
public class HobbitController {

    private final HobbitService hobbitService;

    @GetMapping
    public List<HobbitDTO> getAll() {
        return hobbitService.getAll();
    }

}
