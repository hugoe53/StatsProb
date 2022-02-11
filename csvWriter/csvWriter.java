package csvWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Random;
public class csvWriter 
{
        FileWriter fw;
        BufferedWriter bw;
        Random rand = new Random();
        int id;
        int randFavNumber;
    
        public csvWriter()
        {
            try
            {
                fw = new FileWriter("numbers.csv");
            } 
            catch(Exception e)
            {
                System.out.println("Error Occured: " + e.toString());
            }
        }
    
        public void outputNumbers(int times)
        {
            bw = new BufferedWriter(fw);
            try
            {
                try
                {
                    bw.write("ID,User Input\n");
                    for(int i=1; i<=times;i++)
                    {
                        id = i;
                        randFavNumber = rand.nextInt(1000);
                        bw.write(id + "," +randFavNumber + "\n");
                    }
                } 
                finally 
                {
                    bw.close();
                }
            } 
            catch (Exception e) 
            {
                System.out.println("Error while closing or writing the file:  " + e.toString());
            }
    
        }
     
}
