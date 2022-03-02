package com.t1.uuid;
import java.util.UUID;

public class DemoUUID  {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println("UUID=" + uuid.toString() );
    }
}
