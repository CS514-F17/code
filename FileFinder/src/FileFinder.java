import java.io.File;
import java.util.ArrayList;

public class FileFinder {

	private String extension;
	
	public FileFinder(String extension) {
		this.extension = extension.toLowerCase();
	}
	
	public ArrayList<String> getFiles(String rootDir) {
		
		//create the return list
		ArrayList<String> list = new ArrayList<String>();
		
		//call the helper method
		File current = new File(rootDir);
		if(!current.isDirectory()) {
			return null;
		}
		
		getFiles(current, list);
		
		//return the list
		return list;
	}

	private void getFiles(File current, ArrayList<String> list) {
		
		//if I find a file
		//	if the extension matches target
		//		add to return list
		//	else
		//		do nothing
		if(current.isFile()) {
			if(current.getName().toLowerCase().endsWith(extension)) {
				list.add(current.getAbsolutePath());
			}
			return;
		}
		
		//if I find a directory
		//	for each file in the directory
		//		recursively call the method
		if(current.isDirectory()) {
			File[] children = current.listFiles();
			if(children == null) {
				return;
			}
			for(File f: children) {
				getFiles(f, list);
			}
		}
		
	}
	
	
}
