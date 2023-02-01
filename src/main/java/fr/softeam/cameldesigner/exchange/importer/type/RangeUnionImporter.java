package fr.softeam.cameldesigner.exchange.importer.type;

import camel.type.RangeUnion;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b0e2b089-0d9d-4d0e-b586-146c8ba0ed94")
public class RangeUnionImporter<T extends RangeUnion, V extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion> extends ValueTypeImporter<T,V> {
    @objid ("d9d9f644-2afe-4de2-a353-9549b2b2815e")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion.create();
    }

    @objid ("601c81ee-bc7e-4506-8417-44f04cf8b93f")
    public RangeUnionImporter(T elt) {
        super(elt);
    }

    @objid ("3f3323ae-535f-4d93-8097-867a04d8c69e")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRangeUnionImporter(this);
    }

    @objid ("12617928-eedf-4590-95ed-5bc25466fb34")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof TypeModel)
            ((TypeModel)context).addValueTypes(elt);
    }

}
