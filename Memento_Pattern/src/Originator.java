
public class Originator {

	private String name;
	private int age;
	private String mail;
	
	public Originator(String name, int age, String mail) {
		super();
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Memento create() {
		return new Memento(name, age, mail);
	}
	
	public void restore(Memento mem) {
		
		this.name = mem.name;
		this.age = mem.age;
		this.mail = mem.mail;
		
	}
}
