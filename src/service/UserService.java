package service;

import model.UserModel;
import java.util.ArrayList;

public interface UserService {
	long number(final UserModel m);

	int pass(final UserModel n);

	String cart(final UserModel c);

	ArrayList<String> hotel(final UserModel food);

	ArrayList<String> display(final UserModel dish);

	ArrayList<String> products(final UserModel snacks);

	
}
