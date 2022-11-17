package se.lexicon.dao;

import se.lexicon.model.ToDoItem;
import se.lexicon.model.ToDoItemTask;

import java.util.ArrayList;
import java.util.Collection;

public class ToDoItemTaskCollection implements ToDoItemTaskDao{

    private Collection<ToDoItemTask> todoItemTaskList;

    public ToDoItemTaskCollection(){
        todoItemTaskList = new ArrayList<>();
    }

    @Override
    public ToDoItemTask persist(ToDoItemTask toDoItemTask) {
        if (toDoItemTask == null) throw new IllegalArgumentException("ToDoItemTask was null");
        ToDoItemTask result = findById(toDoItemTask.getId());
        if (result!= null) throw new IllegalArgumentException("You cannot use that username");
        todoItemTaskList.add(toDoItemTask);

        return toDoItemTask;
    }

    @Override
    public ToDoItemTask findById(int Id) {
        if (Id == 0) throw new IllegalArgumentException("Id was null");
        for (ToDoItemTask currentElement : todoItemTaskList) {
            if (currentElement.getId() != 0 && currentElement.getId() == Id)
                return currentElement;
        }
        return null;
    }

    @Override
    public Collection<ToDoItemTask> findAll() {
        return new ArrayList<>(todoItemTaskList);
    }

    @Override
    public Collection<ToDoItemTask> findAllByAssignedStatus(boolean done) {
        Collection<ToDoItemTask> it = new ArrayList<>();
        for (ToDoItemTask currentElement : todoItemTaskList) {
            if (currentElement.isAssigned() == done)
                it.add(currentElement);

        }
        return it;
    }

    @Override
    public Collection<ToDoItemTask> findByPersonId(int personId) {
        Collection<ToDoItemTask> it = new ArrayList<>();
        for (ToDoItemTask currentElement : todoItemTaskList) {
            if (currentElement.getAssignee().getId() == personId)
                it.add(currentElement);
        }
        return todoItemTaskList;
    }

    @Override
    public void remove(int id) {
        if (id == 0) throw new IllegalArgumentException("ToDoItemTask is not fond");
        ToDoItemTask findId = findById(id);
        if (findId == null) throw new IllegalArgumentException("ToDoItemTask is not fond to remove");
        todoItemTaskList.remove(id);

    }
}
