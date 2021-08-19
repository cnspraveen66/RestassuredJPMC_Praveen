package trello.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import trello.common.BaseTest;
import trello.functions.CreateBoard;

@Test
public class POST_CreateBoard_Test extends BaseTest{
	public void testCreateBoard()
	{
		int status = CreateBoard.createNewBoard("Selenium MobileAutomation Board");
		Assert.assertEquals(status, 200);
		System.out.println(status);
	}

}
