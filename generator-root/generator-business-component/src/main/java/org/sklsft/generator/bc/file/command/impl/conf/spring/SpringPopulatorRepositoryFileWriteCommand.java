package org.sklsft.generator.bc.file.command.impl.conf.spring;

import java.io.File;

import org.sklsft.generator.bc.file.command.impl.templatized.ProjectTemplatizedFileWriteCommand;
import org.sklsft.generator.model.domain.Project;
import org.sklsft.generator.model.metadata.FileType;

public class SpringPopulatorRepositoryFileWriteCommand extends ProjectTemplatizedFileWriteCommand {

	public SpringPopulatorRepositoryFileWriteCommand(Project project) {
		super(project.workspaceFolder + File.separator + project.projectName + "-populator/src/main/resources", "applicationContext-" + project.projectName + "-repository", FileType.XML, project);
	}

}
