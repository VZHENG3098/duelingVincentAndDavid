package duel;

public class CharacterB implements Dueler{
	
	private String name;
	public int hp1;
	private boolean ifLoaded = false;
	
	public CharacterB(){
		
	}
	public void taunt() {
		String taunt = ("you are trash!!!");
		System.out.println(taunt);
	}
	public String getName() {
		name = "David";
		return name;
	}
	
	public void setStartingHP(int hp) {
		System.out.println(hp);
		hp = 100;
		hp1 = hp;
		
	}
	
	public int getHP(){
		return hp1;
	}
	
	

	public boolean determineIfOpponentIsFair(Dueler d, int hp){
		
		if(d.getHP()!=hp)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	
	public int getAction(Object caller) {
		if(ifLoaded == false) {;
			ifLoaded = true;
			return 0;
		}else {
			int randNumber = (int)Math.floor(Math.random()*2+1);
			
			if (randNumber <= 1) {
				return 1;
			}else {
				ifLoaded = false;
				return 2;
			}
		}
	}
	
	public void hit(Object caller){
			hp1=hp1-10;
		
	}
	
	
}
