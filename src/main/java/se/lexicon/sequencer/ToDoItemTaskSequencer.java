package se.lexicon.sequencer;

public class ToDoItemTaskSequencer {

    private static int currentId;

    private static int nextId() {
        return ++currentId;
    }


    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        ToDoItemTaskSequencer.currentId = currentId;
    }
}
