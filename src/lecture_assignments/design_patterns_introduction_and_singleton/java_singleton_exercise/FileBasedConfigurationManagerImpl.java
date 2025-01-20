package lecture_assignments.design_patterns_introduction_and_singleton.java_singleton_exercise;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
    private static FileBasedConfigurationManagerImpl obj;

    private FileBasedConfigurationManagerImpl() {
        super();
    }

    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = properties.getProperty(key);
        if (value != null) {
            return obj.convert(value, type);
        }
        return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        properties.setProperty(key, value.toString());
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
        properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        if (obj == null) {
            synchronized (FileBasedConfigurationManagerImpl.class) {
                if (obj == null) {
                    obj = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return obj;
    }

    public static void resetInstance() {
        obj = null;
    }

}