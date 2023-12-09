package org.example.properties;

import java.io.InputStream;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;

public class PropertyReader {
    public static String getConnectionUrlForPostgres() {
        return Objects.requireNonNull(getProperties())
                .map(properties -> properties.getProperty("hibernate.connection.url")).orElse(null);
    }

    public static String getUserForPostgres() {
        return Objects.requireNonNull(getProperties())
                .map(properties -> properties.getProperty("hibernate.connection.username")).orElse(null);
    }

    public static String getPasswordForPostgres() {
        return Objects.requireNonNull(getProperties())
                .map(properties -> properties.getProperty("hibernate.connection.password")).orElse(null);
    }


    public static Optional<Properties> getProperties() {
        try (InputStream inputStream = PropertyReader.class.getClassLoader().getResourceAsStream("hibernate.properties")) {
            Properties properties = new Properties();

            if (inputStream == null) {
                return null;
            }

            properties.load(inputStream);
            return Optional.of(properties);
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
