package com.javaex.oop.goods.v4;

public class GoodsApp {

		public static void main(String[] args){
			
//			Goods notebook = new Goods();
//			notebook.name ="Dell XPS";
//			notebook.price = 2000000;
//			notebook.setName("Dell XPS");
//			notebook.setPrice(200000);
			Goods notebook = new Goods("Dell XPS", 2000000);

//			Goods camera = new Goods();
//			camera.name = "Nikon";
//			camera.price = 700000;
//			camera.setName("Nikon");
//			camera.setPrice(700000);
//			
			
			Goods camera = new Goods("Nikon", 700000);
//			System.out.printf("%s, %d��%n",
//								notebook.name,
//								notebook.price);
			
			System.out.printf("%s, %d��%n",
					notebook.getName(),
					notebook.getPrice());
					notebook.showInfo();
			
//			System.out.printf("%s, %d��",
//					camera.name,
//					camera.price);
//			
			System.out.printf("%s, %d��%n",
					camera.getName(),
					camera.getPrice());
					camera.showInfo();
					
					//camera.setPrice(10);
			
		
		}
}
