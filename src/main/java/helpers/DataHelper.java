package helpers;

import org.openqa.selenium.JavascriptExecutor;

import java.io.File;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static com.utils.PropReader.readConfig;
import static com.utils.readers.XMLFileReader.getElementTextByTagName;

public class DataHelper {
    public static String getRandString(int vinLength) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        SecureRandom random = new SecureRandom();
        while (salt.length() < vinLength) {
            int index = (int) (random.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        return salt.toString();
    }
    public static String getRandArabicString(int vinLength) {
        String chars = "ابتثجحخدذرزسشصضطظعغفقكلمنهوي١٢٣٤٥٦٧٨٩٠";
        StringBuilder salt = new StringBuilder();
        SecureRandom random = new SecureRandom();
        while (salt.length() < vinLength) {
            int index = (int) (random.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        return salt.toString();
    }
    public static int getRandNumber(int number) {
        int randomNumber = (int) Math.floor(Math.random() * number);
        if (randomNumber == 0) {
            return 1;
        }
        return randomNumber;
    }
    public static String getTestData(String testKey) {
        String dataFile = readConfig("datafile");
        return getElementTextByTagName(dataFile, testKey);
    }

    public static String getTodaysDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return formatter.format(date);
    }

    public static String getSpecificDate(String d ) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = new Date(d);
        return formatter.format(date1);
    }

    public static String getRandomPhoneNUmber() {
        String chars = "1234567890";
        StringBuilder salt = new StringBuilder();
        SecureRandom random = new SecureRandom();
        while (salt.length() < 7) { // length of the random string.
            int index = (int) (random.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        return "0096279" + salt;
    }


}

