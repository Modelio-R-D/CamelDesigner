package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePortPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("71f101cc-ef02-462d-a577-9abd6baedd3d")
public abstract class CommunicationPortInstancePropertyPage<T extends CommunicationPortInstance> extends FeaturePortPropertyPage<T> {
    @objid ("9ea1bab6-502f-493b-86e8-b8c7eba926a9")
    private List<ModelElement> _type = null;

    @objid ("c51ede4b-d19d-48d5-9144-f9fa0ae4721f")
    public CommunicationPortInstancePropertyPage(T elt) {
        super(elt);
    }

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("19bf788c-2bb0-4b5e-a409-cb39bb2dfc27")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        ModelElement elt = getModelElt(this._type, value);
        if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPort.STEREOTYPE_NAME)) {
            this._element.setType((CommunicationPort) elt);
        }
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("f8cd32b1-805e-4319-9ea1-8223fd06667e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
              //Type
        this._type = CommunicationPort.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));
    }

}
