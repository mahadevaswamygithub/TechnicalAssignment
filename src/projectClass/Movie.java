package projectClass;
class OnlineBooking{
	int totalTicket =100;
	void buyTicket(int n) {
		System.out.println("Buying "+ n + "ticket");
		if(n<=totalTicket) {
			totalTicket = totalTicket -n;
			System.out.println("Buying ticket is success");
		}
		else {
			System.out.println("Ticket not available");
		}
		
	}
	void cancelTicket(int n) {
		System.out.println("canncelTicket"+ n + "Ticket");
		totalTicket = totalTicket + n;
	}
	void viewAvailableTicket() {
		System.out.println("Total ticket available:" + totalTicket);
	}
		
	}

class Movie {
	public static void main(String[] args) {
		OnlineBooking o1 = new OnlineBooking();
		o1.viewAvailableTicket();
		o1.buyTicket(20);
		o1.viewAvailableTicket();
		o1.cancelTicket(5);
		o1.viewAvailableTicket();
		
	}
}
