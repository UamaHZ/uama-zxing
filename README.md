# uama-zxing

[![](https://www.jitpack.io/v/UamaHZ/uama-zxing.svg)](https://www.jitpack.io/#UamaHZ/uama-zxing)

这是什么？**基于Zxing的二维码扫描，更加简单，快速，便捷，可自定义界面等**

如何使用？

引入远程库：

1. 继承CaptureBaseActivity用于扫一扫界面；

2. 选择实现接口中的相关功能

   ```java
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
   ```

   **注意：getLayoutId(),getAlbumView(),getBackView(),getTorchIcon()是一组关联属性，如果要替换时，请全量替换**

3. `getOnScanResult() `用于书写回调结果：如果二维码处理完后不关闭页面继续扫描请调用`CaptureBaseActivity`中的`restartPreviewAfterDelay`