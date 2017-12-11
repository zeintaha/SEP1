import java.util.ArrayList;

public class Lecturer {
    private String name;
    private String email;
    private ArrayList<Activity_Subject> category;
    public Lecturer(String name, String email, ArrayList<Activity_Subject> category){
        this.name = name;
        this.email = email;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Activity_Subject> getCategory() {
        return category;
    }
    public void setCategory(ArrayList<Activity_Subject> category) {
        this.category = category;
    }
    
}