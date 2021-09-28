
package Controllers;

import Models.Bicycle;
public class BicycleController {
  
    Bicycle ObjBike;
    
    public Bicycle addBicycle(int Gear,float Speed)
    {
       ObjBike =new Bicycle(Gear,Speed);
       return ObjBike;
    }
}
