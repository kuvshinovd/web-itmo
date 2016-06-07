package race;
import race.Wife;

public class Headman {
	public boolean production;
	public boolean hunting(Boolean weather, String season){
		Wife wife = new Wife();
		if(season.equals("summer")|| season.equals("autumn") || season.equals("spring")){
			if(weather == true){
				production = true;
			}else{
				production =  wife.CheckInventory();
			}
		}else{
			production =  wife.CheckInventory();
		}
		
		
		return production;
	}
}
