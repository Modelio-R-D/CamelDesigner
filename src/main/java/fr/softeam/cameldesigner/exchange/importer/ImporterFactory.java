package fr.softeam.cameldesigner.exchange.importer;

import java.util.HashMap;
import java.util.Map;
import camel.core.impl.CamelModelImpl;
import camel.core.impl.FeatureImpl;
import camel.mms.impl.MetaDataModelImpl;
import camel.mms.impl.MmsConceptImpl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MetaDataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptImporter;
import org.eclipse.emf.cdo.CDOObject;

/**
 * Factory that instantiates the right importer class for a model element stereotyped by a 'CamelDesigner' module stereotype.
 */
@objid ("7b18247b-a2c1-4fda-8356-d4b90b2cb9f7")
public class ImporterFactory {
    @objid ("c3ea94fe-bede-493a-997a-3217ea1176ee")
    private static Map<Class<?>, CamelElementImporter<? extends CDOObject,? extends CDOObject,? extends CamelElement,? extends CamelElement>> _factory = new HashMap<>();

    @objid ("c8dc8e2d-b3e2-4418-9f8f-ec583df230cd")
    public static CamelElementImporter getImporter(CDOObject elt) throws Exception {
        if (!_factory.containsKey(elt.getClass())) {
          throw new IllegalArgumentException("Missing Element Factory for Type " + elt.getClass());
        }
        
        CamelElementImporter importer =  _factory.get(elt.getClass());
        importer.setElement(elt);
        return importer;
    }


static {

        _factory.put(FeatureImpl.class, new FeatureImporter<>());
        _factory.put(CamelModelImpl.class, new CamelModelImporter<>());
        _factory.put(MetaDataModelImpl.class, new MetaDataModelImporter<>());
        _factory.put(MmsConceptImpl.class, new MmsConceptImporter<>());
    }
}
