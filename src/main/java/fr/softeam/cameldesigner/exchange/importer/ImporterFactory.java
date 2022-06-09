package fr.softeam.cameldesigner.exchange.importer;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.core.CamelModel;
import camel.core.Feature;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;

/**
 * Factory that instantiates the right importer class for a model element stereotyped by a 'CamelDesigner' module stereotype.
 */
@objid ("7b18247b-a2c1-4fda-8356-d4b90b2cb9f7")
public class ImporterFactory{

    public static final CamelElementImporter<? extends CDOObject, ? extends CDOObject, ? extends CamelElement, ? extends CamelElement> getImporter(Feature e) {
        return new FeatureImporter<>(e);
    }

    public static final CamelElementImporter<? extends CDOObject, ? extends CDOObject, ? extends CamelElement, ? extends CamelElement> getImporter(CDOObject e) {
        return null;
    }

}
