package net.sourceforge.opencamera.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AvgTests {
    /** Tests for Avg algorithm - only need to run on a single device
     *  Should manually look over the images dumped onto DCIM/
     *  To use these tests, the testdata/ subfolder should be manually copied to the test device in the DCIM/testOpenCamera/
     *  folder (so you have DCIM/testOpenCamera/testdata/). We don't use assets/ as we'd end up with huge APK sizes which takes
     *  time to transfer to the device every time we run the tests.
     */
    public static Test suite() {
        TestSuite suite = new TestSuite(MainTests.class.getName());
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg1"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg2"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg3"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg4"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg5"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg6"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg7"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg8"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg9"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg10"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg11"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg12"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg13"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg14"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg15"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg16"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg17"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg18"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg19"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg20"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg21"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg22"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg23"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg24"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg25"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg26"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg27"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg28"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg29"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg30"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg31"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg32"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg33"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg34"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg35"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg36"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg37"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg38"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg39"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg40"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg41"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg42"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg43"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg44"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg45"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg46"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg47"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg48"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg49"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg50"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg51"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAvg52"));
        return suite;
    }
}
