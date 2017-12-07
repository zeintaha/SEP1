
public class Lecturer {
	private String name;
	private String email;
	private ActivitySubject_List category;
	public Lecturer(String name, String email, ActivitySubject_List category){
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
	public ActivitySubject_List getCategory() {
		return category;
	}
	public void setCategory(ActivitySubject_List category) {
		this.category = category;
	}
	
}
