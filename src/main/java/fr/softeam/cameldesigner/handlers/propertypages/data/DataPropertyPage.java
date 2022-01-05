package fr.softeam.cameldesigner.handlers.propertypages.data;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("ec0dff1a-bd02-4100-ae13-578428ff169b")
public class DataPropertyPage<T extends Data> extends NamedElementPropertyPage<T> {
    @objid ("1b12192b-85a4-4963-aaaf-8be8c2387783")
    private List<ModelElement> _dataSources;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("bf05adbb-3357-4e1c-8053-4c012a837865")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1) {
            ModelElement elt = getModelElt(this._dataSources, value);
            if (DataSource.canInstantiate(elt)) {
                this._element.setDataSource(DataSource.instantiate((org.modelio.metamodel.uml.statik.Class)elt));
            }
        }
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("5000ef3d-b650-4801-bb84-006b5298d28d")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //DataSource
        this._dataSources = DataSource.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("DataSource", getCamelName(this._element.getDataSource()));
    }

    @objid ("c81ad50f-89b5-45b9-811c-1e0ab5145205")
    public DataPropertyPage(T elt) {
        super(elt);
    }

}
