package fr.softeam.cameldesigner.elementmodel.exporter;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import camel.core.Application;
import camel.core.CamelModel;
import camel.core.CoreFactory;
import fr.softeam.cameldesigner.conversion.process.generate.GenerateProcess;
import fr.softeam.cameldesigner.elementmodel.walker.IWalker;
import fr.softeam.cameldesigner.elementmodel.walker.umlwalker.UmlWalker;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;

public abstract class AbstractExporterService {
    protected Map<String, Boolean> options;

    protected String fileExtension;

    public AbstractExporterService(Map<String, Boolean> options, String fileExtension) {
        super();
        this.options = options;
        this.fileExtension = fileExtension;
    }

    public void exportCamelUMLModelToFile(Package camelUMLModel, String directoryOutputPath) {
        fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel rootProxy = fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.instantiate(camelUMLModel);
        
        CamelModel camelModel = generateCamelModelRoot(rootProxy);
        
        Map<ModelElement, CDOObject> processedUmlElements = new HashMap<>();
        processedUmlElements.put(rootProxy.getElement(), camelModel);
        
        GenerateProcess generateProcess = new GenerateProcess(null, processedUmlElements);
        
        IWalker umlWalker = new UmlWalker (generateProcess);
        umlWalker.walk(camelUMLModel);
        
        //String fileExtension = ".xmi";
        String filePath = directoryOutputPath + File.separatorChar + camelUMLModel.getName() + this.fileExtension;
        
        this.exportCamel(camelModel, filePath);
    }

    protected abstract void exportCamel(CamelModel camelModel, String filePath);

    private CamelModel generateCamelModelRoot(fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel rootProxy) {
        CamelModel camelModel = CoreFactory.eINSTANCE.createCamelModel();
        camelModel.setName(rootProxy.getElement().getName());
        
        Application application = CoreFactory.eINSTANCE.createApplication();
        
        application.setName(rootProxy.getApplicationName() + "Application");
        application.setVersion(rootProxy.getApplicationName());
        camelModel.setApplication(application);
        return camelModel;
    }

}
