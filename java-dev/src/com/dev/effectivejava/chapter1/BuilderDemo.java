package com.dev.effectivejava.chapter1;

public class BuilderDemo {
	
	private final String name;
	private final int rollNo;
	private final String telephone;
	private final String address;
	
	public static class Builder {
		//Mandatory Field
		private String name;
		private int rollNo;
		//Optional Field
		private String telephone = "9035625024";
		private String address = "Bangalore";
		
		public Builder(String name, int rollNo) {
			this.name = name;
			this.rollNo = rollNo;
		}
		
		public Builder addTelephone(String telephone) {
			this.telephone = telephone;
			return this;
		}
		
		public Builder addAddress(String address) {
			this.address = address;
			return this;
		}
		
		public BuilderDemo build() {
			return new BuilderDemo(this);
		}
		
	}
	
	private BuilderDemo(Builder builder) {
		name = builder.name;
		rollNo = builder.rollNo;
		telephone = builder.telephone;
		address = builder.address;
		
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getTelephone() {
		return this.telephone;
	}
	
	public static void main(String args[]) {
		BuilderDemo builderDemo = new Builder("Ritesh", 1).addAddress("Sasaram").build();
		System.out.println("address : "+builderDemo.getAddress());
		System.out.println("telephone: "+builderDemo.getTelephone());
	}

}
