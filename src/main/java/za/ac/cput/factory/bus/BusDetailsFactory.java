package za.ac.cput.factory.bus;

import za.ac.cput.domain.bus.BusDetails;
import za.ac.cput.helper.Misc;

public class BusDetailsFactory
{
    public static BusDetails getBusDetails(String busNo,String busName,String seats)
    {
        return new BusDetails.Builder()
                .busName(busName)
                .busNo(Misc.generateId())
                .busSeats(seats)
                .build();
    }
}
