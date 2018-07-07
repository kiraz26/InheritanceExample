package scrumteam;

public class Developer extends ScrumTeamMember {

	protected String position = "Java Developer"; // <---------hiding variable not override

	@Override
	public void work() {
		System.out.println(position + " Developing Application");
	}

	@Override
	public int calculateSalary(int hours) {
		return hours * getSalary();
	}

	// hidden method
	public static void report() {
		System.out.println("Completed this sprint tasks");
	}

}
