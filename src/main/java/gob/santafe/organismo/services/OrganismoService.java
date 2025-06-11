package gob.santafe.organismo.services;

import gob.santafe.organismo.dtos.OrganismoDto;
import gob.santafe.organismo.entities.Organismo;
import gob.santafe.organismo.mappers.OrganismoMapper;
import gob.santafe.organismo.repositories.OrganismoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrganismoService {

    @Autowired
    private OrganismoRepository organismoRepository;

    public List<OrganismoDto> findAll() {
        return organismoRepository.findAll()
                .stream()
                .map(OrganismoMapper::toDto)
                .collect(Collectors.toList());
    }

    public OrganismoDto findById(Integer id) {
        Optional<Organismo> organismo = organismoRepository.findById(id);
        return organismo.map(OrganismoMapper::toDto).orElse(null);
    }

    public OrganismoDto create(OrganismoDto organismoDto) {
        Organismo organismo = OrganismoMapper.toEntity(organismoDto);
        Organismo savedOrganismo = organismoRepository.save(organismo);
        return OrganismoMapper.toDto(savedOrganismo);
    }

    public OrganismoDto update(Integer id, OrganismoDto organismoDto) {
        Optional<Organismo> organismoOptional = organismoRepository.findById(id);
        if (organismoOptional.isPresent()) {
            Organismo organismo = organismoOptional.get();
            OrganismoMapper.updateEntity(organismo, organismoDto);
            Organismo updatedOrganismo = organismoRepository.save(organismo);
            return OrganismoMapper.toDto(updatedOrganismo);
        }
        return null;
    }

    public boolean delete(Integer id) {
        if (organismoRepository.existsById(id)) {
            organismoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}