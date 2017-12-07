import java.util.ArrayList;

public class ActivitySubject_List {
	private ArrayList<Activity_Subject> activityList;

	public ActivitySubject_List() {
		activityList = new ArrayList<Activity_Subject>();
	}

	public void addActivitySubject(String name, String type) {
		Activity_Subject a1 = new Activity_Subject(name, type);
		activityList.add(a1);
	}

	public ArrayList<Activity_Subject> findByActivityName(String subject) {
		ArrayList<Activity_Subject> activity1 = new ArrayList<Activity_Subject>();
		for (int i = 0; i < activityList.size(); i++) {
			Activity_Subject activity = activityList.get(i);
			if (activity.getActivityName().equals(subject)) {
				activity1.add(activity);
			}
		}
		return activity1;
	}

	public void removeActivitySubject(Activity_Subject activityName) {
		this.activityList.remove(activityName);
	}

	public void editActivitySubject(Activity_Subject a1, String activityName, String activityType) {
		removeActivitySubject(a1);
		addActivitySubject(activityName, activityType);
	}

}
