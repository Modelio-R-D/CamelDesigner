package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.Feature;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.classifier.FeatureClassifier;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bf556a2d-45ab-4b24-af20-959f70059208")
public class FeatureImporter<T extends Feature, V extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> extends NamedElementImporter<T,V> {
    @objid ("80b51352-eb0d-4d27-b95d-554c3ef0573b")
    public FeatureImporter() {
    }

    @objid ("a85a72b5-333a-46ee-b978-d619a8aea5eb")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitFeature(this);
    }

    @objid ("1ef3d0b7-9c94-4c05-9e4c-2f501597611d")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

    @objid ("6eed4777-b9bf-4368-8abf-f6569e14dde5")
    @Override
    public void attach(V elt, CamelElement context) {
        if ((elt instanceof FeatureClassifier)  && (context instanceof FeatureClassifier))
           ((FeatureClassifier) context).addSubFeatures((FeatureClassifier)elt);
    }

    @objid ("26dbd316-0ffe-469f-94ac-abf7ec73cedb")
    public FeatureImporter(T elt) {
        super(elt);
    }

    @objid ("5c4dca8b-eddd-41c9-becf-15d26e9ff20d")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return FeatureClass.create();
    }

}
