import java.io.IOException;


public class SREmethodsAbstracted {

	public static void main(String[] args) throws IOException {
		SREwebdriverScript SRE = new SREwebdriverScript();
		SRE.open();
		SRE.getTitle();
		SRE.rowCntChk();
		SRE.valueRangechk();
		SRE.noNullchk();
		SRE.closeBrowser();

	}

}
