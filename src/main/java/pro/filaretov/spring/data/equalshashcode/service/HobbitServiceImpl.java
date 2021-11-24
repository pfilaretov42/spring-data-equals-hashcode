package pro.filaretov.spring.data.equalshashcode.service;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.filaretov.spring.data.equalshashcode.dto.HobbitDTO;
import pro.filaretov.spring.data.equalshashcode.mapper.HobbitMapper;
import pro.filaretov.spring.data.equalshashcode.repository.HobbitRepository;

@Service
@RequiredArgsConstructor
public class HobbitServiceImpl implements HobbitService {

    private final HobbitRepository hobbitRepository;
    private final HobbitMapper hobbitMapper;

    @Override
    public List<HobbitDTO> getAll() {
        return hobbitRepository.findAll().stream()
            .map(hobbitMapper::toDTO)
            .collect(Collectors.toList());
    }
}
