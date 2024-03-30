package view;

import java.util.*;
import controller.UserController;
import model.UserModel;
import impl.UserImpl;

public class UserView {
	private static final Scanner scanner = new Scanner(System.in);
	private static final UserController control = new UserController();
	private static final UserModel userinfo = new UserModel();
	private static final ArrayList<String> demo = new ArrayList<>();

	private void createUser() {
		System.out.println("Enter Your Number : ");
		final long input = scanner.nextLong();

		userinfo.setNumber(input);
		System.out.println("Enter Your Name :  ");

		userinfo.setName(scanner.nextLine());
		System.out.println("Create Your New  Password : ");
		final int num = scanner.nextInt();

		userinfo.setPassword(num);
		System.out.println("Created Succesfully... ");
	}

	private void check() {
		System.out.println("Enter Your Number : ");
		final long input = scanner.nextLong();

	}

	private void signin() {
		System.out.println("Enter  Your Number : ");
		final long userinput = scanner.nextLong();
		if (userinput == (userinfo.getNumber())) {
			System.out.println("Enter Your Password :");
			Integer inputfromuser = scanner.nextInt();
			if (inputfromuser == userinfo.getPassword()) {
				System.out.println("login Sucessfull.." + "Hello.. " + userinfo.getName());
				menu();
			} else {
				System.out.println("wrong pass try again ...");
				signin();
			}
		}
	}

	private void exit() {
		System.out.println("Thank You...");

	}

	private void foodDelivery() {
		System.out.println("Available Hotels !!! ");
		System.out.println("1.A2B\n2.Hakkims\n3.ssHydrabath\n4.Sangeetha's\n5.MuruganIdly");
		final int inputuser = scanner.nextInt();
		userinfo.setfood(inputuser);
		switch (inputuser) {
		case 1:
			System.out.println("Welcome to A2B !!!\nA2B todays menu " + control.hotel(userinfo)
					+ "\nselect your order or for exit select 9");

			break;

		case 2:
			System.out.println("Welcome to Hakkims !!!\nHakkims todays menu " + control.hotel(userinfo)
					+ "\nselect your order or for exit select 9");

			break;

		case 3:
			System.out.println("Welcome to ssHydrabath !!!\nssHydrabath todays menu " + control.hotel(userinfo)
					+ "\nselect your order or for exit select 9");

			break;

		case 4:
			System.out.println("Welcome to Sangeethas !!!\nSangeetha's todays menu " + control.hotel(userinfo)
					+ "\nselect your order or for exit select 9");

			break;

		case 5:
			System.out.println("Welcome to Murugan Idly !!!\nMuruganIdly todays menu " + control.hotel(userinfo)
					+ "\nselect your order or for exit select 9");

			break;

		default:
			System.out.println("Please Choose Correct One ");
			foodDelivery();

		}
		read();

	}

	private void read() {
		userinfo.setNum(scanner.nextInt());
		userinfo.setCart(control.cart(userinfo));
		System.out.println(userinfo.getCart());
		System.out.println("Press n for add ");
		demos();
		final char input = scanner.next().charAt(0);
		if (input == 'n') {
			read();
		} else {
			System.out.println(control.display(userinfo));
		}

		final int userinput = scanner.nextInt();
		if (userinput == 9) {
			menu();
		}
		userinfo.setCart(control.cart(userinfo));
		System.out.println(userinfo.getCart());

	}

	private void instaMart() {
		System.out.println("1.fresh vegatebales , 2.fresh fruits , 3.Breads&Milks ,4.Masala, 5.biscut and cookies");
		final int input = scanner.nextInt();
		userinfo.setsnacks(input);
		switch (input) {
		case 1:
			System.out.println(
					"Fresh Vegatebales : " + control.products(userinfo) + "\nselect your order or for exit select 9");
			break;

		case 2:
			System.out.println(
					"Fresh Fruits : " + control.products(userinfo) + "\nselect your order or for exit select 9");
			break;

		case 3:
			System.out.println(
					"Breads and Milks : " + control.products(userinfo) + "\nselect your order or for exit select 9");
			break;

		case 4:
			System.out.println("Masala : " + control.products(userinfo) + "\nselect your order or for exit select 9");
			break;

		case 5:
			System.out.println(
					"Biscut and Cookies : " + control.products(userinfo) + "\nselect your order or for exit select 9");
			break;

		default:
			System.out.println("Please Choose Correct One or exit");

		}
		read();
	}

	private void display() {
		userinfo.setCart(control.cart(userinfo));
		System.out.println(userinfo.getCart());
		System.out.println(userinfo.getCart());
		final char input = scanner.next().charAt(0);
		if (input == 'n') {
			read();
		}
		demos();
		System.out.println(userinfo.getshow());
	}

	private void demos() {
		System.out.println("Which items do you want to add : ");
		userinfo.setfooditems(scanner.nextInt());
		userinfo.setitems(control.cart(userinfo));
		// System.out.println(eatables.getitems());
		demo.add(userinfo.getitems());
		System.out.println("Do you want to add more items Press 0 or Press any key .... ");
		final int input = scanner.nextInt();
		if (input == 0) {
			demos();
		}
		userinfo.setshow(demo);
	}

	private void menu() {
		System.out.println("Food delivery || Instamart");
		final int input = scanner.nextInt();
		
		switch (input) {
		case 1:
			foodDelivery();
			break;

	case 2:
			instaMart();
			break;

		default:
			System.out.println("select please...");
			menu();

		}
	}

	public static void main(String[] args) {
		UserView app = new UserView();
		//Scanner userinput = new Scanner(System.in);
		System.out.println("Delivering Happiness At Your Doorsteps !!!! ");
		app.createUser();
		System.out.println("Press 1 for Signup , Press 2 for Login , Press 3 for Exit");
		final int getinput = scanner.nextInt();

		switch (getinput) {
		case 1:
			app.check();
			app.signin();
			break;

		case 2:
			app.signin();
			break;

		case 3:
			System.out.println("Thank You ...");
			app.exit();
			break;

		default:
			System.out.println("Invalid choice try again");

		}

	}

}
