package gu;
import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		String productName1 = p1.getProductName();
		String productName2 = p2.getProductName();
		
		return productName1.compareToIgnoreCase(productName2);
	}
	
}
