package ru.breev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main(String[] args) {
//        CameraImpl camera = new CameraImpl();
//        CameraRoll cameraRoll = new ColorCameraRoll();
//        camera.setCameraRoll(cameraRoll);
//        camera.doPhotograph();

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        CameraImpl camera = context.getBean("camera", CameraImpl.class);
        camera.doPhotograph();

    }
}
