public class Laptop extends Computer
{

    private boolean trackPadCalibrated;

    public Laptop(int screenSize, int memory)
    {
        super(screenSize, memory);
        trackPadCalibrated = false; // default value
    }

    public void calibrateTrackpad()
    {
        if (!trackPadCalibrated)
        {
            trackPadCalibrated = true;
            System.out.println("Calibration complete!");
        }
        else
        {
            System.out.println("No need to calibrate");
        }
    }
}
