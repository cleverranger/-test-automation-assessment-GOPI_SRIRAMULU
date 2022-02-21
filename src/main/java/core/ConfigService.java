package core;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConfigService {

    private static Config singleInstance;

    private ConfigService(){

    }

    public static Config getInstance(){
        if (singleInstance == null){
            ObjectMapper objectMapper = new ObjectMapper();
            final String configFilePath = System.getProperty("user.dir") + "/src/test/resources/config.json";
            File configFile = new File(configFilePath);
            try{
                singleInstance = objectMapper.readValue(configFile, Config.class);
            }catch (IOException e){
                throw new RuntimeException("Exception while reading Config file " + configFilePath, e);
            }
        }
        return singleInstance;
    }
}