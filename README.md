# DvlpUmen
友盟推送集成测试


如果使用本demo测试，替换成自己的即可使用

[
 // 在此处调用基础组件包提供的初始化函数 相应信息可在应用管理 -> 应用信息 中找到 http://message.umeng.com/list/apps
 
        // 参数一：当前上下文context；
        // 参数二：应用申请的Appkey（需替换）；
        // 参数三：渠道名称；
        // 参数四：设备类型，必须参数，传参数为UMConfigure.DEVICE_TYPE_PHONE则表示手机；传参数为UMConfigure.DEVICE_TYPE_BOX则表示盒子；默认为手机；
        // 参数五：Push推送业务的secret 填充Umeng Message Secret对应信息（需替换）
        UMConfigure.init(this, "5c21e3dab465f522600000c7", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, "0eddd469409ec18e15deeae58d214a82");
]
