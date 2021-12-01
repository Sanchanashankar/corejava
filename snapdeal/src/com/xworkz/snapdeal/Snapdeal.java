package com.xworkz.snapdeal;

public class Snapdeal {
	private String itemName;
	private int Price;
	private int noOfItems;
	int review[] = new int[5];

	public Snapdeal(String itemName, int Price, int noOfItems, int review) {
		this.itemName = itemName;
		this.Price = Price;
		this.noOfItems = noOfItems;
		this.review[0] = 1;
		this.review[1] = 2;
		this.review[2] = 3;
		this.review[3] = 4;
		this.review[4] = 5;
	}

	public String getItemName() {
		return itemName;
	}

	public int getPrice() {
		return Price;

	}

	public int getnoOfItems() {
		return noOfItems;
	}

	public int getReview() {
		return review[3];
	}

	public void setItemName() {
		this.itemName = itemName;
	}

	public void setPrice() {
		this.Price = Price;
	}

	public void setnoOfItems() {
		this.noOfItems = noOfItems;
	}
	public void setReview() {
		this.review=review;
	}
}
