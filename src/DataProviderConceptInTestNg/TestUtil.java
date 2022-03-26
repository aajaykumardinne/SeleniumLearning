package DataProviderConceptInTestNg;


import java.util.ArrayList;
import com.excel.utility.Xls_Reader;

public class TestUtil {

	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("C:\\Users\\dinne\\OneDrive\\Desktop\\EbayTest.xlsx");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum=2 ; rowNum<= reader.getRowCount("RegTestData"); rowNum++) {
			
			String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
			String lastName = reader.getCellData("RegTestData", "lastname", rowNum);
			String email = reader.getCellData("RegTestData", "email", rowNum);
			
			Object obj[] = {firstName, lastName, email};
			myData.add(obj);
			
			}
		
		return myData;

	}

}
