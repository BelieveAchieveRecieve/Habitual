import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;
import java.io.InputStream;

public class WriteToFile {

    static File file = new File("resources/com/achievebelieverecieve/SaveData");

    public void saveListsToFile(String lists) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.append(" ");
        writer.append(lists);
        writer.close();

        try {
            if (!file.exists())
            {
                file.createNewFile();
            }


                } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(writer!=null)
                    writer.close();
            }
            catch(Exception ex){
                System.out.println("Error in closing BufferedWriter" + ex);
            }
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
