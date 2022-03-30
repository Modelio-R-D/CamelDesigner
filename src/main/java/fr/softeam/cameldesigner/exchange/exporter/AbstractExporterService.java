package fr.softeam.cameldesigner.exchange.exporter;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import camel.core.Application;
import camel.core.CamelModel;
import camel.core.CoreFactory;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.walker.IWalker;
import fr.softeam.cameldesigner.exchange.walker.umlwalker.UmlWalker;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

@objid ("4b0018c9-1638-4a99-9f0a-549c5fd6d7f1")
public abstract class AbstractExporterService {
    @objid ("2440eeba-4c5e-4247-befa-113fdd68b5a9")
    protected Map<String, Boolean> options;

    @objid ("cf107338-43a3-49fe-805b-0df27892ab2d")
    protected String fileExtension;

    @objid ("52a1cb31-51a2-4f8f-b0dc-7fe85d157c59")
    public AbstractExporterService(Map<String, Boolean> options, String fileExtension) {
        super();
        this.options = options;
        this.fileExtension = fileExtension;
    }

    @objid ("86a9eda7-eff9-4f95-a189-c5b5ec63be29")
    public void exportCamelUMLModelToFile(fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel camelUMLModel, String filePath) {
        CamelModel camelModel = generateCamelModelRoot(camelUMLModel);

        GenerateMap genMap = GenerateMap.getInstance();
        genMap.clear();
        genMap.put(camelUMLModel.getElement(), camelModel);

        GenerateProcess generateProcess = new GenerateProcess(null);
        try {
            IWalker<CamelElement> umlWalker = new UmlWalker(generateProcess);
            umlWalker.walk(camelUMLModel);
        }catch(Exception e) {
            CamelDesignerModule.logService.error(e);
        }

        this.exportCamel(camelModel, filePath);
    }

    @objid ("3e76bd92-92bd-4213-8e30-aaba26444a61")
    protected abstract void exportCamel(CamelModel camelModel, String filePath);

    @objid ("1864b77c-589a-4b89-a595-ee773592e31d")
    private CamelModel generateCamelModelRoot(fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel rootProxy) {
        CamelModel camelModel = CoreFactory.eINSTANCE.createCamelModel();
        camelModel.setName(rootProxy.getElement().getName());

        Application application = CoreFactory.eINSTANCE.createApplication();
        application.setName(rootProxy.getApplicationName());
        application.setVersion(rootProxy.getApplicationVersion());
        camelModel.setApplication(application);
        return camelModel;
    }

}
