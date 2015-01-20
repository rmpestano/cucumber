package lham.projects.cucumber.infra;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppSettingsBeanUT {

	private static final String APP_LAYOUT = "/WEB-INF/templates/layout-app.xhtml";

	@Test
	public void testGetLayout() {
		AppSettingsBean bean = new AppSettingsBean();
		assertEquals("Teste do método getLayout() da classe AppSettingsBean.", APP_LAYOUT, bean.getLayout());
	}
}
