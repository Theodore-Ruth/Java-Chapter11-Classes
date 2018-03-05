//Theodore Ruth Java Chapter 11: Exercise 4
public class Date {

	public static void main(String[] args) {
		Date birthday = new Date(6, 8, 2001);
		System.out.println(birthday);

	}
	
	
	
	
	private int month;
	private int day;
	private int year;
	
	
	public Date()
	{
		this.month = 2;
		this.day = 2;
		this.year = 2018;
	}
	public Date(int month, int day, int year)
	{
		
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String toString()
	{
		return this.month + "/" + this.day + "/" + this.year;
	}

}
