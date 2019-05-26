package app.server.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {
    /** 存放的文件夹 **/
    private String file_name = "ServerLog";
    public static final LoggerUtil loggerUtil = new LoggerUtil();
    private Logger logger;
    private LoggerUtil(){
        logger = Logger.getLogger("TEST");
        try {
            setLogingProperties(logger);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 得到要记录的日志的路径及文件名称
     * @return
     */
    private String getLogName() {
        StringBuffer logPath = new StringBuffer();
        logPath.append("/"+file_name);
        File file = new File(logPath.toString());
        if (!file.exists())
            file.mkdir();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        logPath.append("/"+sdf.format(new Date())+".log");

        return logPath.toString();
    }

    /**
     * 配置Logger对象输出日志文件路径
     * @param logger
     * @throws SecurityException
     * @throws IOException
     */
    private void setLogingProperties(Logger logger) throws SecurityException, IOException {
        setLogingProperties(logger, Level.ALL);
    }

    /**
     * 配置Logger对象输出日志文件路径
     * @param logger
     * @param level 在日志文件中输出level级别以上的信息
     * @throws SecurityException
     * @throws IOException
     */
    private void setLogingProperties(Logger logger,Level level) {
        FileHandler fh;
        try {
            fh = new FileHandler(getLogName(),true);
            logger.addHandler(fh);//日志输出文件
            //logger.setLevel(level);
            fh.setFormatter(new SimpleFormatter());//输出格式
            //logger.addHandler(new ConsoleHandler());//输出到控制台
        } catch (SecurityException e) {
            logger.log(Level.SEVERE, "安全性错误", e);
        } catch (IOException e) {
            logger.log(Level.SEVERE,"读取文件日志错误", e);
        }
    }
    public void logInfo(String msg){
        logger.log(Level.INFO,msg);
    }
    public void logWarn(String msg){
        logger.log(Level.WARNING,msg);
    }
    public void logErr(String msg){
        logger.log(Level.SEVERE,msg);
    }
}
