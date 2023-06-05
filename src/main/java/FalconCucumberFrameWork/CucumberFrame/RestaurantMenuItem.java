package FalconCucumberFrameWork.CucumberFrame;

public class RestaurantMenuItem {

	
		// OOPs: 1. Encaps  (private)

		private String ItemName; 
		private String Description;
		private int Price;

		// Constructor 
		public RestaurantMenuItem (String itemName, String description, int price) {
			super(); 
			ItemName = itemName; 
			Description = description; 
			Price = price; 

		}

		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}

		public int getPrice() {
			return Price;
		}
		public void setPrice(int price) {
			Price = price; 
		}
		public String getItemName() {
			return ItemName;
		} 

	}

