package stepDefinitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {
	
	@Before
	public void beforeHooks (Scenario scenario) {
		Logger.info("Scenario" + scenario.getName()+ "Started");
		browser(); 
		openBrowser(); 
		
	}
	
	@After
	public void afterHooks (Scenario scenario) {
		tearDown(); 
		Logger.info("Scenario" + scenario.getName()+ " " + scenario.getStatus());
		
	}
}
