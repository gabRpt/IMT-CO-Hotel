import hotelManagment.Hotel;
import hotelManagment.HotelManagmentFactory;

public class User {

	public ResourceTools myResourceTools;
	public HotelManagmentFactory myHotelFactory;
	
	public User(ResourceTools ressource,HotelManagmentFactory hotelFactory) {
		this.myResourceTools = ressource;
		this.myHotelFactory = hotelFactory;
		
	}
	
	
	
	
}
