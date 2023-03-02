package fr.softeam.cameldesigner.exchange.importer;

import java.util.HashMap;
import camel.constraint.ConstraintPackage;
import camel.core.CamelModel;
import camel.core.CorePackage;
import camel.deployment.DeploymentPackage;
import camel.metric.MetricPackage;
import camel.mms.MmsPackage;
import camel.requirement.RequirementPackage;
import camel.type.TypePackage;
import camel.unit.UnitPackage;
import com.google.inject.Injector;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.exchange.CamelDslManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.resource.XtextResourceSet;

@objid ("9b36fd5d-a0af-44b9-adad-7533e3d21178")
public class CamelImporterService extends AbstractImporterService {
    @objid ("5b3f496d-1d57-484a-9cd2-908a3b2f8920")
    private static final String CAMEL_EXTENSION = ".camel";

    @objid ("2516fdd6-a66b-4eb4-8d2c-ca53c5501141")
    public CamelImporterService() {
        super(new HashMap<String, Boolean>() , CAMEL_EXTENSION);
        this._options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
    }

    @objid ("59f2b81a-edef-4e53-9a6d-261ba285ac80")
    @Override
    protected CamelModel importCamel(String filePath) {
        Injector injector = CamelDslManager.getInstance().getInjector();
        
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.getPackageRegistry().put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ConstraintPackage.eNS_URI, ConstraintPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DeploymentPackage.eNS_URI, DeploymentPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(MetricPackage.eNS_URI, MetricPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(MmsPackage.eNS_URI, MmsPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(RequirementPackage.eNS_URI, RequirementPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(TypePackage.eNS_URI, TypePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(UnitPackage.eNS_URI, UnitPackage.eINSTANCE);
        resourceSet.addLoadOption(this.loadOption, Boolean.TRUE);
        Resource resource = resourceSet.getResource(URI.createFileURI(filePath), true);
        return(CamelModel) resource.getContents().get(0);
    }

}
