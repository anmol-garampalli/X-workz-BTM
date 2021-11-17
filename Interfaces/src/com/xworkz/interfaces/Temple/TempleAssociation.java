package com.xworkz.interfaces.Temple;

public class TempleAssociation {
	
	private DevoteeRules devoteerules;
	private String name;

	public TempleAssociation() {
		System.out.println("Invoked No Argument Constructor");
	}

	public TempleAssociation(DevoteeRules devoteerules, String name) {
		super();
		this.devoteerules = devoteerules;
		this.name = name;
	}

public void allowDevotees() {
	System.out.println("Invoked allow Devotees method in Temple Association");
	if (devoteerules!= null) {
		System.out.println(" You have passed the right rules");
		boolean SlipperRules=devoteerules.noSlippers();
		if (SlipperRules ) {
			System.out.println("Implementing the next rule");
			boolean photography = devoteerules.noPhotography();
			boolean silence=devoteerules.maintainSilence();
			if (photography && silence) {
				System.out.println("You are Starboy");
			}
		}
		else {
			System.err.println("Please remove Slippers and be a good devotee");
		}
		
		
	}
	else {
		System.out.println("Please pass the rules");
		
	}
}

}
