package fr.softeam.cameldesigner.exchange.importer;

import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.core.impl.CamelModelImpl;
import camel.core.impl.FeatureImpl;
import camel.mms.impl.MetaDataModelImpl;
import camel.mms.impl.MmsConceptImpl;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MetaDataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptImporter;

/**
 * Factory that instantiates the right importer class for a model element stereotyped by a 'CamelDesigner' module stereotype.
 */
@objid ("7b18247b-a2c1-4fda-8356-d4b90b2cb9f7")
public class ImporterFactory{

    private static Map<Class<?>, CamelElementImporter<? extends CDOObject, ? extends CDOObject, ? extends CamelElement, ? extends CamelElement>> _factory = new HashMap<>();

    static {

        _factory.put(FeatureImpl.class, new FeatureImporter<>());
        _factory.put(CamelModelImpl.class, new CamelModelImporter<>());
        _factory.put(MetaDataModelImpl.class, new MetaDataModelImporter<>());
        _factory.put(MmsConceptImpl.class, new MmsConceptImporter<>());
    }

    public static  CamelElementImporter getImporter(CDOObject elt)
        throws Exception {

      if (!_factory.containsKey(elt.getClass())) {
        throw new IllegalArgumentException("Missing Element Factory for Type " + elt.getClass());
      }

      CamelElementImporter importer =  _factory.get(elt.getClass());
      importer.setElement(elt);

      return importer;
    }


}
