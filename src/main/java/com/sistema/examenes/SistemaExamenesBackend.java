package com.sistema.examenes;

import com.sistema.examenes.entities.Rol;
import com.sistema.examenes.entities.User;
import com.sistema.examenes.entities.UserRol;
import com.sistema.examenes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamenesBackend implements CommandLineRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackend.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setName("Jared");
//		user.setLastname("Ayala");
//		user.setUsername("Jared");
//		user.setPassword(bCryptPasswordEncoder.encode("12345"));
//		user.setEmail("mlvkware@gmail.com");
//		user.setPhone("4231243");
//		user.setPerfil("photo");
//
//		Rol rol = new Rol();
//		rol.setRolId(1L);
//		rol.setName("ADMIN");
//
//		Set<UserRol> usuarioRoles = new HashSet<>();
//		UserRol userRoles = new UserRol();
//		userRoles.setRol(rol);
//		userRoles.setUser(user);
//		usuarioRoles.addAll(Collections.singleton(userRoles));
//
//		User userSaved = userService.saveUser(user,usuarioRoles);
//		System.out.println(userSaved.getUsername());
	}
}