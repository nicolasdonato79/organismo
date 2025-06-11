package gob.santafe.organismo.mappers;

import gob.santafe.organismo.dtos.OrganismoDto;
import gob.santafe.organismo.entities.Organismo;

public class OrganismoMapper {

    public static OrganismoDto toDto(Organismo organismo) {
        if (organismo == null) {
            return null;
        }

        OrganismoDto dto = new OrganismoDto();
        dto.setUserId(organismo.getUserId());
        dto.setNumero(organismo.getNumero());
        dto.setNombre(organismo.getNombre());
        dto.setDomicilio(organismo.getDomicilio());
        dto.setLocalidad(organismo.getLocalidad());
        dto.setCodArea(organismo.getCodArea());
        dto.setTelefono(organismo.getTelefono());
        dto.setTipoGestion(organismo.getTipoGestion());
        dto.setTipoJornada(organismo.getTipoJornada());
        dto.setCategoria(organismo.getCategoria());
        return dto;
    }

    public static Organismo toEntity(OrganismoDto dto) {
        if (dto == null) {
            return null;
        }

        Organismo organismo = new Organismo();
        organismo.setUserId(dto.getUserId());
        organismo.setNumero(dto.getNumero());
        organismo.setNombre(dto.getNombre());
        organismo.setDomicilio(dto.getDomicilio());
        organismo.setLocalidad(dto.getLocalidad());
        organismo.setCodArea(dto.getCodArea());
        organismo.setTelefono(dto.getTelefono());
        organismo.setTipoGestion(dto.getTipoGestion());
        organismo.setTipoJornada(dto.getTipoJornada());
        organismo.setCategoria(dto.getCategoria());
        return organismo;
    }

    public static void updateEntity(Organismo organismo, OrganismoDto dto) {
        if (organismo == null || dto == null) {
            return;
        }

        organismo.setNumero(dto.getNumero());
        organismo.setNombre(dto.getNombre());
        organismo.setDomicilio(dto.getDomicilio());
        organismo.setLocalidad(dto.getLocalidad());
        organismo.setCodArea(dto.getCodArea());
        organismo.setTelefono(dto.getTelefono());
        organismo.setTipoGestion(dto.getTipoGestion());
        organismo.setTipoJornada(dto.getTipoJornada());
        organismo.setCategoria(dto.getCategoria());
    }
}