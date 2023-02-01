package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;

@objid ("ae234d54-dfee-4e08-a5fe-b50eaa0bd6b9")
public class ObjectContextPropertyPage<T extends ObjectContext> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c2114321-ee18-4a36-81a5-85c503c5ca4c")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Component elt = (Component) getModelElt(CamelDesignerAbstractProxy.getComponents(), value);
            if (CamelComponent.canInstantiate(elt)) {
                this._element.setComponent(CamelComponent.instantiate(elt));
            }
        }
        
        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(Unit.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (Data.canInstantiate(elt)) {
                this._element.setData(Data.instantiate(elt));
            }
        }
        
        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(Communication.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (Communication.canInstantiate(elt)) {
                this._element.setCommunication((Communication) Communication.instantiate(elt));
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
    @objid ("33fbb258-51d6-4d91-ae4e-63f562701278")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Component
        table.addProperty("Component", getCamelName(this._element.getComponent()), getCamelNames(CamelDesignerAbstractProxy.getComponents()));
        
        //Data
        table.addProperty("Data", getCamelName(this._element.getData()), getCamelNames(Unit.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
          
              //Communication
        table.addProperty("Communication", getCamelName(this._element.getCommunication()), getCamelNames(Communication.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
    }

    @objid ("8baca0a0-9abe-42df-8ad3-f7d3de528a78")
    public ObjectContextPropertyPage(T elt) {
        super(elt);
    }

}
