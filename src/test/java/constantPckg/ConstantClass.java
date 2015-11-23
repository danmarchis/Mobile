package constantPckg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

public final class ConstantClass {
	public static final String PM_NAME = "emilian.melian1";
	public static final String PM_PW = "Allthe+best25";
	
	public static final String DM_NAME = "ioanahoaghia1";
	public static final String DM_PW = "parola.12";
	
	public static final String TESTER_NAME = "dan.marchis1";
	public static final String TESTER_PW = "barosanu";
	
	public static final String ENV_URL = "http://172.22.4.88:9090";
	public static final String BASE_URL = ENV_URL + "/vacation";
	public static final String MOBILE_DEPARTAMENT = "Mobile";
	public static final String QA_DEPARTAMENT = "QA";
	public static final String FIVE = "5";
	public static final String TEN = "10";
	public static final String TWENTY = "20";
	public static final String THIRTY = "30";
	public static final String SEVENTYFIVE = "75";
	
	public static final String STATUS_COLUMN = "status";
	public static final String EMPLOYEE_NAME = "Employee name";
	public static final String START_DATE = "Start Date ";
	public static final String END_DATE = "End Date";
	public static final String TYPE = "Type";
	
	public static final String DATE_START = "17/Nov/2015"; 
	public static final String DATE_FINAL="31/Dec/2015";

	//public static final List<String> LISTA=Collections.unmodifiableList(Arrays.asList("ss"));
		//public static final String[] STATUS_LIST={"aa","bb"};
	//	public static final ImmutableList<String> STATUS=ImmutableList.of("dsdsd","dsds");
		public static final List OFFICIAL_STATUS_LIST=(List) Collections.unmodifiableList(Arrays.asList("Rejected", "Approved", "Cancelled", "Withdrawn", "Pending"));
}
