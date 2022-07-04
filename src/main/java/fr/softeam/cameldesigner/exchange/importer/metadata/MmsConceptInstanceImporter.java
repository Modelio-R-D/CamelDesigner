package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.mms.MmsConceptInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b37fea55-eaee-4023-a420-572395512a4d")
public class MmsConceptInstanceImporter<T extends MmsConceptInstance, V extends fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance> extends MmsObjectImporter<T,V> {
    @objid ("9009bff2-27e5-43ef-98a6-e66836218e1d")
    public MmsConceptInstanceImporter() {
    }

    @objid ("805332d5-e946-495a-8399-87b21ee0a65c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMmsConceptInstance(this);
    }

    @objid ("fcbd072c-dc17-4646-b2e4-ce7e715ecdad")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance.create();
    }

    @objid ("94bfa104-a23f-4edb-adb7-4037b0ee8873")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

    @objid ("4c86c8b9-4a80-441e-bbfc-949d92c404d4")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MmsConcept) {
            ((MmsConcept) context).addInstance(elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("35a1406a-0c4a-485d-9bf2-26031e7f0467")
    public MmsConceptInstanceImporter(T elt) {
        super(elt);
    }

}
