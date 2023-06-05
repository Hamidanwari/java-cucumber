package FalconCucumberFrameWork.CucumberFrame;

import java.util.ArrayList;

public class RestaurantMenu {

	// to store data in a list --> ArrayList
	
		ArrayList<RestaurantMenuItem> MenuItems = new ArrayList<RestaurantMenuItem>();
		
		public boolean addMenuItem(RestaurantMenuItem newMenuItem) {
			return MenuItems.add(newMenuItem); 
		}
		
		// if a menu exists/does not exists --> true | false
		
		public boolean doesItemExist(RestaurantMenuItem newMenuItem) {
			
			boolean Exists = false; 
			
			if (MenuItems.contains(newMenuItem)){
				Exists = true; 
			}
			return Exists; 
		}
}
