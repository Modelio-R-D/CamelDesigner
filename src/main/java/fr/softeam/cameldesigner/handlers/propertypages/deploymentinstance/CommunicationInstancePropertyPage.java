package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("5f64aecf-dd0b-45c6-8fcd-4cc37e93597f")
public class CommunicationInstancePropertyPage<T extends CommunicationInstance> extends ComponentRelationInstancePropertyPage<T> {
    @objid ("5a867ac7-4016-4251-b61c-b6cfe5fbbcb5")
    private List<ModelElement> _type = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("33aa7a30-0d1b-4db1-9e44-3be30c63b098")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._type, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Communication.STEREOTYPE_NAME)) {
                this._element.setType((Communication) elt);
            }
        }
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("5bff7cff-9588-4c6b-840e-cbdf9483fd4b")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
              //Type
        this._type = Communication.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));
    }

    @objid ("1757cc38-be8f-410c-b468-db1479ed5b6e")
    public CommunicationInstancePropertyPage(T elt) {
        super(elt);
    }

}
