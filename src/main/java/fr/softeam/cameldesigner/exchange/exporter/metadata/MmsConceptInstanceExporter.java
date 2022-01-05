package fr.softeam.cameldesigner.exchange.exporter.metadata;

import camel.mms.MmsFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8c6e13f7-6eb6-47c6-904a-3e6278006dd5")
public class MmsConceptInstanceExporter<T extends MmsConceptInstance> extends MmsObjectExporter<T> {
    @objid ("249cbcca-f64d-4c75-a29b-723467064f7f")
    public MmsConceptInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("7fc9bfa7-4431-4032-b871-37ac9a3590b0")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MmsFactory.eINSTANCE.createMmsConceptInstance();
    }

    @objid ("684173d3-0a0d-490b-bc2c-bd3cac8345e0")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("f7030dff-d645-4dec-83ee-0fefa74c5d68")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
