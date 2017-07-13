/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.convenient.store.gl.springbootsecurityvaadin.security;

/**
 * 
 * @author p.ly
 *
 */
public interface ISecurity {
    boolean autoLogin(String username, String password);
}
