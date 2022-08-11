package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import java.util.Arrays;
import java.util.List;
import camel.core.LayerType;
import camel.scalability.StatusType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.SingleEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("a29d050c-69d4-4489-92ef-28a3fe2e87a6")
public class EventInstancePropertyPage<T extends EventInstance> extends FeaturePropertyPage<T> {
    @objid ("7ef40925-6a21-40f4-ae4f-ee46c2775b62")
    private List<ModelElement> _type = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a872d78c-b20d-42ca-9fab-b30bc46fd753")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
           this._element.setStatus(value);
           }
        
        
        else if(this._currentRow == 2){
            this._element.setLayer(value);
        }
        
        else if(this._currentRow == 3){
            ModelElement elt = getModelElt(this._type, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SingleEvent.STEREOTYPE_NAME)) {
            this._element.setType((Event) elt);;
            }
        }
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("40c236ea-09cc-41aa-9c49-9de9de639fa9")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //status type
        String[] values = Arrays.stream(StatusType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Status Type", this._element.getStatus(), values);
        
        //Layer Type
        values = Arrays.stream(LayerType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Layer Type", this._element.getLayer(), values);
        
        //Type
        this._type = SingleEvent.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));
    }

    @objid ("425dfb31-4f6d-4444-a316-6b63bf89a3a4")
    public EventInstancePropertyPage(T elt) {
        super(elt);
    }

}
