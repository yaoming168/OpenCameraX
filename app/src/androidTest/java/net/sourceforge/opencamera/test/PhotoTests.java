package net.sourceforge.opencamera.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class PhotoTests {
    // Tests related to taking photos; note that tests to do with photo mode that don't take photos are still part of MainTests
    public static Test suite() {
        TestSuite suite = new TestSuite(MainTests.class.getName());
        // put these tests first as they require various permissions be allowed, that can only be set by user action
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoSAF"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLocationOn"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLocationDirectionOn"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLocationOff"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testLocationOnSAF"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testDirectionOn"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testDirectionOnSAF"));
        }
        // then do memory intensive tests:
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoAutoLevel"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoAutoLevelLowMemory"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoAutoLevelAngles"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoAutoLevelAnglesLowMemory"));
        // other tests:
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhoto"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoContinuous"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoContinuousNoTouch"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoAutoStabilise"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFlashAuto"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFlashOn"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFlashTorch"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoAudioButton"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoNoAutofocus"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoNoThumbnail"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFlashBug"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFrontCameraAll"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFrontCamera"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFrontCameraMulti"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoFrontCameraScreenFlash"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoAutoFocus"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoLockedFocus"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoExposureCompensation"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoLockedLandscape"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoLockedPortrait"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPreviewPaused"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPreviewPausedAudioButton"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPreviewPausedSAF"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPreviewPausedTrash"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPreviewPausedTrashSAF"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPreviewPausedTrash2"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoQuickFocus"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRepeatFocus"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRepeatFocusLocked"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoAfterFocus"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoSingleTap"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoDoubleTap"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoAlt"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTimerBackground"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTimerSettings"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTimerPopup"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoRepeat"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testContinuousPicture1"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testContinuousPicture2"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testContinuousPictureFocusRepeat"));
        if( CameraXActivityTest.test_camera2 ) {
            // test_wait_capture_result only relevant for Camera2 API
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testContinuousPictureFocusRepeatWaitCaptureResult"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testKeyboardControls"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testPhotoStamp"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testPhotoStampSAF"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoDRO"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoDROPhotoStamp"));
        }
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoHDR"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testPhotoBackgroundHDR"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoHDRSaveExpo"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoHDRFrontCamera"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoHDRAutoStabilise"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoHDRPhotoStamp"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoExpo"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPanorama"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPanoramaMax"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPanoramaCancel"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPanoramaCancelBySettings"));
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testCreateSaveFolder1"));
        if( !CameraXActivityTest.test_camera2 ) {
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testCreateSaveFolder2"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testCreateSaveFolder3"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testCreateSaveFolder4"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testCreateSaveFolderUnicode"));
            suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testCreateSaveFolderEmpty"));
        }
        // testTakePhotoPreviewPausedShare should be last, as sharing the image may sometimes cause later tests to hang
        suite.addTest(TestSuite.createTest(CameraXActivityTest.class, "testTakePhotoPreviewPausedShare"));
        return suite;
    }
}
