package com.xworkz.snapdeal;

public class Runner {
	public static void main(String[] args) {
		Snapdeal snapdeal = new Snapdeal("Watch", 3000, 2, 3);
		System.out.println(snapdeal.getItemName() + " " + snapdeal.getPrice() + " " + snapdeal.getnoOfItems() + " "+ snapdeal.getReview());

		snapdeal.setItemName();
		snapdeal.setnoOfItems();
		snapdeal.setPrice();
		snapdeal.setReview();

		System.out.println(snapdeal.getItemName() + " " + snapdeal.getPrice() + " " + snapdeal.getnoOfItems() + " "+ snapdeal.getReview());
	}

}
