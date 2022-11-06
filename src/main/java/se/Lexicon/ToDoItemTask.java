package se.Lexicon;

public class ToDoItemTask {
    private int id;
    private boolean assigned;
    private ToDoItem item1;
    private Person assignee;

    public ToDoItemTask() {
        if (item1 == null) throw new RuntimeException("ToDoItem cannot be null!");
        this.id = id;
        this.item1 = item1;
        this.assignee = assignee;
    }

    public ToDoItemTask(int id, boolean done, String title, Person liljana) {
        if (item1== null) throw new RuntimeException("ToDoItem cannot be null!");
    }

    //methods

    public String toString() {
        return "ToDoItemTask:" + id + " Assigned:" + assigned + " ToDoItem:" + item1.toString() +
                " Assignee:" + assignee.toString();
    }





    public String getSummary(ToDoItemTask task) {
        return toString(); //"Id:" + id + "Assigned: " + assigned + "Assignee: " + assignee.toString();
    }

    //Getters and Setters


    public ToDoItem getTodoItem() {
        return this.item1;
    }

    public void setTodoItem(ToDoItem toDoItem) {
        this.item1 = toDoItem;
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
