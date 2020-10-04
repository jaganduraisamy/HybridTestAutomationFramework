package StepDef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	@Before
	public void InitializeTest(){
		System.out.println(" ------ Before annotation. -------");
	}
	
	@After
	public void TearDownTest(Scenario scenario){
		
		System.out.println(" ------ After annotation. -------");
	}
}
