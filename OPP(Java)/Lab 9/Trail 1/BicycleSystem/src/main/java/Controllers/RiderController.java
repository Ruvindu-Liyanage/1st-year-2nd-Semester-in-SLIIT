
package Controllers;

import Models.Rider;
import Models.Rider.Record;
public class RiderController {
    Rider objRider;
    Record objRecord;
    
    public Rider addRider(String name, String Country, int Age, float Weight, float Height)
    {
        objRider=new Rider(name, Country, Age, Weight, Height);
        return objRider;
    }
    
    public Rider.Record addRiderRecord( int No_Of_Olympic_Medals, float TopSpeed, int No_National_Level_Records)
    {
        objRecord =objRider.new Record(No_Of_Olympic_Medals, TopSpeed, No_Of_Olympic_Medals);
        return objRecord;
    }
}
