public class Function 
{
    public void salterRun()
    {
        Graph test = new Graph();
        test.fillInitialValues();
        String title = "Salted Data";
        String fileName = "salterGraph";
        test.makeGraph(title,fileName);
    }
    public void smootherRun()
    {
        Graph test = new Graph();
        test.fillInitialValues();
        test.smoother();
        String title = "Smoothed Data";
        String fileName = "smootherGraph";
        test.makeGraph(title, fileName);
    }
       
}
