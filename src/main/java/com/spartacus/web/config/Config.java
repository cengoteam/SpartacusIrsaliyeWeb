package com.spartacus.web.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Config {
    public static String DB_URL;
    public static String DB_USERNAME;
    public static String DB_PASSWORD;
    public static String USERNAME_SOFTNET;
    public static String PASSWORD_SOFTNET;
    public static String SEND_PATH;
    public static String RECV_PATH;

    private static final String configFilePath = "config.properties";
    public static void initConfig(){
        try {
            FileInputStream fis  = new FileInputStream(configFilePath);
            Properties prop = new Properties();
            prop.load(new InputStreamReader(fis, StandardCharsets.UTF_8));
            DB_URL = prop.getProperty("URL");
            DB_USERNAME = prop.getProperty("USERNAME");
            DB_PASSWORD = prop.getProperty("PASSWORD");
            USERNAME_SOFTNET = prop.getProperty("USERNAME_SOFTNET");
            PASSWORD_SOFTNET  = prop.getProperty("PASSWORD_SOFTNET");
            SEND_PATH = prop.getProperty("SEND_PATH");
            RECV_PATH =  prop.getProperty("RECV_PATH");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
