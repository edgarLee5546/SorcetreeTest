package com.chlee.module;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * CH(Chunghee Lee) Global Logger log file location Directory: user/home/G_LOG
 * FIle name: java(n).log.(i) where n: 0-99. See properties in
 * 
 * @author edgar
 *
 */
public class CHLogger {
	private static Logger logger = Logger.getGlobal();

	public static void main(String[] args) {
		Logger logger = CHLogger.getLogger();
		logger.info("info 시험 중:");
		logger.config("config 시험중: ");
	}

	public static String getFilePath() {
		return "로그파일: " + logFile;
	}

	private static String logFile = "/Users/edgar/tempjava/global.%g.log";

	public static Logger getLogger() {
		logger.setLevel(Level.CONFIG);
		logger.setUseParentHandlers(false);
		int LOG_ROTATION_COUNT = 30;
		CH_FileHandler handler;
		try {
			handler = new CH_FileHandler(logFile, 0, LOG_ROTATION_COUNT);
			handler.setLevel(Level.CONFIG);
			handler.setFormatter(new SimpleFormatter());
			logger.addHandler(handler);
		} catch (NoSuchFileException e) {
			System.out.println("파일부재 오류: " + e.getFile());
			System.out.println("프로그램 종료!");
			System.exit(-1);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}

		System.out.println(CHLogger.getFilePath());
		return logger;
	}
}