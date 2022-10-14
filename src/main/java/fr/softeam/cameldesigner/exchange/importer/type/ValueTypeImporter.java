package fr.softeam.cameldesigner.exchange.importer.type;

import camel.type.ValueType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.core.NamedElementImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ce6299fe-a427-4090-af9b-d08cae38c30d")
public class ValueTypeImporter<T extends ValueType, V extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType> extends NamedElementImporter<T,V> {
    @objid ("68190a48-d1f9-4990-957a-3b21eb40ec79")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("64f1dad0-5976-475d-a121-99216b536afd")
    @Override
    public void attach(V elt, CamelElement context) {
        // TODO Auto-generated method stub
    }

}
