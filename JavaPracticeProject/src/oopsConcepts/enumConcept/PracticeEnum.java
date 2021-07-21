package oopsConcepts.enumConcept;

public enum PracticeEnum 
{
	EAST ("e"),
	WEST ("w"),
	NORTH ("n"),
	SOUTH ("s");
	
	/*EAST,
	WEST,
	NORTH,
	SOUTH*/

	private final String disha;
	
	PracticeEnum(String call)
	{
		this.disha = call;
	}

	public String getDirectorcode() 
	{
		return this.disha;
	}
}

