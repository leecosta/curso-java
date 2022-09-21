package Secao13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ExFixacao {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date orderDate = new Date();
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus	status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(date, status, new Client(name, email, date));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: " + sdf2.format(orderDate));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + order.getClient().getName() + " (" + sdf.format(order.getMoment()) + ") - " + order.getClient().getEmail());
		System.out.println("Order items: ");
		for (OrderItem item : order.getItems()) {
			System.out.println(item.getProduct().getName() + ", $" + String.format("%.2f", item.getPrice()) + ", Quantity: " + item.getQuantity() + ", Subtotal: $" + String.format("%.2f", item.subTotal()));
		}
		System.out.println("Total price: $" + String.format("%.2f", order.total()));
		
		sc.close();

	}

}
