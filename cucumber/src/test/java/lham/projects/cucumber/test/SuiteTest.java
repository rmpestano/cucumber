package lham.projects.cucumber.test;

import lham.projects.cucumber.continente.ContinenteIT;
import lham.projects.cucumber.infra.AppSettingsBeanUT;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppSettingsBeanUT.class, ContinenteIT.class })
public class SuiteTest {

}
