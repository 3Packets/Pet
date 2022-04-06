
public class Pet {
	private String name;
	private int age;
	private String location;
	private String type;

	public Pet() {
	}
	
	
	public Pet(String name, int age, String location, String type){ 
		this.name = name;
		this.age =age;
		this.location = location;
		this.type = type;
	}
	String getName() {
		return name;
		
	}
	int getAge() {
		return age;
	}
	String getType() {
		return type;
	}
	void setName(String name) {
		this.name = name;
	
	}
	
	
	void setAge(int age) {
		this.age = age;
	}
	
	void setLocation(String location) {
		this.location = location;
	
	}
	public static void main(String [] args) {
		Pet goldie = new Pet("Goldie", 1, "New York", "Cat");
		System.out.println(goldie.getType());
	}
}
