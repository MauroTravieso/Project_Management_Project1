package org.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.system.model.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
