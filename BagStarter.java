package com.xworkz.dp.dto;

public class BagStarter {

	public static void main(String[] args) {
		BagDTO bagDTO = new agDTO();
		BagDTO.getbagName("Jordan");
		BagDTO.getbagBrand("Nike");
		BagDTO.getprice(12555);
		BagDTO.getstorageCapacity(15);
		BagDTO.getvendorName("Gomtesh");
		BagDTO.getcountryOfOrigin("Nepal");

		BagDTO BagDTO02 = new BagDTO("OneX", "Puma", 1255, 15, "Shivsai", "India");
		BagDTO BagDTO03 = new BagDTO("wiki", "Wildcraft", 100, 15, "Abhijeet", "India");
		BagDTO BagDTO04 = new BagDTO("Surge", "Sequoia", 1205, 05, "Shivsai", "India");
		BagDTO BagDTO05 = new BagDTO("Aurora", "Runaway", 155, 10, "Shivsai", "India");

		BagDTO[] array = new BagDTO[6];
		array[0] = BagDTO;
		array[1] = BagDTO02;
		array[2] = BagDTO03;
		array[3] = BagDTO04;
		array[4] = BagDTO05;

		for (int test = 0; test < array.length; test++) {
			
			BagDTO  ref = array[test];
			
			if (ref!=null) {
			
			System.out.println(getbagname());
			System.out.println(getbagBrand());
			System.out.println(getbagPrice());
			System.out.println(getstorageCapacity());
			System.out.println(getvendorName());
			System.out.println(getcountryOfOrigin());
			
			}
			else {
				System.err.println("array is filled");
			}
		}

	}

}
