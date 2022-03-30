package fr.softeam.cameldesigner.exchange.exporter.type;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.Value;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6503c310-8af9-479b-b607-52f9cf493390")
public abstract class ValueExporter<T extends Value> {
    @objid ("78e6b9d7-4dff-47cb-baac-453fd5a76ba9")
    public ValueExporter(T elt) {
    }

    @objid ("c08b6457-0138-4a9b-be93-c4ec03d7bd32")
    public CDOObject createCamelElt(CDOObject context) {
        return null;
    }

    @objid ("c4e17444-ab01-48ba-b63f-230ad71f1267")
    public void setProperties(CDOObject elt) {
    }

    @objid ("219a8a17-d51e-4ad4-a622-fb72463222af")
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.type.TypeModel) && (elt instanceof camel.type.Value)) {
            ((camel.type.TypeModel) context).getValues().add((camel.type.Value) elt);
        }
    }

}
