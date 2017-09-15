package duelPack;

public class CharacterA implements Dueler{
	
	private String Name;
	private int HP;
	
	public CharacterA() 
	{
		this.Name = "Fox";
		this.HP = 300;
	}
	
	public void taunt()
	{
		String[] taunts = {"Come on!", "Here I come!"};
		double rand = Math.random()*taunts.length;
		//System.out.println(taunts[rand]);
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void getStartingHP(int hp)
	{
		HP = hp;
	}
	
	public int getHP()
	{
		System.out.println(HP);
		return HP;
	}
	
	
	
}


