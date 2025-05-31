
package AirlineReservationSystem;
public class Reservation {
    public void bookTicket(Passenger passenger, Flight flight) {
        System.out.println("Booking confirmed for " + passenger.name + " on flight " + flight.flightNumber);
    }
}

