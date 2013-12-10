package org.skeleton.generator.repository.dao.datasource.impl;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SimpleScriptFileReader {

	private String scriptFilePath;
	private Charset charset = StandardCharsets.ISO_8859_1;
	
	public SimpleScriptFileReader(String scriptFilePath) {
		this.scriptFilePath = scriptFilePath;
	}


	public String readScript() throws IOException {
		Path path  = Paths.get(scriptFilePath);
		byte[] bytes = Files.readAllBytes(path);
        return new String(bytes,charset);
	}
}
