
public class Sponsor {
	private String name;
	private String email;
	private boolean newsLetter;
	public Sponsor(String name, String email){
		this.name = name;
		this.email = email;
		this.newsLetter = false;
	}
	
	public void setNewsLetter(){
		this.newsLetter = true;
	}
	public boolean getNewsLetter(){
		return newsLetter;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
}
