package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.Feature;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.classifier.FeatureClassifier;
import fr.softeam.cameldesigner.exchange.importer.ICamelVisitor;

public class FeatureImporter<T extends Feature, V extends Feature, W extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature, Z extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> extends NamedElementImporter<T, V, W, Z> {

    public FeatureImporter(T elt) {
        super(elt);
    }

    @Override
    public Object accept(ICamelVisitor v) {
        return v.visitFeature(this);
    }

    @Override
    public CamelElement createCamelElt(V owner) {
        return FeatureClass.create();
    }

    @Override
    public void setProperties(W elt) {
        super.setProperties(elt);

    }

    @Override
    public void attach(W elt, Z context) {
        if ((elt instanceof FeatureClassifier)  && (context instanceof FeatureClassifier))
            ((FeatureClassifier) elt).getSubFeatures().add((FeatureClassifier)context);
    }

}
