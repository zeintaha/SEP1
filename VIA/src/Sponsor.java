public class Sponsor {
    private String name;
    private String email;
    private boolean newsLetter;
    public Sponsor(String name, String email, boolean newsLetter){
        this.name = name;
        this.email = email;
        this.newsLetter = newsLetter;
    }
    
    public void setNewsLetter(boolean set){
        this.newsLetter = set;
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
    
    public String toString() {
       return name + "/" + email + "/" + newsLetter;
    }
}