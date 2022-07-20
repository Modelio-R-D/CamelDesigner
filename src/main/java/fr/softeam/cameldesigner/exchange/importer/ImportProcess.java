package fr.softeam.cameldesigner.exchange.importer;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.IElementProcess;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c7582f35-a3a2-413e-a707-e71081547ee3")
public class ImportProcess implements IElementProcess<CamelElement,CDOObject> {
    @objid ("f8d68a58-2f78-43a3-b927-8ad76acc7d6f")
    private CDOObject camelElementParent;

    @objid ("09776a3a-5b97-4ce8-ad1e-6e9f9ebcadb0")
    public ImportProcess(CDOObject camelElementParent) {
        this.camelElementParent = camelElementParent;
    }

    @objid ("a57d9000-196e-4aa8-8e4e-f6d6328a5b43")
    @Override
    public CamelElement process(CDOObject element, CDOObject context) {
        CamelElement processedElement = null;
        ImportMap importMap = ImportMap.getInstance();
        
        try {
            CamelElementImporter<CDOObject, CamelElement> importer = ImporterFactory.getImporter(element);
            importer.setProcess(this);
        
            if(importMap.containsKey(element)) {
                processedElement = importMap.get(element);
            } else {
                CamelElement owner = getElement(context);
                processedElement = importer.createCamelElt(context);
                importer.attach(processedElement, owner);
                if(processedElement != null) {
                    importMap.put(element, processedElement);
                }
            }
            importer.setProperties(processedElement);
        
        }catch (Exception e) {
            CamelDesignerModule.logService.error(e);
            return null;
        }
        return processedElement;
    }

    @objid ("3db4e287-1b33-4ce1-9016-a21fa7de5e9f")
    public CDOObject getCamelElementParent() {
        return this.camelElementParent;
    }

    @objid ("11a9f690-7b56-4322-bf19-386f4b1458e5")
    public void setCamelElementParent(CDOObject camelElementParent) {
        this.camelElementParent = camelElementParent;
    }

    @objid ("8f08e027-ae08-4410-b43f-e110a8f63ce2")
    public CamelElement getElement(CDOObject element) {
        if (element != null) {
            ImportMap genMap = ImportMap.getInstance();
            if(genMap.containsKey(element)) {
                return genMap.get(element);
            }else {
                return process(element, (CDOObject)element.eContainer());
            }
        }
        return null;
    }

    @objid ("84e6bd59-6103-42d9-bcb1-24f046a49450")
    @Override
    public CamelElement create(CDOObject element, CDOObject context) {
        CamelElement processedElement = null;
        ImportMap importMap = ImportMap.getInstance();
        
        try {
            CamelElementImporter<CDOObject, CamelElement> importer = ImporterFactory.getImporter(element);
            importer.setProcess(this);
        
            CamelElement owner = getElement(context);
            processedElement = importer.createCamelElt(context);
            if(processedElement != null) {
                importer.attach(processedElement, owner);
        
                importMap.put(element, processedElement);
            }
        
        }catch (Exception e) {
            CamelDesignerModule.logService.error(e);
            return null;
        }
        return processedElement;
    }

}
