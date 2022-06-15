package fr.softeam.cameldesigner.exchange.importer;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.statik.Package;
import camel.core.CamelModel;
import fr.softeam.cameldesigner.exchange.walker.CamelWalker;
import fr.softeam.cameldesigner.exchange.walker.IWalker;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

@objid ("acd66265-f660-48ff-a105-5a526a8cf126")
public abstract class AbstractImporterService {
    @objid ("c5d8c763-b780-460f-8c17-8687c2705400")
    protected Map<String, Boolean> _options;

    @objid ("61df86da-e0eb-434e-93bf-3841c5781d62")
    protected String _fileExtension;

    @objid ("3b1d9df4-1bc3-420a-829d-fe3b1e8ee131")
    private final String _rootID = "5fe3c74b-bdb5-411d-a9c9-80e86449b9a5";

    protected Object loadOption;

    @objid ("00e744cb-1a7a-4020-82a3-69cdb4acf049")
    public AbstractImporterService(Map<String, Boolean> options, String fileExtension) {
        super();
        this._options = options;
        this._fileExtension = fileExtension;
    }

    @objid ("c193b036-5cad-4b90-b6af-ec22d0ecb154")
    protected abstract CamelModel importCamel(String filePath);


    private fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel createCamelModelRoot(CamelModel rootProxy, Package root) {

        //Creates root Camel Model
        fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel camelModel = fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.create();
        camelModel.setName(rootProxy.getName());

        root.getOwnedElement().add(camelModel.getElement());

        //Creates Application
//        Application application = CoreFactory.eINSTANCE.createApplication();
//        application.setName(rootProxy.getApplicationName());
//        application.setVersion(rootProxy.getApplicationVersion());
//        camelModel.setApplication(application);

        //Adds Library
//        Package root = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().findElementById(Package.class, this._rootID);
//        for (ModelTree ownedElt : root.getOwnedElement()) {
//            if (ownedElt.isStereotyped(CamelDesignerPeerModule.MODULE_NAME, fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME)) {
//                genMap.put(ownedElt, camelModel);
//            }
//        }

//        genMap.put(camelModel ) ;
        return camelModel;
    }

    public void importFromFile(Package selectedElt, String absolutePath) {
        ImportMap impMap = ImportMap.getInstance();
        impMap.clear();

        CamelModel camelModel = this.importCamel(absolutePath);

        fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel impCamelModel = createCamelModelRoot(camelModel, selectedElt);
        impMap.put(camelModel, impCamelModel);

        ImportProcess importProcess = new ImportProcess(null);
        try {
            IWalker<CDOObject> camelWalker = new CamelWalker(importProcess);
            camelWalker.walk(camelModel);
        }catch(Exception e) {
            CamelDesignerModule.logService.error(e);
        }
    }

}
