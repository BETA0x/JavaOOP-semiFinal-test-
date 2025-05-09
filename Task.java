package oop_taskmanagementsystem.sestuproject;
public class Task {
    private String title, description;
    private boolean completed;
    
    public Task (String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }
    
    public void markAsComplated(){
        this.completed = true;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getDesctiption(){
        return description;
    }
    
    public boolean isComplated(){
        return completed;
    }
    
    public void printTask(){
        System.out.println("* "+ title + "|" + (completed ? "Done" : "Pending"));
    }
}
