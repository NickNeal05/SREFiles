import java.io.IOException;

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
		SRE.getTitle();
	}
	
@Test
	public void columCntChk(){
		SRE.colCntChk();
	}
	
@Test
	public void rangeChk(){
		SRE.valueRangechk();
	}
	
@Test
	public void nullChk(){
		SRE.noNullchk();
	}
	
@After
	public void openPagw(){
		SRE.closeBrowser();
	}

	
	
}
