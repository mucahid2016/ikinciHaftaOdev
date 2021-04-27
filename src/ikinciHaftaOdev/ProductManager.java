package ikinciHaftaOdev;

public class ProductManager {
	public void registarToCourse(Product product) {
		System.out.println(product.courseName +" : Kaydýnýz Gerçekleþtirildi.");
	}
	
	public void deleteCourse(Product product) {
		System.out.println("Kursa kaydýnýz silindi : "+ product.courseName);
	}

}
