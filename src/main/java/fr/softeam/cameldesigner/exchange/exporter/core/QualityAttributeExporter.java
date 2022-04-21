package fr.softeam.cameldesigner.exchange.exporter.core;

import camel.core.CoreFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttributeClass;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f1fd75a5-d6d1-4c56-96a2-7f2ac229c9a8")
public class QualityAttributeExporter<T extends QualityAttributeClass> extends CamelAttributeExporter<T> {
    @objid ("db4ba2de-ca4a-4cd0-b6d1-6d933360068c")
    public QualityAttributeExporter(T elt) {
        super(elt);
    }

    @objid ("26b27f30-2330-46a8-ac3e-f80a859a4026")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return CoreFactory.eINSTANCE.createQualityAttribute();
    }

    @objid ("50e3c234-a1e2-4342-b177-99522a11b1cd")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("431d3522-d194-42f0-a7fe-b89fc72c14df")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
