import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Junit {

	SREwebdriverScript SRE = new SREwebdriverScript();
	
	@Before
	public void openPage(){
		SRE.open();
		
	}
	
@Test
	public void titleChk() throws IOException{
	String title=SRE.getTitle();
	assertEquals(title,
            "Self-Eval Table");
	}
	
@Test
	public void columCntChk(){
	int colCount=9;
	int actualColcount=SRE.colCntChk();
		assertEquals(colCount,
				actualColcount);
		}
	
@Test
	public void rangeChk(){
	boolean isInRange=SRE.valueRangechk();
	//some values are out of range so expected assert is false
	assertEquals(false,
			isInRange);
	}
	
@Test
	public void nullChk(){
		boolean isNull=SRE.noNullchk();
		assertEquals(true,
				isNull);
			
	}
	
@After
	public void closePage(){
		SRE.closeBrowser();
	}

	
	
}
