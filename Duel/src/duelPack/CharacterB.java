package duelPack;

public class CharacterB implements Dueler
{
	private String name;
	private int currentHP;
	private boolean isLoaded;
	
	String[] taunts = {"lol u suck", "get better nerd", "ur garbage"};
	
	public CharacterB()
	{
		this.name = "Falco";
	}
	
	public void taunt()
	{
		int rand = (int)(Math.random()*taunts.length);
		System.out.println("Falco says, '" + taunts[rand] + "'");
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setStartingHP(int hp)
	{
		currentHP = hp;
		isLoaded = false;
	}
	
	public int getHP()
	{
		return currentHP;
	}
	
	public int getAction(Object caller)
	{	
		if(caller instanceof Duel)
		{
			if(!isLoaded)
			{
				if(Math.random() > .5)
				{
					isLoaded = true;
					return 0;
				}
				else
				{
					return 2;
				}
			}
			else
			{
				if(Math.random() > .5)
				{
					isLoaded = false;
					return 1;
				}
				else
				{
					return 2;
				}
			}
		}
		return 3;
	}

	
	public void hit(Object caller) 
	{
		if(caller instanceof Duel)
		{
			this.currentHP -= 10;
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


