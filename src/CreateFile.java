import java.io.File;
import java.io.IOException;

public class CreateFile  {
    public CreateFile()
    {
        try{
            File salesData = new File("salesData.txt");
            if(salesData.createNewFile()==true)
            {
                System.out.println("New file created : "+ salesData.getName());
            }
            else {
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred");
        }

    }
}
