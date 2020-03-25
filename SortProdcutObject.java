package gu;
import java.util.Arrays;

public class SortProdcutObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] product = new Product[3];
		product[0] = new Product("a", 11);
		product[1] = new Product("z", 13);
		product[2] = new Product("x", 10);
		
		System.out.println("[compareTo sort productNum");
		Arrays.sort(product);
		printProduct(product);
		
		System.out.println("[compareTo sort productName");
		Arrays.sort(product, new ProductNameComparator());
		printProduct(product);
	}
		public static void printProduct(Product[] product) {
			for(Product i : product) {
				System.out.println(i);
			}
		}
}
