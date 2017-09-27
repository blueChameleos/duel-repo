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
		int rand0 = (int)(Math.random()*10);
				
		if(caller instanceof Duel)
		{
			
			if(this.currentHP >= 30) 
			{
				if(rand0 <= 3)
				{
					return 2;
				}
				else if(rand0 >= 8) 
				{
					this.isLoaded = true;
					return 0;
				}
				else 
				{
					return shoot();
				}
			}
			
			else 
			{
				if(rand0 <= 5) {
					return 0;
				}
				else 
				{
					return shoot();
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
	
	public int shoot()
	{
		if(isLoaded == true) 
		{
			isLoaded = false;
			return 1;
		}
		else 
		{
			int action = (int)(Math.random()*2);
			
			if(action == 0)
			{
				return action;
			}
			
			return 2;
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


