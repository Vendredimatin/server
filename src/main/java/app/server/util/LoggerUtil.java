package app.server.util;

import app.server.exception.MakeErrException;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {
    public static final LoggerUtil loggerUtil = new LoggerUtil();
    private Logger logger;
    private LoggerUtil(){
        logger = Logger.getLogger("TEST");
        setLogingProperties(logger);
    }
    /**
     * 得到要记录的日志的路径及文件名称
     * @return String 日志路径
     */
    private String getLogName() throws MakeErrException {
        AtomicReference<StringBuilder> logPath = new AtomicReference<>(new StringBuilder());
        /* 存放的文件夹 **/
        AtomicReference<String> fileName = new AtomicReference<>("ServerLog");
        logPath.get().append("/");
        logPath.get().append(fileName);
        File file = new File(logPath.toString());
        boolean mkRes = false;
        if (!file.exists()) mkRes = file.mkdir();
        if(!mkRes)throw new MakeErrException("Make Dir Error");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        logPath.get().append("/");
        logPath.get().append(sdf.format(new Date()));
        logPath.get().append(".log");
        return logPath.toString();
    }

    /**
     * 配置Logger对象输出日志文件路径
     * @param logger Logger
     */
    private void setLogingProperties(Logger logger) {
        FileHandler fh;
        try {
            fh = new FileHandler(getLogName(),true);
            logger.addHandler(fh);//日志输出文件
            fh.setFormatter(new SimpleFormatter());//输出格式
        } catch (SecurityException e) {
            logger.log(Level.SEVERE, "安全性错误", e);
        } catch (IOException e) {
            logger.log(Level.SEVERE,"读取文件日志错误", e);
        } catch (MakeErrException e) {
            logger.log(Level.SEVERE,"创建文件夹失败", e);
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
