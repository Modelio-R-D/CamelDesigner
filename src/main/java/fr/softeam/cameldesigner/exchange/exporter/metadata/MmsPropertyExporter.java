package fr.softeam.cameldesigner.exchange.exporter.metadata;

import camel.mms.MmsFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("2a6326d9-a52e-4e76-9832-1b0db40d7b9e")
public class MmsPropertyExporter<T extends MmsProperty> extends NamedElementExporter<T> {
    @objid ("d6439886-19cc-44a2-bc7c-3001286345b5")
    public MmsPropertyExporter(T elt) {
        super(elt);
    }

    @objid ("32fb27bd-822c-44cb-ba6e-2f71e43bebf6")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MmsFactory.eINSTANCE.createMmsProperty();
    }

    @objid ("5dc1fa3c-e632-4ea9-8ae9-57c1a94b8de5")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.mms.MmsProperty) {
            camel.mms.MmsProperty mp = (camel.mms.MmsProperty) elt;
            setPropertyType(mp);
            setRange(mp);
            setRangeURI(mp);
        }
    }

    @objid ("3e151642-6338-41b5-97e8-f8204d9cc7ba")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.mms.MmsConcept) && (elt instanceof camel.mms.MmsProperty)) {
            ((camel.mms.MmsConcept) context).getProperty().add((camel.mms.MmsProperty) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("094a1926-24d0-4356-8761-64192f4d66e4")
    private void setRangeURI(camel.mms.MmsProperty mp) {
        String content = this._element.getRangeUri();
        if (content != null)
            mp.setRangeUri(content);
    }

    @objid ("ade8ef49-7298-453c-bd3a-92a0513e7dce")
    private void setRange(camel.mms.MmsProperty mp) {
        CDOObject mc =  this._process.getElement(this._element.getRange());
        if ((mc != null) &&  (mc instanceof camel.mms.MmsConcept))
            mp.setRange((camel.mms.MmsConcept) mc);
    }

    @objid ("9472781e-7282-459c-a161-91d93db385a7")
    private void setPropertyType(camel.mms.MmsProperty mp) {
        mp.setPropertyType(this._element.getMmsPropertyType());
    }

}
