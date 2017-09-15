package duelPack;

public class CharacterB implements Dueler
{
	public CharacterB()
	{
		private String name;
		private int hp;
	}
	public void taunt() 
	{
		String[] taunt = {"lol u suck, get better nerd, ur garbage"};
		System.out.println(taunt);
		
	}
	public String getName()
	{
		String name = "ur mom";
		return name;
	}
	public void setStartingHP(int hp)
	{
		System.out.println(hp);
	}
	public int getHP();
	{ 
		return hp;
	}
	public void getAction()
	{
		
	}
}