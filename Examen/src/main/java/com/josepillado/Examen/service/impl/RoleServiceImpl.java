package com.josepillado.Examen.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.josepillado.Examen.model.Role;
import com.josepillado.Examen.repo.IGenericRepo;
import com.josepillado.Examen.repo.IRoleRepo;
import com.josepillado.Examen.service.IRoleService;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl extends CRUDImpl<Role, Integer> implements IRoleService {

    private final IRoleRepo repo;

    @Override
    protected IGenericRepo<Role, Integer> getRepo() {
        return repo;
    }
}
