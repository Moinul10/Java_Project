package AirlineReservationSystem;
public class AirlineReservationMain {
    public static void main(String[] args) {
        // Create passenger, employee, and flight
        Passenger passenger = new Passenger("Shahed", "P123", "BD998877");
        Employee employee = new Employee("Mr. Reza", "E333", "Flight Manager");
        Flight flight = new Flight("BG456", "Dubai", "08:30 AM");

        // Create reservation system
        Reservation reservation = new Reservation();

        // Display details
        passenger.displayPassengerInfo();
        employee.displayEmployeeInfo();
        flight.displayFlightInfo();

        // Book ticket
        reservation.bookTicket(passenger, flight);
    }
}
