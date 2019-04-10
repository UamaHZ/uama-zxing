package com.uama.zxing;

import com.google.zxing.Result;

public interface OnScanResult {
    void scanSuccess(Result rawResult,String code);
}
