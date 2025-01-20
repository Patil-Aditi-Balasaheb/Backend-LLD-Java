package lecture_assignments.design_patterns_introduction_and_singleton.singleton_log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import org.springframework.boot.logging.LogLevel;

public class LoggerImpl implements Logger {
    private static LoggerImpl instance;
    private PrintWriter writer;
    private String logFilePath;

    private LoggerImpl() {
        super();
    }

    public static LoggerImpl getInstance() {
        if (instance == null) {
            synchronized (LoggerImpl.class) {
                if (instance == null) {
                    instance = new LoggerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

    @Override
    public void log(LogLevel level, String message) {
        if (writer == null) {
            throw new IllegalStateException("Logger is not initialized in setLogFile()");
        }

        if (logFilePath != null) {
            String log = LocalDateTime.now() + " " + level.name() + " " + message;
            writer.print(log);
            writer.flush();
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void setLogFile(String filePath) {
        if (logFilePath == null || !logFilePath.equals(filePath)) {
            logFilePath = filePath;
            if (writer != null) {
                writer.close();
            }
        }

        try {
            writer = new PrintWriter(new FileWriter(logFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getLogFile() {
        if (logFilePath != null) {
            return logFilePath;
        }
        return null;
    }

    @Override
    public void flush() {
        try {
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            writer.close();
            writer = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}