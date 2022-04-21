package programSalter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Random;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
public class salter 
{
    FileWriter fw;
    BufferedWriter bw;
    Random rand = new Random();
    public salter()
    {
        try
            {
                fw = new FileWriter("salterData.csv");
            } 
            catch(Exception e)
            {
                System.out.println("Error Has Occured: " + e.toString());
            }
    }
    /**
     * This method prints the data line by line
     * @param times - the amount of lines you want
     * @param bound - what you want added or subtracted to the y value
     */
    public void outputData(int times,int bound)
    {
        bw = new BufferedWriter(fw);
        Random rand = new Random();
        try
        {
            try
            {
                bw.write("X Value ,Y Value\n");
                File myObj = new File("plotterData.csv");
                        Scanner myReader = new Scanner(myObj);
                        String header = myReader.nextLine();
                        double newYval=0;
                        double newXval=0;
                    for(int i=0; i<=times;i++)
                    {
                        
                        while (myReader.hasNextLine()) 
                        {   
                            String data = myReader.nextLine();
                            for(int j = 0; j<= data.length();j++)
                            {
                                int index = data.indexOf(',');
                                int startChange = index+1;
                                newYval = Double.valueOf(data.substring(startChange));
                                newXval= Double.valueOf(data.substring(0, startChange-1));
                                if(rand.nextInt(2)==1)
                                    newYval=newYval+bound;
                                else
                                    newYval=newYval-bound;
                                
                            }
                            bw.write(newXval + "," +newYval + "\n");
                            break;
                        }
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
    