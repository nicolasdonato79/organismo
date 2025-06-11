package gob.santafe.organismo.dtos;

import gob.santafe.organismo.enums.TipoGestion;
import gob.santafe.organismo.enums.TipoJornada;
import lombok.Data;

@Data
public class OrganismoDto {
    private Integer userId;
    private String numero;
    private String nombre;
    private String domicilio;
    private String localidad;
    private Integer codArea;
    private Integer telefono;
    private TipoGestion tipoGestion;
    private TipoJornada tipoJornada;
    private Integer categoria;
}