package se.lexicon.dao;

import se.lexicon.model.ToDoItem;
import se.lexicon.model.ToDoItemTask;

import java.time.LocalDate;
import java.util.Collection;

public interface ToDoItemTaskDao {
    ToDoItemTask persist(ToDoItemTask toDoItemTask);
    ToDoItemTask findById(int Id);
    Collection<ToDoItemTask> findAll();
    Collection<ToDoItemTask> findAllByAssignedStatus(boolean done);
    Collection<ToDoItemTask> findByPersonId(int personId);
    void remove(int id);
}
