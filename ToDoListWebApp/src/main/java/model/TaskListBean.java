package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskListBean {
    private List<Task> taskList;
    
    public TaskListBean() {
        taskList = new ArrayList<>();
    }
    
    public List<Task> getTaskList() {
        return taskList;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }
    
    public void completeTask(int taskId) {
        for (Task task : taskList) {
            if (task.getId() == taskId) {
                task.setCompleted(true);
                break;
            }
        }
    }

    public void deleteTask(int taskId) {
//        taskList.removeIf(task -> task.getId() == taskId);
    	Iterator<Task> iterator = taskList.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == taskId) {
                iterator.remove();
                break;
            }
        }
    }
}
