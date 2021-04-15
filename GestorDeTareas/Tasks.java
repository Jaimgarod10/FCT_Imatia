package GestorDeTareas;

public class Tasks {

    private String nameTask;
    private String priority;
    private String deadline;

    public Tasks(String nameTask, String priority, String deadline) {
        this.nameTask = nameTask;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task: " +
                "nameTask: '" + nameTask + '\'' +
                ", priority: '" + priority + '\'' +
                ", expirationDate: '" + deadline + '\'';
    }
}
