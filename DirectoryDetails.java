import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DirectoryDetails extends FileDetails implements Iterable<FileDetails> {

    List<FileDetails> leaves;
     
    public DirectoryDetails(String path, String name){
        super(path,name);
        leaves = new ArrayList<FileDetails>();
    }
    
    public void addFile(FileDetails fileDetails){
        leaves.add(fileDetails);
    }

    @Override
    public int accept(FileVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public Iterator<FileDetails> iterator() {
        return leaves.iterator();
    }
}