package helpers;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

    public class ConfigReader {

        private ConfigReader() {
        }
        public static String readConfig(String key, String filePath) {
            File file = new File(filePath);
            return getPropValue(key, file);
        }
        @NotNull
        private static String getPropValue(String key, File file) {
            Properties properties = new Properties();
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                properties.load(bufferedReader);
            } catch (FileNotFoundException var5) {
                var5.printStackTrace();
            } catch (Exception var6) {
                throw new RuntimeException(var6);
            }
            return properties.getProperty(key);
        }

    }

