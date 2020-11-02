package com.PazarYeri.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

        //1-We created properties object
        private static Properties properties= new Properties();
        static {

            try {
                //2- we get the path and pass into file input stream
                FileInputStream file=new FileInputStream("configuration.properties");
                //3- we load the open file into properties object
                properties.load(file);

            } catch (IOException e) {
                System.out.println("Properties file not found");

            }
        }
        //4- we read from file: we will create a utility for reading


        public static String getProperties(String keyword){
            return properties.getProperty(keyword);

        }
        //5- close the file

    }
