package fr.softeam.cameldesigner.elementmodel.importer;

import java.util.HashMap;
import java.util.Map;
import camel.core.CamelModel;
import camel.core.CorePackage;
import com.google.inject.Injector;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.CamelDslManager;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcess;
import fr.softeam.cameldesigner.elementmodel.walker.camelwalker.AbstractCamelWalker;
import fr.softeam.cameldesigner.elementmodel.walker.camelwalker.CamelWalker;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.modelio.metamodel.uml.statik.Package;

/**
 * @author kchaabouni
 */
public class XMIImporterService implements IImporterService {
    @Override
    public void importModelFromFile(Package packageOwner, String filePath) {
        Injector injector = CamelDslManager.getInstance().getInjector();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.getPackageRegistry().put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
        resourceSet.addLoadOption(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
        Resource resource = resourceSet.getResource(URI.createFileURI(filePath), true);
        CamelModel camelModel = (CamelModel)resource.getContents().get(0);
        
        Map<CDOObject, CamelElement> processedCamelElements = new HashMap<>();
        ReverseProcess reverseProcess = new ReverseProcess(packageOwner, processedCamelElements);
        AbstractCamelWalker camelWalker = new CamelWalker (reverseProcess);
        camelWalker.walk(camelModel);
    }

}
