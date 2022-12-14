package com.sistema.examenes.services;

import com.sistema.examenes.entities.User;
import com.sistema.examenes.entities.UserRol;

import java.util.Set;

public interface UserService {

    public User saveUser(User user,
                         Set<UserRol> userRol) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);

}
