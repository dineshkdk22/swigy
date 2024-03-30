package model;

import java.util.ArrayList;

public class UserModel {
	private long number;
	private int password;
	private int food;
	private String name;
	private int num;
	private int fooditems;
	private String items;
	private ArrayList<String> show;
	private int snacks;
	private String cart;
	private ArrayList<String> mart;

	public ArrayList<String> getshow() {
		return show;
	}
    
	public void setshow(ArrayList<String> show) {
		this.show = show;
	}

	public String getitems() {
		return items;
	}

	public void setitems(String items) {
		this.items = items;
	}

	public int getfooditems() {
		return fooditems;
	}

	public void setfooditems(int fooditems) {
		this.fooditems = fooditems;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCart() {
		return cart;
	}

	public ArrayList<String> getMart() {
		return mart;
	}

	public void setMart(ArrayList<String> mart) {
		this.mart = mart;
	}

	public void setCart(String cart) {
		this.cart = cart;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getfood() {
		return food;
	}

	public void setfood(int food) {
		this.food = food;
	}

	public int getsnacks() {
		return snacks;
	}

	public void setsnacks(int snacks) {
		this.snacks = snacks;
	}
}
