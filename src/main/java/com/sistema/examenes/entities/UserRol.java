package com.sistema.examenes.entities;

import javax.persistence.*;

@Entity
public class UserRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Rol rol;

    public UserRol() {
    }

    public UserRol(long userRolId, User user, Rol rol) {
        this.userRolId = userRolId;
        this.user = user;
        this.rol = rol;
    }

    public long getUserRolId() {
        return userRolId;
    }

    public void setUserRolId(long userRolId) {
        this.userRolId = userRolId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
