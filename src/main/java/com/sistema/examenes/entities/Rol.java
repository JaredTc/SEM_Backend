package com.sistema.examenes.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    private Long rolId;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rol")
    private Set<UserRol> userRol = new HashSet<>();

    public Rol() {
    }

    public long getRolId() {
        return rolId;
    }

    public void setRolId(long rolId) {
        this.rolId = rolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserRol> getUserRol() {
        return userRol;
    }

    public void setUserRol(Set<UserRol> userRol) {
        this.userRol = userRol;
    }
}
