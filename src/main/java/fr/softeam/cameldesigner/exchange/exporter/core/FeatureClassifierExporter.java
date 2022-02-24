package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.classifier.FeatureClassifier;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ad290f3f-3a1f-41b3-b1f2-300dca9fd9e0")
public class FeatureClassifierExporter<T extends FeatureClassifier> extends FeatureExporter<T> {
    @objid ("901bee56-4214-4035-94be-d1fe3938bb35")
    public FeatureClassifierExporter(T elt) {
        super(elt);
    }

    @objid ("3da54f50-0c24-40bf-a9af-2cede595e235")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("29b1a39a-7dbe-4ff3-9341-df125f051097")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
