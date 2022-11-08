package se.Lexicon;

public class ToDoItemTask {
    private int id;
    private boolean assigned;

    private ToDoItem toDoItem;
    private Person assignee;


    public ToDoItemTask(int id, ToDoItem toDoItem, Person assignee) {

        if (toDoItem == null) {
            throw new IllegalArgumentException("ToDoItem cannot be null!");
        }
        this.id = id;
        this.toDoItem = toDoItem;
        this.assignee = assignee;
    }
    //methods

  /*  public String toString() {
        return "ToDoItemTask:" + id + " Assigned:" + assigned + " ToDoItem:" + toDoItem.getTitle() +
                " Assignee:" + assignee.getFirstName();
    }*/


    public String getSummary() {
        return "ToDoItemTask:" + id + " Assigned:" + assigned + " ToDoItem:" + toDoItem.getTitle() +
                " Assignee:" + assignee.getFirstName();

    }

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
