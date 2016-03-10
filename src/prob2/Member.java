package prob2;

public class Member {
	private String id;
	private String name;
	
	//constructor
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	//method
	@Override
	public String toString() {
		return id + ":" + name;
	}

	//getter&setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
