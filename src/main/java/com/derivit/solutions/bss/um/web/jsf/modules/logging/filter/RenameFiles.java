package com.derivit.solutions.bss.um.web.jsf.modules.logging.filter;

import java.io.File;

public class RenameFiles {
	public static void main(String[] args) {
		String folder = "D:/Husain Bata/JAVAFX/WorkSpace_EclipseEELuna/UserManagementLocal/src/main/webapp/resources/primefaces-modena/images";
		File parentFolder = new File(folder);
		File[] childFiles = parentFolder.listFiles();
		for (File file : childFiles) {
			if(file.getName().contains("svg")) {
				try {
					File renamedFile = new File(file.getName().replaceAll(".xhtml", ""));
					file.renameTo(renamedFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}