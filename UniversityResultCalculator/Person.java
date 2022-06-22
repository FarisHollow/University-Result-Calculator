public abstract class Person
{
    private String name ;
    private int age ;
    protected String email ;
    protected boolean occupation ;
	
    public Person(String name, int age, String email, boolean occupation)
	{
		this.name = name ;
		this.age = age ;
		this.email = email ;
		this.occupation = occupation ;	
	}
    public void setName(String name)
	{
		this.name = name ;
	}
    public void setAge(int age)
	{
		this.age = age ;
	}
    public String getName()
	{
		return name ;
	}
    public int getAge()
	{
		return age ;
	}
	public void setEmail(String email)
	{
		this.email = email ;
	}
    public String getEmail()
	{
		return email ;
	}
	public void setOccupation(boolean occupation)
	{
		this.occupation = occupation ;
	}
	public boolean getOccupation()
	{
		return occupation ;
	}
	abstract public void hasStudentId() ;
	abstract public void display() ;
}
