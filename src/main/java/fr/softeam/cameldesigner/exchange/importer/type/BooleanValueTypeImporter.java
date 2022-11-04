package fr.softeam.cameldesigner.exchange.importer.type;

import camel.type.BooleanValueType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a14729e8-39c6-4f14-9a96-d664a1ffad84")
public class BooleanValueTypeImporter<T extends BooleanValueType, V extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType> extends ValueTypeImporter<T,V> {
    @objid ("32efc330-3c3d-4fe1-91be-aef421aa0766")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        // TODO Auto-generated method stub
        return null;
    }

}
