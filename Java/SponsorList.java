import java.util.*;

public class SponsorList {
    private ArrayList<Sponsor> sponsorArray;

    public SponsorList() {
        sponsorArray = new ArrayList<Sponsor>();

    }

    public void addSponsor(Sponsor sponsor) {
        sponsorArray.add(sponsor);
    }

    public void editSponsor(String name, String email) {
        if (sponsorArray.size() != 0) {
            for (int i = 0; i < sponsorArray.size(); i++) {
                if (sponsorArray.get(i).getName().equals(name)) {
                    sponsorArray.get(i).setEmail(email);
                    System.out.println(
                            "Lecturer " + sponsorArray.get(i).getName() + "has successfully updated his email adress");
                }
                if (sponsorArray.get(i).getEmail().equals(email)) {
                    sponsorArray.get(i).setName(name);
                    System.out.println("Lecturer with the email " + sponsorArray.get(i).getEmail()
                            + "has successfully updated his name");
                }
            }
        } else {
            System.out.println("There are no sponsors in the list :(");
        }

    }

    public void deleteSponsor(Sponsor sponsor) {
        sponsorArray.remove(sponsor);
    }
}