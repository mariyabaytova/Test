package Hooks;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class WebHooks {
    @BeforeClass
    public static void Testic1() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void Testic2() {
        System.out.println("AfterClass");
    }

}
