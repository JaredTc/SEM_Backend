package com.sistema.examenes.controller;

import com.sistema.examenes.entities.Rol;
import com.sistema.examenes.entities.User;
import com.sistema.examenes.entities.UserRol;
import com.sistema.examenes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) throws Exception{
        user.setPerfil("default.png");
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        Set<UserRol> usuarioRoles = new HashSet<>();
        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setName("NORMAL");

        UserRol userRol = new UserRol();
        userRol.setUser(user);
        userRol.setRol(rol);
        usuarioRoles.add(userRol);
        return userService.saveUser(user,usuarioRoles);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username ){
        return userService.getUser(username);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }

}
