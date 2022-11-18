package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;


public class ToDoItem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    // private ToDoItem item1;

    public ToDoItem(String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        if (title == null || title.isEmpty()) throw new RuntimeException("Title cannot be null or empty");
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = false;
        this.creator = creator;

    }
    public ToDoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        if (title == null || title.isEmpty()) throw new RuntimeException("Title cannot be null or empty");
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = false;
        this.creator = creator;

    }
    //methods

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id:" + id +
                ", title:" + title + '\'' +
                ", taskDescription:" + taskDescription + '\'' +
                ", deadLine:" + deadLine +
                ", done:" + done +
                '}';
    }

    public boolean isOverDue(ToDoItem task1) {
        LocalDate dateToDay = LocalDate.now();
        //int result = deadLine.compareTo(dateToDay);
        //return result < 0;
        return deadLine.isBefore(dateToDay);
        //return result < 0;
    }

   /* public String getSummary() {
        return "ID:" + getId() + " Title:" + getTitle() + " Task:" + getTaskDescription() + " DeadLine:" + getDeadLine();
    }*/

    //set and get


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("Title cannot be null!");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setLocalDate(LocalDate deadLine) {
        if (deadLine == null) throw new IllegalArgumentException("Date cannot be null!");
        //LocalDate deadLine = LocalDate.ofEpochDay(localDate);
        this.deadLine = deadLine;
    }

   /* public boolean isDeadLine() {
        return done;
    }*/

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean deadLine) {
        this.done = false;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDoItem)) return false;
        ToDoItem toDoItem = (ToDoItem) o;
        return getId() == toDoItem.getId() && isDone() == toDoItem.isDone() && getTitle().equals(toDoItem.getTitle()) && getTaskDescription().equals(toDoItem.getTaskDescription()) && getDeadLine().equals(toDoItem.getDeadLine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getTaskDescription(), getDeadLine(), isDone());
    }

}
