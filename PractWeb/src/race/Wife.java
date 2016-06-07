package race;
import race.Headman;

public class Wife {
public boolean cook;
public static boolean inventory;
public boolean cooking(Boolean weather, String season, Boolean inventory2){
	Wife.inventory = inventory2;
	Headman headman = new Headman();
	if(headman.hunting(weather, season) == true){
		cook = true;
	}else{
		cook = false;
	}
	return cook;
}
public boolean CheckInventory(){
	return Wife.inventory;
}
}
