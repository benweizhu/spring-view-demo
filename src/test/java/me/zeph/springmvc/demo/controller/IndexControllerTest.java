package me.zeph.springmvc.demo.controller;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IndexControllerTest {

	@Test
	public void shouldGoToIndexPage() {
		//given
		IndexController indexController = new IndexController();

		//when
		String viewName = indexController.view();

		//then
		assertThat(viewName, is("index"));
	}
}
