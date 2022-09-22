package duke.task;

public class Deadline extends Task{
    protected String by;
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getTaskInfo() {
        String statusIcon = isDone ? "X" : " ";
        return "[D]" + "[" + statusIcon + "] " + this.description + " (by: " + this.by + ")";
    }

    @Override
    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString () {
        int isDoneInNumber = this.isDone ? 1 : 0;
        return String.format("D | %d | %s | %s", isDoneInNumber, description, by) + System.lineSeparator();
    }
}
