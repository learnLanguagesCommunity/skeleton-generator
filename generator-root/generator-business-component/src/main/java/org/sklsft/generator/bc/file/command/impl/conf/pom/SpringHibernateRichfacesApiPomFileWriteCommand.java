package org.sklsft.generator.bc.file.command.impl.conf.pom;

import java.io.File;

import org.sklsft.generator.bc.file.command.impl.templatized.ProjectTemplatizedFileWriteCommand;
import org.sklsft.generator.model.metadata.FileType;
import org.sklsft.generator.model.om.Project;

public class SpringHibernateRichfacesApiPomFileWriteCommand extends ProjectTemplatizedFileWriteCommand {

	public SpringHibernateRichfacesApiPomFileWriteCommand(Project project) {
		super(project.workspaceFolder + File.separator + project.projectName + "-api", "pom", FileType.XML, project);
	}

}
