package com.xowrkz.methods.over_riding;

import javax.lang.model.element.NestingKind;

public class NewsPaperReading {

	public static void main(String[] args) {

		NewsPaper newsPaper = new NewsPaper();
		NewsPaper newsPaper2 = new NewsPaper();

		System.out.println(newsPaper.setName("HINDU"));
		System.out.println(newsPaper2.setName("HINDU"));
		System.out.println(newsPaper.equals(newsPaper2));

	}

}
