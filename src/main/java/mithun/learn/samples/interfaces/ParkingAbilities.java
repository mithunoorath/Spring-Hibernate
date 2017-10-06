/**
 * 
 */
package mithun.learn.samples.interfaces;

/**
 * @author vagrant
 *
 */
public interface ParkingAbilities {
	public int parkingSpaces = 0;
	public double parkingRates = 0.0;
	//public Time
	
	public boolean anyEmptyParkingSpots();
	public void setParkingSpots(int spots);
	public int getParkingSpots();
	public int getLargeVehicleParkingSpots();
	

}
