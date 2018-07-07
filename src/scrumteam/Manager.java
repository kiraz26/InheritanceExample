package scrumteam;

public class Manager extends ScrumTeamMember{
	
	protected String position = "Manager"; // <---------hiding variable not override

	@Override
	public void work() {
		System.out.println(position+" supporting the team");
	}
	
}
