
public class Main {

	public static void main(String[] args) {

		Directory dir = new Directory("Movies");
		Directory Action = new Directory("Action Movies");
		Directory Life = new Directory("Beautiful Movies");
		
		FileSystem tsr = new File("The ShawShank Redemption");
		FileSystem fg = new File("Forrest Gump");
		Life.add(tsr);
		Life.add(fg);
		FileSystem fnf = new File("Fast and Furious");
		Action.add(fnf);
		dir.add(Action);
		dir.add(Life);
		dir.ls();
		
		
	}

}
