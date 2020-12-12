package net.sourceforge.opencamera.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class VideoTests {
    // Tests related to video recording; note that tests to do with video mode that don't record are still part of MainTests
    public static Test suite() {
        TestSuite suite = new TestSuite(MainTests.class.getName());
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideo"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoAudioControl"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoSAF"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoSubtitles"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoSubtitlesSAF"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoSubtitlesGPS"));
        }

        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testIntentVideo"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testIntentVideoDurationLimit"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testImmersiveMode"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testImmersiveModeEverything"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoStabilization"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoExposureLock"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoFocusArea"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoQuick"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoQuickSAF"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoMaxDuration"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoMaxDurationRestart"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoMaxDurationRestartInterrupt"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoSettings"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoMacro"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoPause"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoPauseStop"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoSnapshot"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoSnapshotTimer"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoSnapshotPausePreview"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoSnapshotMax"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoFlashVideo"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testVideoTimerInterrupt"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testVideoPopup"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testVideoTimerPopup"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoAvailableMemory"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoAvailableMemory2"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoMaxFileSize1"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoMaxFileSize2"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoMaxFileSize3"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoMaxFileSize4"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoMaxFileSize4SAF"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoTimeLapse"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoForceFailure"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoForceFailureSAF"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoForceIOException"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoForceCameraControllerException"));
        if( CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testVideoLogProfile"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testVideoJTLogProfile"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testVideoGammaProfile"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testVideoEdgeModeNoiseReductionMode"));
        }
        // put tests which change bitrate, fps or test 4K at end
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoFPS"));
        if( CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoFPSHighSpeedManual"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakeVideoSlowMotion"));
        }
        // update: now deprecating these tests, as setting these settings can be dodgy on some devices
        /*suite.addTest(TestSuite.createTest(MainActivityTest.class, "testTakeVideoBitrate"));
        suite.addTest(TestSuite.createTest(MainActivityTest.class, "testTakeVideo4K"));*/

        // tests for video log profile (but these don't actually record video)
        if( CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLogProfile1"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLogProfile2"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLogProfile3"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLogProfile1_extra_strong"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLogProfile2_extra_strong"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLogProfile3_extra_strong"));
        }
        return suite;
    }
}
