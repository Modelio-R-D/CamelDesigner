package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("010468e2-a9c2-499e-88fa-7d3eaf241e4c")
public class DataMeasurementPropertyPage<T extends DataMeasurement> extends MeasurementPropertyPage<T> {
    @objid ("fb6940f4-ea13-40fb-a67c-91f6f09dd0ef")
    private List<ModelElement> _data = null;

    @objid ("196c5b46-63c2-4d78-8a4a-05aeef575b52")
    private List<ModelElement> _dataInstance = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("f788f9cc-9893-47f6-be16-1da3a05bf4c2")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Instance elt = (Instance) getModelElt(this._dataInstance, value);
            if (DataInstance.canInstantiate(elt)) {
                this._element.setDataInstance(DataInstance.safeInstantiate(elt));
            }
        }
        
        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._data, value);
            if (Data.canInstantiate(elt)) {
                this._element.setData(Data.safeInstantiate(elt));
            }
        }
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("5462f409-46cc-4dfa-b7cf-7e3c73fc841d")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Data Instance
        this._dataInstance = DataInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Data Instance", getCamelName(this._element.getDataInstance()), getCamelNames(this._dataInstance));
        
        //Data
        this._data = Data.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Data ", getCamelName(this._element.getData()), getCamelNames(this._data));
    }

    @objid ("82f8baaa-a319-43d1-80cb-2fa1550d5ceb")
    public DataMeasurementPropertyPage(T elt) {
        super(elt);
    }

}
