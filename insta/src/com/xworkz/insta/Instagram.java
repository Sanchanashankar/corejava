package com.xworkz.insta;

public class Instagram {
	String userName;
	String pageName;
	String edit;
	boolean block;
	String post;
	String fname = "vilas";
	String lname = " hiranni";

	public Instagram(String userName, String pageName, String edit, boolean block, String post, String fname,String lname) {
		this.userName = userName;
		this.pageName = pageName;
		this.edit = edit;
		this.block = block;
		this.post = post;
		this.fname = fname;
		this.lname = lname;

	}

	public static void main(String args[]) {
		Instagram insta = new Instagram("Xworkz", "Xworkz", "photo", true, "photos", "Sanchana", "Hiranni");
		System.out.println("number of letters used " + insta.userName.length());
		System.out.println("upper case" + insta.userName.toUpperCase());
		System.out.println("lower case" + insta.userName.toLowerCase());
		System.out.println("index location" + insta.userName.indexOf("outerring"));
		System.out.println("name" + insta.fname.concat(insta.lname));
		System.out.println();
		System.out.println("fname" + insta.fname.hashCode());
		System.out.println("lname" + insta.lname.hashCode());

	}

}
