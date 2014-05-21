package org.skeleton.generator.bc.command.file.impl.conf.pom;

import java.io.File;

import org.skeleton.generator.bc.command.file.impl.templatized.ProjectTemplatizedFileWriteCommand;
import org.skeleton.generator.model.metadata.FileType;
import org.skeleton.generator.model.om.Project;

public class SpringHibernateRichfacesUtilPomFileWriteCommand extends ProjectTemplatizedFileWriteCommand {

	public SpringHibernateRichfacesUtilPomFileWriteCommand(Project project) {
		super(project.workspaceFolder + File.separator + project.projectName + "-util", "pom", FileType.XML, project);
	}

}