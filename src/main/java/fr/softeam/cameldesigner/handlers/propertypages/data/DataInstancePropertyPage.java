package fr.softeam.cameldesigner.handlers.propertypages.data;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;

import org.modelio.metamodel.uml.statik.Package;

public class DataInstancePropertyPage<T extends DataInstance> extends NamedElementPropertyPage<T> {

    private List<ModelElement> _dataSourceInstances;
    private List<ModelElement> _type = null;


    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);

        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._dataSourceInstances, value);
            if (DataSourceInstance.canInstantiate(elt)) {
                this._element.setDataSourceInstance(DataSourceInstance.instantiate((org.modelio.metamodel.uml.statik.Instance)elt));
            }

        } 
        else if(this._currentRow == 2){
        	 ModelElement elt = getModelElt(this._type, value);
             if (DataTypeModel.canInstantiate(elt)) {
                 this._element.setType(DataTypeModel.safeInstantiate((Package)elt));
             }
        	this._element.getType().setName(value);   

        }          
       
       this._currentRow -= 2;

        
        
        
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     *
     * @param table : the property table to fulfill
     */
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //DataSource
        this._dataSourceInstances = DataSourceInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Data Source Instance", getCamelName(this._element.getDataSourceInstance()));
        
        //Type
        this._type = DataTypeModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));

        
        
    }

    public DataInstancePropertyPage(T elt) {
        super(elt);

    }

}
