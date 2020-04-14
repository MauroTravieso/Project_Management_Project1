package org.system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.system.model.Task;
import org.system.model.User;
import org.system.repositories.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void addTask(Task task, User user) {
        task.setUser(user);
        taskRepository.save(task);
    }

    // Return the list of tasks assigned to a particular user
    public List<Task> findUserTask(User user) {
        return taskRepository.findByUser(user);
    }

}
