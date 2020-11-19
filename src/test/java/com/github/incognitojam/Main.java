package com.github.incognitojam;

import com.dahua.SdkService;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));

        SdkService service = new SdkService().builder()
                .set("ip", "49.67.153.102")
                .set("port", 37777)
                .set("name", "admin")
                .set("password", "admin")
                .set("savePic", false) // 智能交通是否保存图片
                .set("dllPath", "./src/main/resources/libs/win32/") // 插件路径
                .set("logPath", "./logs")
                .build();

        service.start();
    }
}
