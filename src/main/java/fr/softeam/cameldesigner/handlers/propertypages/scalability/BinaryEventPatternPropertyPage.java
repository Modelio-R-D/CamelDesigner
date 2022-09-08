package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import java.util.Arrays;
import java.util.List;
import camel.scalability.BinaryPatternOperatorType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("995883d0-c1ed-4c9b-b529-bd2772bec0d2")
public class BinaryEventPatternPropertyPage<T extends BinaryEventPattern> extends FeaturePropertyPage<T> {
    @objid ("7d7cc7ad-bae6-4c7d-afb5-9b4275fc431a")
    private List<ModelElement> _leftEvent = null;

    @objid ("47a66b9c-9a80-4edd-ad54-c606120cfc19")
    private List<ModelElement> _rightEvent = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c7c25fd6-fe74-452a-8581-4c7ec98e0aef")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            ModelElement elt = getModelElt(this._leftEvent, value);
            if (Event.canInstantiate(elt)) {
                this._element.setLeftEvent((Event) elt);
            }
            break;
        
        case 2 :
            elt = getModelElt(this._rightEvent, value);
            if (Event.canInstantiate(elt)) {
                this._element.setRightEvent((Event) elt);
            }
            break;
        
        case 3 :
            this._element.setLowerOccurrenceBound(value);
            break;
        
        case 4:
            this._element.setUpperOccurrenceBound(value);
            break;
        
        case 5 :
            this._element.setOperator(value);;
            break;
        }
        this._currentRow -= 5;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("dc50bc3e-4d5e-419c-97ea-2a77caf89863")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Left Event
        this._leftEvent = Event.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Left Event", getCamelName(this._element.getLeftEvent()), getCamelNames(this._leftEvent));
        
        // Right Event
        this._rightEvent = Event.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Right Event", getCamelName(this._element.getRightEvent()), getCamelNames(this._rightEvent));
        
        table.addProperty("Lower Occurrence Bound",getNotNull(this._element.getLowerOccurrenceBound()));
        table.addProperty("Upper Occurence Bound",getNotNull(this._element.getUpperOccurrenceBound()));
        
        String[] values = Arrays.stream(BinaryPatternOperatorType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Operator", getNotNull(this._element.getOperator()), values);
    }

    @objid ("f2c35708-5543-49fa-9960-65e30459d059")
    public BinaryEventPatternPropertyPage(T elt) {
        super(elt);
    }

}
