package hust.soict.hedspi.test.cart;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {
	 public static void main(String[] args) {
	        Cart cart = new Cart();
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Thien ly oi  ","Animation",
	                "Roger Allers",87,19.95f);
	        cart.addMedia(dvd1);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("J97      ","Science Fiction",
	                "Geogre Lucas",87,24.95f);
	        cart.addMedia(dvd2);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("domdom","Animation",18.99f);
	        cart.addMedia(dvd3);

	        cart.displayDigitalVideoDisc();

	      //Test search by ID method
	        cart.searchById(3);
	        cart.searchById(4);

	        //Test search by Title method
	        cart.searchByTitle("The Lion King");
	        cart.searchByTitle("Alan Walker");
	    }
}
