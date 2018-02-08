//Theodore Ruth Java Chapter 11: Exercise 3
public class Tile {
	public static void main(String[] args)
	{
		testTile();
		Tile tile1 = new Tile('a', 2);
		Tile tile2 = tile1;
		Tile tile3 = new Tile('a', 2);
		System.out.println(tile1);
		System.out.println(tile2);
		System.out.println(tile3);
		
		if(tile1 == tile2)
		{
			System.out.println("Tile 1 and 2 both point to the same object");
		}
		
		if(tile1.equals(tile3))
		{
			System.out.println("The .equals method works!");
		}
		System.out.println(tile1.getValue());
		System.out.println(tile1.getLetter());
		tile1.setLetter('b');
		tile1.setValue(3);
		System.out.println(tile1.getValue());
		System.out.println(tile1.getLetter());
		
	}
	
	public static void testTile()
	{
		Tile t = new Tile('z', 10);
		t.printTile();
	}
	
	
	
	
	private char letter;
	private int value;
	
	public Tile(char letter, int value)
	{
		this.letter = letter;
		this.value = value;
	}
	
	public void printTile()
	{
		System.out.println("The character \"" + this.letter + " \" is worth " + this.value + " points.");
	}
	
	public char getLetter()
	{
		return this.letter;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public void setLetter(char letter)
	{
		this.letter = letter;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public boolean equals(Tile otherTile)
	{
		return this.letter == otherTile.letter
				&& this.value == otherTile.value;
	}
	
	public String toString()
	{
		return "Letter: " + this.letter + ", Value: " + this.value;
	}
	
}
