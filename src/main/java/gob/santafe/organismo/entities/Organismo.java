package gob.santafe.organismo.entities;


import gob.santafe.organismo.enums.TipoGestion;
import gob.santafe.organismo.enums.TipoJornada;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "organismos", schema = "santa_fe")
public class Organismo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organismo_id")
    private Integer userId;

    @Column(name = "numero")
    private String numero;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "domicilio")
    private String domicilio;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "cod_area")
    private Integer codArea;

    @Column(name = "telefono")
    private Integer telefono;

    @Column(name = "tipoGestion")
    private TipoGestion tipoGestion;

    @Column(name = "tipoJornada")
    private TipoJornada tipoJornada;

    private Integer categoria;

}
