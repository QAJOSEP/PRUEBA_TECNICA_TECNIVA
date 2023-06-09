package com.josepillado.Examen.repo;

import com.josepillado.Examen.model.User;

public interface IUserRepo extends IGenericRepo<User, Integer> {

    User findOneByUsername(String username);
}
