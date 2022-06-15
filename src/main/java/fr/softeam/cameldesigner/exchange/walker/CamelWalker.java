package fr.softeam.cameldesigner.exchange.walker;

import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.CamelContainment;
import fr.softeam.cameldesigner.exchange.importer.ImportProcess;
import fr.softeam.cameldesigner.exchange.importer.ImporterFactory;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("caa31436-78ea-4c8a-8512-db7bd1a4aeea")
public class CamelWalker implements IWalker<CDOObject> {
    @objid ("64e1d14c-7456-49fd-864e-424acd033548")
    private ImportProcess importProcess;

    @objid ("818c1fbf-705a-44e1-bfbb-96a0d6a0db7b")
    public CamelWalker(ImportProcess importProcess) {
        this.importProcess = importProcess;
    }

    @objid ("e9fb16c6-bf07-4bce-869f-f85d0496d7df")
    @Override
    public void walk(CDOObject element) {
        if(element != null) {
            CamelElementImporter<? extends CDOObject, ? extends CDOObject, ? extends CamelElement, ? extends CamelElement> importer;
            try {
                importer = ImporterFactory.getImporter(element);
        
                if (importer != null) {
                    Object childs = CamelContainment.getChilds(importer);
                    if (childs != null) {
                        for (CDOObject child : (Collection<? extends CDOObject>) childs) {
                            this.importProcess.process(child, element);
                            walk(child);
                        }
                    }
                }
        
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
