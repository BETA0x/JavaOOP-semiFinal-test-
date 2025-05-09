package oop_taskmanagementsystem.sestuproject;
public class OOP_TaskManagementSystemSeStuProject {

    public static void main(String[] args) {
        TaskManager mngr = new TaskManager();
        
        Task t1 = new Task("Finish Java OOP project", "Implement task System in Java");
        Task t2 = new Task("Push code to GitHub", "Use Git and commit frequently");
        
        mngr.addTask(t1);
        mngr.addTask(t2);
        
        System.out.println("\nCurrent tasks: ");
        mngr.showTasks();
        
        mngr.markTaskCompleted(0);
        System.out.println("After marking task 0 as completed: ");
        mngr.showTasks();
        
    }
    
}
