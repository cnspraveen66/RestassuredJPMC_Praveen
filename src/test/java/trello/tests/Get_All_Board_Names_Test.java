package trello.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import trello.common.BaseTest;
import trello.functions.GetBoardOofThisMember;

@Test
public class Get_All_Board_Names_Test extends BaseTest {
	public void testMyBoards()
	{
		List<String> boardnames = GetBoardOofThisMember.getBoardOofThisMember();
		System.out.println(boardnames);
		Assert.assertEquals(boardnames.size(), 2);
		//Assert.assertEquals(boardnames., 2);
		//Assert.fail();  // 
		//Assert.assertEquals(boardnames.size(), 3);
	}
}
