package collectionframework.list;

import java.lang.ref.WeakReference;

public class GC {

	public static void main(String[] args) {

		WeakReference<Phone> weakReference = new WeakReference<Phone>(new Phone("Apple", "16 pro max"));

		System.out.println(weakReference.get());
		
		System.gc();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(weakReference.get());
	}

}

class Phone {

	private String brand;
	private String model;

	public Phone(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + "]";
	}



}