package factorymethod.solution;

public class BikeFactory extends TransportFactory{
	Transport create() {
		return new Bike();
	}
}
