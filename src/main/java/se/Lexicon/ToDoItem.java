package se.Lexicon;

import java.time.LocalDate;


public class ToDoItem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    // private ToDoItem item1;

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


   /* @Override
    public String toString() {
        return "Go to the store" + "Id:" + id + " Buy fruit" + title + "We need apples and bananas." + taskDescription +
                "LocalDate:" + deadLine + " done:" + done + " creator" + creator;
    }*/

    public boolean isOverDue(ToDoItem task1) {
        LocalDate dateToDay = LocalDate.now();
        //int result = deadLine.compareTo(dateToDay);
        //return result < 0;
        return deadLine.isBefore(dateToDay);
        //return result < 0;
    }


    public String getSummary() {
        return "ID:" + getId() + " Title:" + getTitle() + " Task:" + getTaskDescription() + " DeadLine:" + getDeadLine();
    }

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
}
