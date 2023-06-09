package com.josepillado.Examen.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.josepillado.Examen.dto.RoleDTO;
import com.josepillado.Examen.model.Role;
import com.josepillado.Examen.service.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {

    private final IRoleService service;

    @Qualifier("defaultMapper")
    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<RoleDTO>> readAll() throws Exception {
        //ModelMapper mapper = new ModelMapper();

        List<RoleDTO> list = service.readAll().stream()
                .map(this::convertToDto).collect(Collectors.toList());

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}") //PathVariable | ${} EL Expression Language
    public ResponseEntity<RoleDTO> readById(@PathVariable("id") Integer id) throws Exception {
        RoleDTO dto = this.convertToDto(service.readById(id));
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<RoleDTO> create(@Valid @RequestBody RoleDTO dto) throws Exception{
        Role obj = service.save(this.convertToEntity(dto));
        return new ResponseEntity<>(this.convertToDto(obj), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoleDTO> update(@PathVariable("id") Integer id, @Valid @RequestBody RoleDTO dto) throws Exception{
        dto.setIdRole(id);
        Role obj = service.update(this.convertToEntity(dto), id);
        return new ResponseEntity<>(this.convertToDto(obj), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /////////////////////////////
    private RoleDTO convertToDto(Role obj){
        return mapper.map(obj, RoleDTO.class);
    }

    private Role convertToEntity(RoleDTO dto){
        return mapper.map(dto, Role.class);
    }

}
