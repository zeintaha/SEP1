import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.FileNotFoundException;
import java.net.URL;

public class AddParticipantToEventController implements Initializable {
	private ArrayList<Members> memArray;
	private ArrayList<Non_Members> nonmemArray;
	private ToBinary file;
	private String filename = "events.txt";
	ArrayList<Category> categories;
	private ArrayList<Participants> participants;
	private String[] type;
	private ArrayList<Event> events;
	private Event eventToAddParticipant;
	private Non_Members nonmemparticipant;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtMemberId1;

	@FXML
	private Button btnAddMember;

	@FXML
	private Button btnCreateNewNonMember;

	@FXML
	private ComboBox<Event> cmbSelectEvent;

	@FXML
	private ComboBox<Category> cmbSelectCategory;

	@FXML
	private Button btnGetMember;

	@FXML
	private Button btnCreateNewMember;

	@FXML
	private Button btnGetNonMember;

	@FXML
	private TextField txtMemberId;

	@FXML
	private DatePicker dteDate;

	@FXML
	private TextField txtNameNonMember;

	@FXML
	private TextField txtNameMember;

	@FXML
	private AnchorPane AnchorPaneAddParticipantToEvent;

	@FXML
	private ComboBox<String> cmbSelectType;

	@FXML
	private Button btnAddNonMember;

	@FXML
	public void selectDate() throws FileNotFoundException {

		ArrayList<Event> events2 = new ArrayList<>();
		MyDate date = new MyDate(dteDate.getValue().getDayOfMonth(), dteDate.getValue().getMonthValue(),
				dteDate.getValue().getYear());
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).getDate().equals(date)) {
				events2.add(events.get(i));
			}
		}
		cmbSelectEvent.getItems().clear();
		cmbSelectEvent.getItems().addAll(events2);
	}

	@FXML
	public void selectEvent() throws FileNotFoundException {
		eventToAddParticipant = cmbSelectEvent.getSelectionModel().getSelectedItem();
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).equals(eventToAddParticipant)) {
				events.remove(i);

			}

		}

	}

	public void selectCategoryCMBX() {
		categories = new ArrayList<Category>();
		filename = "categories.txt";
		file = new ToBinary(filename);
		categories = (ArrayList<Category>) file.readObjFromFile();
		cmbSelectCategory.getItems().clear();
		cmbSelectCategory.getItems().addAll(categories);
	}

	public void selectTypeCMBX() {

		type = new String[4];
		String[] type = { "Meditation", "Workshop", "Journey", "Training" };
		cmbSelectType.getItems().add(type[0]);
		cmbSelectType.getItems().add(type[1]);
		cmbSelectType.getItems().add(type[2]);
		cmbSelectType.getItems().add(type[3]);
	}

	@FXML
	public void selectCategory(ActionEvent event) {
		ArrayList<Event> events2 = new ArrayList<>();
		Category category = cmbSelectCategory.getSelectionModel().getSelectedItem();
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).getCategory().toString().equals(category.toString())) {
				events2.add(events.get(i));
			}
		}
		cmbSelectEvent.getItems().clear();
		cmbSelectEvent.getItems().addAll(events2);
	}

	@FXML
	public void selectType(ActionEvent event) {
		ArrayList<Event> events2 = new ArrayList<>();
		String type = cmbSelectType.getSelectionModel().getSelectedItem();
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).getType().toString().equals(type.toString())) {
				events2.add(events.get(i));
			}
		}
		cmbSelectEvent.getItems().clear();
		cmbSelectEvent.getItems().addAll(events2);
	}

	@FXML
	public void getMember() throws FileNotFoundException {
		memArray = new ArrayList<Members>();
		filename = "members.txt";
		file = new ToBinary(filename);
		memArray = (ArrayList<Members>) file.readObjFromFile();

		String idMember = txtMemberId.getText();
		for (int i = 0; i < memArray.size(); i++) {
			if (memArray.get(i).getMember().getiD().equals(idMember)) {
				txtNameMember.setText(memArray.get(i).getMember().getName());
				nonmemparticipant = memArray.get(i).getMember();

			}

		}

	}

	@FXML
	public void addMember() throws FileNotFoundException {
		Participants participant = new Participants(nonmemparticipant);
		eventToAddParticipant.addParticipantsToEvent(participant);
		events.add(eventToAddParticipant);
		filename = "events.txt";
		file = new ToBinary(filename);
		file.writeObjToFile(events);

	}

	@FXML
	public void getNonMember() throws FileNotFoundException {

		nonmemArray = new ArrayList<Non_Members>();
		filename = "nonmember.txt";
		file = new ToBinary(filename);
		nonmemArray = (ArrayList<Non_Members>) file.readObjFromFile();

		String idMember = txtMemberId.getText();
		for (int i = 0; i < nonmemArray.size(); i++) {
			if (memArray.get(i).getMember().getiD().equals(idMember)) {
				txtNameNonMember.setText(nonmemArray.get(i).getName());
				nonmemparticipant = nonmemArray.get(i);
			}
		}
	}

	@FXML
	public void addNonMember() throws FileNotFoundException {
		Participants participant = new Participants(nonmemparticipant);
		eventToAddParticipant.addParticipantsToEvent(participant);
		events.add(eventToAddParticipant);
		filename = "events.txt";
		file = new ToBinary(filename);
		file.writeObjToFile(events);

	}

	@FXML
	void createNewMember() {

	}

	@FXML
	void createNewNonMember() {

	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		selectCategoryCMBX();
		selectTypeCMBX();
		filename = "events.txt";
		file = new ToBinary(filename);
		events = new ArrayList<Event>();
		events = (ArrayList<Event>) file.readObjFromFile();

	}
}
