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

	//public static final List<String> LISTA=Collections.unmodifiableList(Arrays.asList("ss"));
		//public static final String[] STATUS_LIST={"aa","bb"};
		public static final ImmutableList<String> STATUS=ImmutableList.of("dsdsd","dsds");
		public static final List LISTA=(List) Collections.unmodifiableList(Arrays.asList("Rejected", "Approved", "Cancelled", "Withdrawn", "Pending"));
}
