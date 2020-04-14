package org.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.system.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findByNameLike(String name);
}
