package com.xowrkz.methods.over_riding;

public class NewsPaper {
	private String name;
	private String language;
	private int since;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked Equals Method");
		if (obj == null) {
			System.out.println("Object has null value");
		}
		if (obj instanceof NewsPaper) {
			NewsPaper trial = (NewsPaper) obj;
			System.out.println("Conversion Completed");
			String storage = ((NewsPaper) obj).getName();
			if (this.name.equals(storage)) {
				System.out.println("Both are identical");
				return true;
			}
		}

		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

}
