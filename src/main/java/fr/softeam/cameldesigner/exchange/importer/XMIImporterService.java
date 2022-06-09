package fr.softeam.cameldesigner.exchange.importer;

import java.util.HashMap;
import com.google.inject.Injector;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import camel.core.CamelModel;
import camel.core.CorePackage;
import fr.softeam.cameldesigner.conversion.CamelDslManager;
import fr.softeam.cameldesigner.exchange.walker.CamelWalker;
import fr.softeam.cameldesigner.exchange.walker.IWalker;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

@objid ("50c38cbf-2112-4e17-8072-ff333c032e3c")
public class XMIImporterService extends AbstractImporterService {
    @objid ("db648b2c-da60-455e-be4d-fb4ac8bb29e5")
    private static final String XMI_EXTENSION = ".xmi";



    @objid ("1bba9bfd-1c03-4d0b-a2b7-ad388035ef75")
    public XMIImporterService() {
        super(new HashMap<String, Boolean>() , XMI_EXTENSION);
        this._options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
    }

    @objid ("5d8fd50e-8feb-4ec7-929e-c8a3b631d1b8")
    @Override
    protected void importCamel(fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel modelioRoot, String filePath) {
        Injector injector = CamelDslManager.getInstance().getInjector();

        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.getPackageRegistry().put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
        resourceSet.addLoadOption(this.loadOption, Boolean.TRUE);
        Resource resource = resourceSet.getResource(URI.createFileURI(filePath), true);
        CamelModel camelModel = (CamelModel)resource.getContents().get(0);

        ImportProcess reverseProcess = new ImportProcess(null);
        try {
            IWalker<CDOObject> camelWalker = new CamelWalker(reverseProcess);
            camelWalker.walk(camelModel);
        }catch(Exception e) {
            CamelDesignerModule.logService.error(e);
        }
    }

}
