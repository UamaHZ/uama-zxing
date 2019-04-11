package com.uama.zxing;

import android.view.View;
import android.widget.ImageView;

/**
 * 扫码能力提供者
 */
public interface IScanView {
    //重新设置扫码页面布局：注意，如果此处layout更换，同时想实现闪光灯，相册扫码，title返回的话，必须要重新设置对应布局
    int getLayoutId();
    //相册view：自定义扫码界面时，需要重新设置
    View getAlbumView();
    //返回view：自定义扫码界面时，需要重新设置
    View getBackView();
    //闪光灯view：自定义扫码界面时，需要重新设置
    ImageView getTorchIcon();
    //扫码结果：如果扫码成功处理完后，想继续扫描请调用restartPreviewAfterDelay()方法
    OnScanResult getOnScanResult();
    //是否每次扫码成功后，自动扫描，默认false
    boolean continueScan();
}
