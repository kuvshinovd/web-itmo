package race;
import race.Wife;

public class Son {
	public String full;
	public String eating(Boolean weather, String season, Boolean inventory){
		Wife mom = new Wife();
		if(mom.cooking(weather, season, inventory) == true){
			full = "i,m not hungry";
		}else{
			full = "It's time too kill";
		}
		return full;
	}
}
