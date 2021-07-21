package oopsConcepts.enumConcept;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// here we access only single constant from enum
		PracticeEnum rEnum = PracticeEnum.WEST;
		System.out.println(rEnum);
		
		// here we can iterate all enum constant
		for (PracticeEnum tes : PracticeEnum.values()) 
		{
			System.out.println(tes);
		}
		
		System.out.println(rEnum.getDirectorcode());
	}

}
