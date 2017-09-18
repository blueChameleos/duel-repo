package duelPack;

public class CharacterB implements Dueler
{
	private String name;
	private int currentHP;
	String[] taunt = {"lol u suck, get better nerd, ur garbage"};
	
	public CharacterB()
	{
		this.name = "Marth";
	}
	public void taunt()
	{
		int randTaunt = (int)(Math.random()*taunts.length);
		
		if(randTaunt != 1)
		{	
			System.out.println("Marth, the better character says, '" + taunts[rand] + "'");
		}
		else 
		{
			System.out.println(taunts[randTaunt]);
		}
	}
	public String getName()
	{
		return name;
	}
	public void setStartingHP(int hp)
	{
		currentHP = hp;
	}
	public int getHP()
	{
		return currentHP;
	}
	public int getAction(Object caller)
	{	
		if(caller instanceof Duel)
		{
			int rand = (int)(Math.random()*3);
			return rand;
		}
		
		return 3;
	}
	
	public void hit(Object caller) 
	{
		if(caller instanceof Duel)
		{
			this.currentHP = currentHP - 10;
		}
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp)
	{
		if(d.getHP() != hp)
		{
			return false;
		}
		
		return true;
	}
}