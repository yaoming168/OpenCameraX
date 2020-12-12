package net.sourceforge.opencamera.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class PhotoCamera2Tests {
    // Tests related to taking photos that require Camera2 - only need to run this suite with Camera2
    public static Test suite() {
        TestSuite suite = new TestSuite(MainTests.class.getName());
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoAutoFocusReleaseDuringPhoto"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoManualFocus"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoManualISOExposure"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoManualWB"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRaw"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRawWaitCaptureResult"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRawMulti"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRawOnly"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRawExpo"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRawExpoWaitCaptureResult"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRawOnlyExpo"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPreviewPausedTrashRaw"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPreviewPausedTrashRaw2"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoExpo5"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoHDRSaveExpoRaw"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoHDRSaveExpoRawOnly"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFocusBracketing"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFocusBracketingHeavy"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFocusBracketingCancel"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRawFocusBracketing"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRawOnlyFocusBracketing"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFastBurst"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoContinuousBurst"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoContinuousBurstSlow"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoNR"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFlashAutoFakeMode"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFlashOnFakeMode"));
        // do testTakePhotoRawRepeat last, and is an intensive test, and if it fails for any reason it seems to cause the following test to crash, terminating the run (at least on Nexus 6)!
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRawRepeat"));
        return suite;
    }
}
