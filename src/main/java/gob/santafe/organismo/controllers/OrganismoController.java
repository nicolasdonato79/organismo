package gob.santafe.organismo.controllers;

import gob.santafe.organismo.dtos.OrganismoDto;
import gob.santafe.organismo.services.OrganismoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organismos")
public class OrganismoController {

    @Autowired
    private OrganismoService organismoService;

    @GetMapping
    public ResponseEntity<List<OrganismoDto>> getAllOrganismos() {
        List<OrganismoDto> organismos = organismoService.findAll();
        return ResponseEntity.ok(organismos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrganismoDto> getOrganismoById(@PathVariable Integer id) {
        OrganismoDto organismo = organismoService.findById(id);
        if (organismo != null) {
            return ResponseEntity.ok(organismo);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<OrganismoDto> createOrganismo(@RequestBody OrganismoDto organismoDto) {
        OrganismoDto createdOrganismo = organismoService.create(organismoDto);
        return ResponseEntity.ok(createdOrganismo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrganismoDto> updateOrganismo(@PathVariable Integer id, @RequestBody OrganismoDto organismoDto) {
        OrganismoDto updatedOrganismo = organismoService.update(id, organismoDto);
        if (updatedOrganismo != null) {
            return ResponseEntity.ok(updatedOrganismo);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganismo(@PathVariable Integer id) {
        boolean deleted = organismoService.delete(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}