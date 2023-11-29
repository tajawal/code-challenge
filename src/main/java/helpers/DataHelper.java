package helpers;


import java.text.SimpleDateFormat;

import java.util.Date;

import static com.utils.PropReader.readConfig;
import static com.utils.readers.XMLFileReader.getElementTextByTagName;

public class DataHelper {

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



}

