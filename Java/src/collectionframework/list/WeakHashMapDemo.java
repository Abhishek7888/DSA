package collectionframework.list;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {

		WeakHashMap<String, Image> imagecache = new WeakHashMap<>();
		imagecache.put(new String("Image1"), new Image("Image1"));
		imagecache.put(new String("Image2"), new Image("Image2"));

		System.out.println(imagecache);
		System.gc();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(imagecache);
	}

}

class Image {

	private String name;

	public Image(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Image [name=" + name + "]";
	}

}