package com.springuser.service;

import com.springuser.model.Role;
import java.util.Set;

public interface RoleService {
    void createRoles(Set<Role> roles);
    Set<Role> getAllRoles();
}