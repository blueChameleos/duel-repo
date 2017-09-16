package duelPack;

public class CharacterA implements Dueler{
	
	private String Name;
	private int currentHP;
	String[] taunts = {"Come on!","Fox flips his gun", "Here I come!"};
	
	public CharacterA() 
	{
		this.Name = "Fox";
	}
	
	public void taunt()
	{
		int rand = (int)(Math.random()*taunts.length);
		
		if(rand != 1)
		{	
			System.out.println("Fox says, '" + taunts[rand] + "'");
		}
		else 
		{
			System.out.println(taunts[rand]);
		}
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setStartingHP(int hp)
	{
		currentHP = hp;
	}
	
	public int getHP()
	{
		System.out.println(currentHP);
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


