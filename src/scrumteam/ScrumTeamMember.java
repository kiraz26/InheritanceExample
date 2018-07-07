package scrumteam;

public class ScrumTeamMember {
	private String name;
	protected String position = "ScrumTeamMember";
	private int salary;
	protected String linkedInId;

	public static String company ="Google";
	
	public static final String CITY="Eskisehir";
	
	static {
		System.out.println("ScrumTeamMember static block");
		System.out.println(company);
		System.out.println(CITY.toUpperCase()); 
	}
	
	
	
	{
		System.out.println("ScrumTeamMember instance initialize block");
	}

	public ScrumTeamMember() {
		System.out.println("ScrumTeamMember no arg constructor");
	}

	public static void report() {
		System.out.println("Completed this sprint Coding tasks");
	}

	public void work() {
		System.out.println(position + " is busy working");
	}

	public int calculateSalary(int hours) {
		return hours * salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
