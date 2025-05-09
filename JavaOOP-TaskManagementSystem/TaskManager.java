package oop_taskmanagementsystem.sestuproject;
import java.util.ArrayList;
public class TaskManager {
    private ArrayList<Task> tasks;
    
    public TaskManager(){
        tasks = new ArrayList<>();
    }
    
    public void addTask(Task task){
        tasks.add(task);
        System.out.println("Task Added: " + task.getTitle());
    }
    
    public void showTasks() {
        if (tasks.isEmpty()){
            System.out.println("No tasks to Show");
        }
        
        for(Task i: tasks){
            i.printTask();
        }
        
    }
    
    public void markTaskCompleted(int index){
        if (index >=0 && index < tasks.size()) {
            tasks.get(index).markAsComplated();
            System.out.println("Task marked As completed");
        } else {
            System.out.println("Invalid task index");
        }
    }
    
}
