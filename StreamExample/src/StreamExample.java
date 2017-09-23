import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {

	public void processPaths(String directoryName) {
		
		Path path = Paths.get(directoryName);
		
		//walk the file tree and get a Stream of Path
		try (Stream<Path> paths = Files.walk(path)) {
			
			//use aggregate operation forEach to process each file 
			paths.forEach(p -> processPath(p));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void processPath(Path p) {
		System.out.println(p.getFileName());
	}

	
	public static void main(String[] args) {
		StreamExample se = new StreamExample();
		se.processPaths(".");
	}
		

}
