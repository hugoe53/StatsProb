package programSalter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Random;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
public class salter 
{
    public salter(int bound)
    {
        try 
        {
            File myObj = new File("data.csv");
            Scanner myReader = new Scanner(myObj);
            String header = myReader.nextLine();
            while (myReader.hasNextLine()) 
            {   
                String data = myReader.nextLine();
                for(int i = 0; i<= data.length();i++)
                {
                    int index = data.indexOf(',');
                    System.out.println(index);
                    int startChange = index+1;
                    double newYval = Double.valueOf(data.substring(startChange));
                    System.out.println(newYval);

                    break;
                }
                System.out.println(data);
            }
            myReader.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
      }
    }
}
    