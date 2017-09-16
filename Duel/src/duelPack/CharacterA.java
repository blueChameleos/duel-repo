package duelPack;

public class CharacterA implements Dueler{
	
	private String Name;
	private int HP;
	private int currentHP;
	String[] taunts = {"Come on!","Fox flips his gun", "Here I come!"};
	
	public CharacterA() 
	{
		this.Name = "Fox";
		this.HP = 300;
	}
	
	public void taunt()
	{;
		int rand = (int)(Math.random()*taunts.length);
		System.out.println(taunts[rand]);
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
		System.out.println(HP);
		return HP;
	}
	
	public int getAction(Object caller)
	{
		return -1;
	}
	
	public void hit(Object caller) 
	{
		
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp)
	{
		return false;
	}
	
}


