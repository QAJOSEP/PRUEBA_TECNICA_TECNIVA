package com.josepillado.Examen.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.josepillado.Examen.model.User;
import com.josepillado.Examen.repo.IGenericRepo;
import com.josepillado.Examen.repo.IUserRepo;
import com.josepillado.Examen.service.IUserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends CRUDImpl<User, Integer> implements IUserService {

    private final IUserRepo repo;

    @Override
    protected IGenericRepo<User, Integer> getRepo() {
        return repo;
    }
}
