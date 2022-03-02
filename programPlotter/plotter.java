package programPlotter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Random;

public class plotter 
{
        FileWriter fw;
        BufferedWriter bw;
        Random rand = new Random();
        int xVal;
        double yVal;
    
        public plotter()
        {
            try
            {
                fw = new FileWriter("data.csv");
            } 
            catch(Exception e)
            {
                System.out.println("Error Has Occured: " + e.toString());
            }
        }
        public void outputData(int times)
        {
            bw = new BufferedWriter(fw);
            try
            {
                try
                {
                    bw.write("X Value ,Y Value\n");
                    for(int i=0; i<=times;i++)
                    {
                        xVal = i;
                        double slope = .5;
                        int yIntercept = 3;
                        yVal = (slope*xVal)+yIntercept;
                        bw.write(xVal + "," +yVal + "\n");
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
