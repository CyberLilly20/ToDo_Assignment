package se.lexicon.dao;

import se.lexicon.model.ToDoItem;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

public interface ToDoItemDao {
    ToDoItem persist(ToDoItem todoItem);

    ToDoItem findById(int Id);

    Collection<ToDoItem> findAll();

    Collection<ToDoItem> findAllByDoneStatus(boolean done);

    Collection<ToDoItem> findByTitleContains(String title);

    Collection<ToDoItem> findByPersonId(int personId);

    Collection<ToDoItem> findByDeadlineBefore(LocalDate date);

    Collection<ToDoItem> findByDeadlineAfter(LocalDate date);

    void remove(int id);


}
