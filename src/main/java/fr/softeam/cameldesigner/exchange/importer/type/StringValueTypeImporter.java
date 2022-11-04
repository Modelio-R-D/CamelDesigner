package fr.softeam.cameldesigner.exchange.importer.type;

import camel.type.StringValueType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("fdeaabed-bf72-4370-8726-1ba78e6ef5cc")
public class StringValueTypeImporter<T extends StringValueType, V extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType> extends ValueTypeImporter<T,V> {
    @objid ("0609ee80-af0a-472e-9548-e19e2f1afc2b")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        // TODO Auto-generated method stub
        return null;
    }

}
