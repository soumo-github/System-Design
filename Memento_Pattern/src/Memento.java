
public class Memento {

	String name, mail;
	int age;
	
	public Memento(String name,  int age, String mail) {
		super();
		this.name = name;
		this.mail = mail;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	public int getAge() {
		return age;
	}
	
	
}
