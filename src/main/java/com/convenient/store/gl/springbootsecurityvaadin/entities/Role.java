package com.convenient.store.gl.springbootsecurityvaadin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;

/**
 * 
 * @author p.ly
 *
 */
@Entity
@Table(name = "tblrole")
public class Role implements GrantedAuthority{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id")
	private Long id;

    @NotNull
    private String name;

    @NotNull
    private boolean status;

    @Override
    public String getAuthority() {
        return getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
