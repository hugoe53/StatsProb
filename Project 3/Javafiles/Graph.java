import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.plot.PlotOrientation;

public class Graph{
    private ArrayList<Double> yVal = new ArrayList<Double>();
    public void smoother()
    {

    }
    public void fillInitialValues()
    {

        File myObj = new File("salterData.csv");
        try {
            Scanner myReader = new Scanner(myObj);
            
            String header = myReader.nextLine();
            while (myReader.hasNextLine()) 
                        {   
                            
                            String data = myReader.nextLine();
                            for(int j = 0; j<= data.length();j++)
                            {
                                int index = data.indexOf(',');
                                int startChange = index+1;
                                
                                double newYval = Double.valueOf(data.substring(startChange));                      
                                yVal.add(newYval);
                                break;
                                //bw.write(newXval + "," +average + "\n");
                            }
                            
                            
                            
                        }
                        
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void makeGraph(String name, String fileName)
    {
        DefaultCategoryDataset yValues = new DefaultCategoryDataset();
        for(int i = 0; i<yVal.size();i++)
        {
            int xVal = i;
            yValues.addValue(yVal.get(i), name, String.valueOf(xVal));
        }
        JFreeChart test = ChartFactory.createLineChart(name,"X Values from 0 to 1000","Y Values",yValues,PlotOrientation.VERTICAL,true,true,false);

            int width = 3600;
            int height = 1600;
            File saltedchart = new File(fileName + ".jpeg");
            try 
            {
                ChartUtils.saveChartAsJPEG(saltedchart, test, width, height);
            } 
            catch (IOException e) 
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

    }

}