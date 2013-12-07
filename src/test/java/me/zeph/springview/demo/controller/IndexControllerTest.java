package me.zeph.springview.demo.controller;

import me.zeph.springview.demo.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IndexControllerTest {

	private IndexController indexController;

	@Before
	public void setUp() throws Exception {
		indexController = new IndexController();
	}

	@Test
	public void shouldGoToIndexPage() {
		//when
		String viewName = indexController.view(null);

		//then
		assertThat(viewName, is("index"));
	}

	@Test
	public void shouldGoToConfirmationPage() {
		//given
		User user = new User();
		user.setName("benwei");
		ExtendedModelMap modelMap = new ExtendedModelMap();
		//when
		String viewName = indexController.commit(user, modelMap);
		//then
		assertThat(viewName, is("indexConfirm"));
		assertThat((String) modelMap.get("name"), is("benwei"));
	}
}