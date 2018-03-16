
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author Dushik
 * 
 */
public class WriteToFile {

	public WriteToFile(String path,ArrayList<String> content)
	{
		try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write("201571030106");  
            bw.newLine();
            for(String con:content){
                bw.write(con);  
                bw.newLine();
            }
            bw.close();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
	}
}
