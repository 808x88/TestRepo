package config;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import testApp.model.InputProperties;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainConfig {
    // properties should be configured outside of code but dont worry about that for now
    private static String PROPERTIES_FILE_LOCATION = "/tmp/test.properties";
    private InputProperties inputProperties;
    private Gson gson = new Gson();

    public MainConfig() {
        initializeInputProperties();
    }

    public InputProperties getInputProperties() {
        return inputProperties;
    }

    private void initializeInputProperties() {
        String propertiesFileContents = getPropertiesFileContents();
        inputProperties = gson.fromJson(propertiesFileContents, InputProperties.class);
    }

    private String getPropertiesFileContents() {
        String propertiesFileContents = null;
        try {
            FileUtils util = new FileUtils();
            propertiesFileContents = FileUtils.readFileToString(new File(PROPERTIES_FILE_LOCATION), StandardCharsets.UTF_8);
            System.out.println(propertiesFileContents);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertiesFileContents;
    }
}
