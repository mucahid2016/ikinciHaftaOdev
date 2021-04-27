package ikinciHaftaOdev;

public class Main {

	public static void main(String[] args) {
		Product product1 = new  Product(1, "C# + Angular","Engin Demiro�",20 );
		Product product2 = new Product(2,"Java + React","Engin Demiro�",32);

		Product[] products = { product1, product2};
		
		for (Product product : products) {
			System.out.println("Kursun ad� : " + product.courseName);
			System.out.println("Kursun numaras� : " + product.courseName);
			System.out.println("--------***********---------");
		}
		ProductManager productManager = new ProductManager();
		productManager.registarToCourse(product1);
		productManager.registarToCourse(product2);
		productManager.deleteCourse(product1);
		productManager.deleteCourse(product2);
		
		System.out.println("*****");
		
		Category category1 = new Category();
		category1.categoryId = 101;
		category1.categoryName = "Kurslar�m";
		
		Category category2 = new Category();
		category2.categoryId = 102;
		category2.categoryName = "S�k sorulan sorular";
		
		System.out.println(category2.categoryId);
		System.out.println(category1.categoryName);

	}

}
