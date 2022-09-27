package com.sistema.examenes.services.impl;

import com.sistema.examenes.entities.User;
import com.sistema.examenes.entities.UserRol;
import com.sistema.examenes.exceptions.UserFoundException;
import com.sistema.examenes.repositories.RolRepository;
import com.sistema.examenes.repositories.UserRepository;
import com.sistema.examenes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
 public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public User saveUser(User user, Set<UserRol> userRol) throws Exception {
          User userlocal = userRepository.findByUsername(user.getUsername());

          if ( userlocal != null){
              throw  new UserFoundException("EL usuario ya esta presente");
          }
          else {
              for ( UserRol userRols : userRol ) {
                    rolRepository.save(userRols.getRol());
              }
              user.getUserRoles().addAll(userRol);
              userlocal = userRepository.save(user);
          }
          return  userlocal;
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }


}
