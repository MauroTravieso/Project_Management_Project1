package org.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.system.model.Task;
import org.system.model.User;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser(User user);

}
