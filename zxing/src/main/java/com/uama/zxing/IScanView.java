package com.uama.zxing;

import android.view.View;
import android.widget.ImageView;

/**
 * 扫码能力提供者
 */
public interface IScanView {
    int getLayoutId();

    View getAlbumView();

    View getBackView();

    ImageView getTorchIcon();

    OnScanResult getOnScanResult();

    boolean continueScan();
}
