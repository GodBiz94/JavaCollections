package com.pm;
import java.util.*;
import com.pm.model.*;
import com.pm.repository.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Number of products to enter:");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++){
		System.out.println("Enter product name:");
		String name = sc.next();
		System.out.println("Enter product id:");
		int id = sc.nextInt();
		System.out.println("Enter price:");
		int price = sc.nextInt();
		
		product.Model(name, id, price);
		}
		
		MemoryRepository repository = new MemoryRepository();
		
		
		
		
		repository.showData();
		sc.close();
	}

}
