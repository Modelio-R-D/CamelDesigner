package fr.softeam.cameldesigner.exchange.exporter;

import java.util.Map;
import camel.core.Application;
import camel.core.CamelModel;
import camel.core.CoreFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.walker.IWalker;
import fr.softeam.cameldesigner.exchange.walker.umlwalker.UmlWalker;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerPeerModule;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Package;

@objid ("4b0018c9-1638-4a99-9f0a-549c5fd6d7f1")
public abstract class AbstractExporterService {
    @objid ("2440eeba-4c5e-4247-befa-113fdd68b5a9")
    protected Map<String, Boolean> _options;

    @objid ("cf107338-43a3-49fe-805b-0df27892ab2d")
    protected String _fileExtension;

    @objid ("7b04fa5e-93b4-464a-8005-de7290a9d56e")
    private final String _rootID = "5fe3c74b-bdb5-411d-a9c9-80e86449b9a5";

    @objid ("52a1cb31-51a2-4f8f-b0dc-7fe85d157c59")
    public AbstractExporterService(Map<String, Boolean> options, String fileExtension) {
        super();
        this._options = options;
        this._fileExtension = fileExtension;
    }

    @objid ("86a9eda7-eff9-4f95-a189-c5b5ec63be29")
    public void exportCamelUMLModelToFile(fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel camelUMLModel, String filePath) {
        GenerateMap genMap = GenerateMap.getInstance();
        genMap.clear();
        
        CamelModel camelModel = generateCamelModelRoot(camelUMLModel, genMap);
        
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
    private CamelModel generateCamelModelRoot(fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel rootProxy, GenerateMap genMap) {
        //Creates root Camel Model
        CamelModel camelModel = CoreFactory.eINSTANCE.createCamelModel();
        camelModel.setName(rootProxy.getElement().getName());
        
        //Creates Application
        Application application = CoreFactory.eINSTANCE.createApplication();
        application.setName(rootProxy.getApplicationName());
        application.setVersion(rootProxy.getApplicationVersion());
        camelModel.setApplication(application);
        
        //Adds Library
        Package root = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().findElementById(Package.class, this._rootID);
        for (ModelTree ownedElt : root.getOwnedElement()) {
            if (ownedElt.isStereotyped(CamelDesignerPeerModule.MODULE_NAME, fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME)) {
                genMap.put(ownedElt, camelModel);
            }
        }
        
        genMap.put(rootProxy.getElement(), camelModel);
        return camelModel;
    }

}
