import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToFile {

    File file  = new File("C:\\Users\\GA1\\code\\BeleiveAcheiveRecieve\\Habitual\\PaulBranches\\src\\SaveData");

    public void saveListsToFile(String lists) {
        BufferedWriter writer;
        try{
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.append(" ");
            writer.append(lists);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearSave(){
        BufferedWriter writer;
        try{
            writer = new BufferedWriter(new FileWriter(file));
            writer.write("No saves");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
