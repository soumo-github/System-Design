import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
	
	String dirName;
	List<FileSystem> filelist;
	public Directory(String name) {
		super();
		this.dirName = name;
		this.filelist = new ArrayList<>();
	}
	
	public void add(FileSystem fs) {
	
		filelist.add(fs);

	}

	@Override
	public void ls() {

		System.out.println("Directory: " + dirName);
		System.out.println();
		
		for(var v : filelist)v.ls();
		System.out.println();
		System.out.println();
		
		
	}
	
	
	
}
