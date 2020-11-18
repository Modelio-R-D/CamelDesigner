package fr.softeam.cameldesigner.handlers.propertypage.dataproperties;

import java.util.List;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class DataPropertyPage<T extends Data> extends NamedElementPropertyPage<T> {
    private List<ModelElement> _dataSources;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        if(currentRow == 1) {
            ModelElement elt = getModelElt(this._dataSources, value);
            if (DataSource.canInstantiate(elt)) {
                this.element.setDataSource(DataSource.instantiate((org.modelio.metamodel.uml.statik.Class)elt));
            }
        }
        return currentRow - 1;
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
        table.addProperty("DataSource", getCamelName(this.element.getDataSource()));
    }

    public DataPropertyPage(T elt) {
        super(elt);
        
        this._dataSources = DataSource.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
    }

}
