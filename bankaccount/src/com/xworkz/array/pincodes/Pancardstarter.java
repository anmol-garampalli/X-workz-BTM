package com.xworkz.array.pincodes;

public class Pancardstarter {

	public static void main(String[] args) {
		String pan1="CHZPG8318M";
		String pan3="CHZPG8318N";
		String pan4="CHZPG8318O";
		String pan6="CHZPG8318Q";
		String pan7="CHZPG8318R"; //pancard numbers
		String pan8="CHZPG8318S";
		
		String[] pancard= {pan1,"chzpg8319m",pan3,pan4,"chzph8318m",pan6,pan7,pan8,"dddd786","fff555"};
		for (int i = 0; i < pancard.length; i++) {
			System.out.println(i); //did not understand this too
			System.out.println(pancard);
			
		}
		for(String p: pancard) {
		
			System.out.println(p);//did not understand this 
	}

		//Vehicle details
		
		String bike="ka38w5620";
		String moped="ka38s4144";
		String car="ka38m2198"; //registration numbers
		String car2="ka01mr5421";
		String car3="ka56m0289";
		String bike2="ka38j7751";
		
		String[] vehiclenumbers= {bike,"ka38m6610",moped,car,car2,car3,bike2,"ka38m3205"};
		
		String index=vehiclenumbers[1];
		System.out.println(index);
		
		int app=001;
		int app1=002; //appversions
		int app2=003;
		int app3=004;
		int app4=005;
		int app5=006;
		
		int[] appstarter= {app,01001,app1,app2,app3,app4,app5,01002,01003,01004};
//		for(int x=0;x>appstarter;appstarter++)//error operator is undefined
//		{
//			System.out.println(appstarter);
//			
//		}
//		
		String ip1="192.168.0.0"; //ipaddress
		String ip10="192.168.0.1";
		String ip2="192.168.0.2";
		String ip3="192.168.0.3";
		String ip4="192.168.0.4";
		String ip5="192.168.0.5";
		String ip6="192.168.0.6";
		String ip7="192.168.0.7";
		String ip8="192.168.0.8";
		String ip9="192.168.0.9";
		
		String[] ipaddress= {ip1,ip2,ip3,ip4,ip5,ip6,ip7,ip8,ip9,ip10};
		
		for(int a=0;a<ipaddress.length;a++) {
			System.out.println(a);
			System.out.println(ipaddress);
		}
		
		
		
}
}
