import java.util.ArrayList;

public class LecturerList {
    private ArrayList<Lecturer> lecturerArray;

    public LecturerList(){
        lecturerArray = new ArrayList<Lecturer>();
            
        }
        public void addLecturer(Lecturer lecturer){
            lecturerArray.add(lecturer);
        }
        public void deleteLecturer(Lecturer lecturer){
            lecturerArray.remove(lecturer);
        }
        public void editLecturer(String name, String email){
            if(lecturerArray.size() != 0){
                for (int i = 0; i < lecturerArray.size(); i++) {
                    if(lecturerArray.get(i).getName().equals(name)){
                        lecturerArray.get(i).setEmail(email);
                        System.out.println("Lecturer " + lecturerArray.get(i).getName() + "has successfully updated his email adress");
                    }
                    if(lecturerArray.get(i).getEmail().equals(email)){
                        lecturerArray.get(i).setName(name);
                        System.out.println("Lecturer with the email " + lecturerArray.get(i).getEmail() + "has successfully updated his name");
                    }
                }
            }else{
                System.out.println("There are no sponsors in the list :(");
            }
            }
        }