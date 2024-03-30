package impl;

import java.util.*;
import model.UserModel;
import service.UserService;

public class UserImpl implements UserService {

	private final ArrayList<String> store = new ArrayList<>();
	private final ArrayList<String> stores = new ArrayList<>();
	private final ArrayList<String> foodlist = new ArrayList<>();

	int num;

	public final String cart(final UserModel addtocart) {
		final Collection<String> object = foodlist;

		store.addAll(object);
		return store.get(addtocart.getNum());
	}

	public final long number(final UserModel m) {
		return m.getNumber();
	}

	public final int pass(final UserModel n) {
		return n.getPassword();
	}

	private final ArrayList<String> swig = new ArrayList<>();

	public final ArrayList<String> hotel(final UserModel userinfo) {
		int h = userinfo.getfood();
		switch (h) {

		case 1:

			foodlist.add("");
			foodlist.add("Idly");
			foodlist.add("Dosa");
			foodlist.add("Pongal");
			foodlist.add("Poori");
			foodlist.add("Upma");

			swig.addAll(foodlist);

			return foodlist;

		case 2:

			foodlist.add("");
			foodlist.add("Chicken Biriyani");
			foodlist.add("Chicken Tikka");
			foodlist.add("Mutton Curry");
			foodlist.add("Prawn Fry");
			foodlist.add("Fish Curry");

			swig.addAll(foodlist);

			return foodlist;

		case 3:

			foodlist.add("");
			foodlist.add("Mutton briyani");
			foodlist.add("chicken briyani");
			foodlist.add("fried rice");
			foodlist.add("chili chickken");
			foodlist.add("noodelss");

			swig.addAll(foodlist);

			return foodlist;

		case 4:

			foodlist.add("");
			foodlist.add("idly");
			foodlist.add("dosa");
			foodlist.add("poori");
			foodlist.add("pongal");
			foodlist.add("chapathi");
			foodlist.add("idiyappam");

			swig.addAll(foodlist);

			return foodlist;
		case 5:

			foodlist.add("");
			foodlist.add("Mini idly");
			foodlist.add("podi Idly");
			foodlist.add("ghee idly ");
			foodlist.add("chilli idly");
			foodlist.add("meduvada");

			swig.addAll(foodlist);

			return swig;

		}
		return null;
	}

	public final ArrayList<String> products(final UserModel snacks) {
		int x = snacks.getsnacks();
		switch (x) {
		case 1:

			foodlist.add("");
			foodlist.add("Onion");
			foodlist.add("Potato");
			foodlist.add("Brinjal");
			foodlist.add("Carrot");
			foodlist.add("Tomato");

			return foodlist;

		case 2:

			foodlist.add("");
			foodlist.add("Apple");
			foodlist.add("Orange");
			foodlist.add("Banana");
			foodlist.add("Grapes");
			foodlist.add("Papaya");

			return foodlist;

		case 3:

			foodlist.add("");
			foodlist.add("Wondercake");
			foodlist.add("Aavin milk");
			foodlist.add("KC milk");
			foodlist.add("Amul");
			foodlist.add("Hatsun");

			return foodlist;

		case 4:

			foodlist.add("");
			foodlist.add("Chicken Mix");
			foodlist.add("Briyani Mix");
			foodlist.add("Sambar Mix");
			foodlist.add("Mutton Mix");
			foodlist.add("Gobi Mix");

			return foodlist;

		case 5:

			foodlist.add("");
			foodlist.add("Goodday");
			foodlist.add("50/50");
			foodlist.add("Hidden seek");
			foodlist.add("Oreo");
			foodlist.add("Treat");

			return foodlist;
		}

		return null;
	}

	public final ArrayList<String> display(final UserModel dish) {
		store.add(swig.get(num));
		stores.add(dish.getCart());
		dish.setMart(stores);
		return dish.getMart();
	}

}
