package ikinciHaftaOdev;

public class ProductManager {
	public void registarToCourse(Product product) {
		System.out.println(product.courseName +" : Kaydınız Gerçekleştirildi.");
	}
	
	public void deleteCourse(Product product) {
		System.out.println("Kursa kaydınız silindi : "+ product.courseName);
	}

}
