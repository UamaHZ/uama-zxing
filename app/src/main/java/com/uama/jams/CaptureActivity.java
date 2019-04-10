package com.uama.jams;

import android.util.Log;

import com.google.zxing.Result;
import com.uama.zxing.CaptureBaseActivity;
import com.uama.zxing.OnScanResult;

public class CaptureActivity extends CaptureBaseActivity {
    @Override
    public OnScanResult getOnScanResult() {
        return new OnScanResult() {
            @Override
            public void scanSuccess(Result rawResult, String code) {
                Log.i("CaptureActivity",code);
            }
        };
    }
}
