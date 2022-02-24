package fr.softeam.cameldesigner.exchange.exporter.metadata;

import camel.mms.MmsFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import org.eclipse.emf.cdo.CDOObject;

@objid ("3d3c06b6-dc90-436e-ab21-918277cbfe14")
public class MmsConceptExporter<T extends MmsConcept> extends MmsObjectExporter<T> {
    @objid ("a243db75-86f4-4385-940b-4c434722fe64")
    public MmsConceptExporter(T elt) {
        super(elt);
    }

    @objid ("6f9f12b9-175a-47b4-88c1-3d08b4e8d7f2")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MmsFactory.eINSTANCE.createMmsConcept();
    }

    @objid ("0e3255b4-84bc-42e3-a6d6-1ccc163f7954")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("fa31fdbd-af14-4892-8408-ce866c757ae8")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.mms.MmsConcept) && (elt instanceof camel.mms.MmsConcept)) {
            ((camel.mms.MmsConcept) context).getConcept().add((camel.mms.MmsConcept) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
