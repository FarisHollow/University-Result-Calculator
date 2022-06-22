public class Student extends Person
{
    private String id ;
	
	public Student(String name, int age, String email, boolean occupation, String id)
	{
		super(name, age, email, occupation) ;
		this.id = id ;
	}
        public void setId(String id)
	{
		this.id = id ;
	}    
        public String getId()
	{
		return id ;
	}
	public void hasStudentId() 
	{
		System.out.println("                                                ");
		System.out.println(" Yes, Student has Student ID card ") ;
	}
	public void display() 
	{
		System.out.println(" Name of the student is : " + getName()) ;
		System.out.println(" Age of the student is : " + getAge()) ;
		System.out.println(" Email of student is : " + getEmail()) ;
		System.out.println(" Occupation of student is : " + getOccupation()) ;
		System.out.println(" ID of Student is : " + getId()) ;
	}
}
