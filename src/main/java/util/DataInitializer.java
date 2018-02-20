package util;

import java.io.*;
import java.util.Properties;

public class DataInitializer {
    String confFilePath=  System.getProperty("user.dir")+"\\src\\main\\data\\";

    public void setEnvValues() throws IOException {
        Properties dataProperties = new Properties();
        Constants.CONF_FILE_PATH = confFilePath;
        String dataFileName = "env_data.conf";
        InputStream inputStream = new BufferedInputStream(new FileInputStream(confFilePath+dataFileName));
        dataProperties.load(inputStream);
        Constants.APP_PATH  = dataProperties.getProperty("app_path").replaceAll("\"","");;
    }
}
