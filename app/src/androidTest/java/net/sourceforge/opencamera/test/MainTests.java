package net.sourceforge.opencamera.test;

import android.os.Build;

import junit.framework.Test;
import junit.framework.TestSuite;

public class MainTests {
    // Tests that don't fit into another of the Test suites
    public static Test suite() {
        /*return new TestSuiteBuilder(AllTests.class)
        .includeAllPackagesUnderHere()
        .build();*/
        TestSuite suite = new TestSuite(MainTests.class.getName());
        // put these tests first as they require various permissions be allowed, that can only be set by user action
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSwitchVideo"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLocationSettings"));
        // other tests:
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testScopedStorageChecks1"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testScopedStorageChecks2"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testScopedStorageChecks3"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testScopedStorageChecks4"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testPause"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testImmediatelyQuit"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testStartCameraPreviewCount"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testCamera2PrefUpgrade"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSaveModes"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFlashVideoMode"));
            //suite.addTest(TestSuite.createTest(MainActivityTest.class, "testSaveFlashTorchSwitchCamera"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFlashStartup"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFlashStartup2"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testHDRRestart"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testPreviewSize"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testPreviewSizeWYSIWYG"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testResolutionMaxMP"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testResolutionBurst"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAutoFocus"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAutoFocusCorners"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testPopup"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testPopupLeftLayout"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testRightLayout"));
        //suite.addTest(TestSuite.createTest(MainActivityTest.class, "testPopupLayout")); // don't autotest for now, see comments for the test
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSwitchResolution"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFaceDetection"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFocusFlashAvailability"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFocusSwitchVideoSwitchCameras"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFocusRemainMacroSwitchCamera"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFocusRemainMacroSwitchPhoto"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFocusSaveMacroSwitchPhoto"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFocusSwitchVideoResetContinuous"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testContinuousPictureFocus"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testContinuousPictureRepeatTouch"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testContinuousPictureSwitchAuto"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testContinuousVideoFocusForPhoto"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testStartupAutoFocus"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSaveQuality"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testZoom"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testZoomIdle"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testZoomSwitchCamera"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSwitchCameraIdle"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSwitchCameraRepeat"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTouchFocusQuick"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testGallery"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSettings"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSettingsSaveLoad"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFolderChooserNew"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFolderChooserInvalid"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSaveFolderHistory"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSaveFolderHistorySAF"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSettingsPrivacyPolicy"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testPreviewRotation"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLayoutNoLimits"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLayoutNoLimitsStartup"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testCameraModes"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testFailOpenCamera"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testAudioControlIcon"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testIconsAgainstCameras"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testOnError"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testGPSString"));
        }
        if( CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testPreviewBitmap"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testVideoFPSHighSpeed"));
        }
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.O ) {
            // intensive test, can crash when run as suite on older devices (Nexus 6, Nexus 7) with Camera2 at least
            // also run this test last, just in case
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testSwitchCameraRepeat2"));
        }
        return suite;
    }
}
