package programSmoother;
import java.util.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;  

public class smoother 
{
    FileWriter fw;
    BufferedWriter bw;
    Random rand = new Random();
    public smoother()
    {
        try
            {
                fw = new FileWriter("finalData.csv");
            } 
            catch(Exception e)
            {
                System.out.println("Error Has Occured: " + e.toString());
            }
    }
    public void outputData(int times,int bound)
    {
        bw = new BufferedWriter(fw);
        try
        {
            try
            {
                bw.write("X Value ,Y Value\n");
                File myObj = new File("newData.csv");
                Scanner myReader = new Scanner(myObj);
                String header = myReader.nextLine();
                ArrayList<Double> xVal = new ArrayList<Double>();
                ArrayList<Double> yVal = new ArrayList<Double>();
                    for(int i=0; i<=times;i++)
                    {
                        
                        while (myReader.hasNextLine()) 
                        {   
                            
                            String data = myReader.nextLine();
                            for(int j = 0; j<= data.length();j++)
                            {
                                int index = data.indexOf(',');
                                int startChange = index+1;
                                
                                double newYval = Double.valueOf(data.substring(startChange));
                                double newXval= Double.valueOf(data.substring(0, startChange-1));
                                xVal.add(newXval);
                                yVal.add(newYval);
                                
                                //bw.write(newXval + "," +average + "\n");
                            }
                            
                            
                            break;
                        }
                        
                    }
                    double sum = 0.0;
                    int count = 0;
                    double average = 0.0;
                    for(int j = 0; j< yVal.size();j++)
                    {
                            sum+=yVal.get(j);
                            count++;
                            average = sum/(double)count;
                            yVal.set(j, average);
                    }
                    for(int i=0; i<=times;i++)
                    {
                        bw.write(i + "," +yVal.get(i) + "\n");
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
