package fr.softeam.cameldesigner.exchange.walker;

import java.util.Collection;
import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.CamelContainment;
import fr.softeam.cameldesigner.exchange.importer.ImportProcess;
import fr.softeam.cameldesigner.exchange.importer.ImporterFactory;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;


public class CamelWalker implements IWalker<CDOObject> {

    private ImportProcess importProcess;


    public CamelWalker(ImportProcess importProcess) {
        this.importProcess = importProcess;
    }


    @Override
    public void walk(CDOObject element) {
        if(element != null) {
            CamelElementImporter<? extends CDOObject, ? extends CDOObject, ? extends CamelElement, ? extends CamelElement> importer = ImporterFactory.getImporter(element);
            if (importer != null) {
                Object childs = CamelContainment.getChilds(importer);
                if (childs != null) {
                    for (CDOObject child : (Collection<? extends CDOObject>) childs) {
                        this.importProcess.process(child, element);
                        walk(child);
                    }
                }
            }
        }
    }


}
