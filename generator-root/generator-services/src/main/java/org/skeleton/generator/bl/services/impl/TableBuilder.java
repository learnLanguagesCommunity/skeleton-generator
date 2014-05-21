package org.skeleton.generator.bl.services.impl;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.skeleton.generator.exception.InvalidFileException;
import org.skeleton.generator.model.om.Project;
import org.skeleton.generator.model.om.Table;
import org.skeleton.generator.repository.dao.jdbc.impl.JdbcRawCommand;
import org.skeleton.generator.repository.file.impl.SimpleScriptFileReaderImpl;
import org.skeleton.generator.repository.file.interfaces.SimpleScriptFileReader;


public class TableBuilder {

	/*
	 * properties
	 */
	private Table table;
	private DataSource dataSource;
	private SimpleScriptFileReader scriptFileReader;
	private int step;
	
	/*
	 * constructor
	 */
	public TableBuilder(Table table, DataSource dataSource, int step) {
		this.table = table;
		this.dataSource = dataSource;
		this.scriptFileReader = new SimpleScriptFileReaderImpl();
		this.step = step;
	}
	

	public void buildTable() throws IOException, InvalidFileException, SQLException {
		
		String scriptFilePath = table.myPackage.model.project.sourceFolder + File.separator + Project.BUILD_SCRIPT_FOLDER + File.separator + step + File.separator + table.myPackage.name + File.separator + table.originalName + ".sql";
		
		String script = scriptFileReader.readScript(scriptFilePath);
			
		new JdbcRawCommand(dataSource, script).execute();
	}
}