public class File implements FileSystem {
	
	String fileName;
	
	public File(String name) {
		this.fileName = name;
	}
	@Override
	public void ls() {
		
		System.out.print("Movie name: " + fileName + "    ");
		
	}

}
