package com.maventest.ant.AntCamp.test;

import android.test.ActivityInstrumentationTestCase2;
import com.maventest.ant.AntCamp.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

	private HelloAndroidActivity mActivity;
	
    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    @Override
 	protected void setUp() throws Exception {
 		super.setUp();

 		setActivityInitialTouchMode(false);
 		mActivity = getActivity();
 	} // end of setUp() method definition
    
    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
    
    public void testActivity2() {
    	HelloAndroidActivity activity = getActivity();
        assertNull(null);
    }
    
    public void testEmma()
    {
    	EmmaObject object = new EmmaObject(2, 2);
//    	assertEquals(4, object.add());
    }
    
    public void testJunitPlugin()
    {
    	//Test
    	assertNull(null);
    }
    
    
}


