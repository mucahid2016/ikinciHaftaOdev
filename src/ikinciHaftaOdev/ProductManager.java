package ikinciHaftaOdev;

public class ProductManager {
	public void registarToCourse(Product product) {
		System.out.println(product.courseName +" : Kayd�n�z Ger�ekle�tirildi.");
	}
	
	public void deleteCourse(Product product) {
		System.out.println("Kursa kayd�n�z silindi : "+ product.courseName);
	}

}
