package se.lexicon.model;

import java.util.Objects;

public class ToDoItemTask {
    private int id;
    private boolean assigned;
    private ToDoItem toDoItem;
    private Person assignee;


    public ToDoItemTask(ToDoItem toDoItem, Person assignee) {
        if (toDoItem == null) {
            throw new IllegalArgumentException("ToDoItem cannot be null!");
        }
        this.toDoItem = toDoItem;
        this.assignee = assignee;
    }
    public ToDoItemTask(int id, ToDoItem toDoItem, Person assignee) {
        if (toDoItem == null) {
            throw new IllegalArgumentException("ToDoItem cannot be null!");
        }
        this.id = id;
        this.toDoItem = toDoItem;
        this.assignee = assignee;
    }
    //methods

    @Override
    public String toString() {
        return "ToDoItemTask{" +
                "id: " + id +
                ", assigned: " + assigned +
                ", toDoItem: " + toDoItem +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDoItemTask)) return false;
        ToDoItemTask task = (ToDoItemTask) o;
        return getId() == task.getId() && isAssigned() == task.isAssigned() && toDoItem.equals(task.toDoItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), isAssigned(), toDoItem);
    }

   /* public String getSummary() {
        return "ToDoItemTask:" + id + " Assigned:" + assigned + " ToDoItem:" + toDoItem.getTitle() +
                " Assignee:" + assignee.getFirstName();
    }*/

    //Getters and Setters


    public ToDoItem getTodoItem() {
        return this.toDoItem;
    }

    public void setTodoItem(ToDoItem toDoItem) {
        //if(toDoItem == null) throw new IllegalArgumentException("ToDoItem cannot be null!");
        this.toDoItem = toDoItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return this.assignee != null;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public Person getAssignee() {
        return assignee;
    }
}
