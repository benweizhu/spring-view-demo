package me.zeph.springview.demo.controller;

import me.zeph.springview.demo.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.validation.BeanPropertyBindingResult;

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
		//when
		ExtendedModelMap model = new ExtendedModelMap();
		BeanPropertyBindingResult errors = new BeanPropertyBindingResult("name", "user");
		String viewName = indexController.commit(user, errors, model);
		//then
		assertThat(viewName, is("index-confirmation"));
		assertThat((String) model.get("name"), is("benwei"));
	}
}
