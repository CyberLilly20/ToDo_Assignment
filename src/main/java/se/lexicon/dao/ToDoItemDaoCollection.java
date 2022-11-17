package se.lexicon.dao;

import se.lexicon.model.AppUser;
import se.lexicon.model.Person;
import se.lexicon.model.ToDoItem;

import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;


public class ToDoItemDaoCollection implements ToDoItemDao {

    private Collection<ToDoItem> todoItemList;

    public ToDoItemDaoCollection() {
        todoItemList = new ArrayList<>();
    }

    @Override
    public ToDoItem persist(ToDoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("ToDoItem was null");
        ToDoItem result = findById(todoItem.getId());
        if (result != null) throw new IllegalArgumentException("You cannot use that username");
        todoItemList.add(todoItem);

        return todoItem;
    }

    @Override
    public ToDoItem findById(int Id) {
        if (Id == 0) throw new IllegalArgumentException("Id was null");
        for (ToDoItem currentElement : todoItemList) {
            if (currentElement.getId() != 0 && currentElement.getId() == Id)
                return currentElement;
        }
        return null;
    }

    @Override
    public Collection<ToDoItem> findAll() {
        return new ArrayList<>(todoItemList);
    }

    @Override
    public Collection<ToDoItem> findAllByDoneStatus(boolean done) {
        Collection<ToDoItem> it = new ArrayList<>();
        for (ToDoItem currentElement : todoItemList) {
            if (currentElement.isDone() == done)
                it.add(currentElement);

        }
        return it;
    }

    @Override
    public Collection<ToDoItem> findByTitleContains(String title) {
        Collection<ToDoItem> it = new ArrayList<>();
        for (ToDoItem currentElement : todoItemList) {
            if (currentElement.getTitle().contains(title.toLowerCase());
            it.add(currentElement);
        }
        return it;
    }

    @Override
    public Collection<ToDoItem> findByPersonId(int personId) {
        Collection<ToDoItem> it = new ArrayList<>();
        for (ToDoItem currentElement : todoItemList) {
            if (currentElement.getCreator().getId() == personId)
                it.add(currentElement);
        }

        return todoItemList;
    }

    @Override
    public Collection<ToDoItem> findByDeadlineBefore(LocalDate date) {
        Collection<ToDoItem> it = new ArrayList<>();
        for (ToDoItem currentElement : todoItemList) {
            if (currentElement.getDeadLine().compareTo(date) < 0)
                it.add(currentElement);
        }
        return it;
    }

    @Override
    public Collection<ToDoItem> findByDeadlineAfter(LocalDate date) {
        Collection<ToDoItem> it = new ArrayList<>();
        for (ToDoItem currentElement : todoItemList) {
            if (currentElement.getDeadLine().compareTo(date) > 0)
                it.add(currentElement);
        }
        return null;
    }

    @Override
    public void remove(int id) {
        if (id == 0) throw new IllegalArgumentException("ToDoItem is not fond");
        ToDoItem findId = findById(id);
        if (findId == null) throw new IllegalArgumentException("ToDoItem is not fond to remove");
        todoItemList.remove(id);


    }
}
