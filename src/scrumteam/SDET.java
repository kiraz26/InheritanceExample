package scrumteam;

public class SDET extends ScrumTeamMember {
	protected String position = "Java SDET"; // <---------hiding variable not override

	@Override
	public void work() {
		System.out.println(position + " Developing Test Automation Code");
	}

	static {
		System.out.println("SDET static block");
	}
	{
		System.out.println("SDET instance initialize block");
	}

	public SDET() {
		super();
		System.out.println("SDET no arg constructor");
	}

}
