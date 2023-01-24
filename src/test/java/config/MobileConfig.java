package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE) // объединяем в один config  параметры из разных properties
@Config.Sources({"classpath:config/${deviceEmulate}.properties",
         "classpath:config/emulation.properties"
})

public interface MobileConfig extends Config {

    @Key("deviceName")
    String deviceName();

    @Key("platformName")
    @DefaultValue("android")
    String platformName();

    @Key("platformVersion")
    String platformVersion();

    @Key("App")
    String App();

    @Key("email")
    String Email();
    @Key("password")
    String Passord();

}
