package duelPack;

public class CharacterB implements Dueler
{
	private String name;
	private int HP;
	
	public CharacterB(String name, int HP)
	{
		this.name = "Ur mom";
		this.HP = 100;
	}
	public void taunt() 
	{
		String[] taunt = {"lol u suck, get better nerd, ur garbage"};
		System.out.println(taunt);
		
	}
	public String getName()
	{
		return name;
	}
	public void setStartingHP(int hp)
	{
		HP = hp;
	}
	public int getHP();
	{ 
		System.out.println(HP);
		return HP;
	}
	public void getAction()
	{
		
	}
}