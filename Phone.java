
public class Phone {
		private int number; 
		private String type; 
		private String color; 
		
		
			public Phone() {
				
			}
			
			public Phone(String name, int age) {
				this.number = number; 
				this.type = type;
			}
			
			public Phone(int number, String type, String location) {
				this.number = number; 
				this.type = type; 
				this.color = color;
			}

			public int getNumber() {
				return number;
			}

			public void setName(String name) {
				this.number = number;
			}

			public String getType() {
				return type;
			}

			public void setAge(int age) {
				this.number = number;
			}

			public String getColor() {
				return color;
			}

			public static String setColor(String color) {
				return color;
			}
			
			public static boolean isWorking() {
				return true; 
			}
			
			public static String smartPhone() {
				return "Ring Ring Ring....Talk, Text, Browse the Web and be Meri !";
			}
			
			
			
			public static void main(String[] args) {
				Phone smart = new Phone(631, "Samsung", "Galaxy");
				System.out.println(String.isWorking +"smart");
				//String list = "pizza";
			}
			


		
	}


