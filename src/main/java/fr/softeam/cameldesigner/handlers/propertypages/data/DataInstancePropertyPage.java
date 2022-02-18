package fr.softeam.cameldesigner.handlers.propertypages.data;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureInstancePropertyPage;

@objid ("242f61fc-7385-436b-b440-99171d6a4040")
public class DataInstancePropertyPage<T extends DataInstance> extends FeatureInstancePropertyPage<T> {
    @objid ("cf07d7d7-8270-456b-9544-34b36b0a7048")
    private List<ModelElement> _dataSourceInstances;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("99673994-965b-4c3a-b5da-aeb67e39827f")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);

        if(this._currentRow == 1) {
            ModelElement elt = getModelElt(this._dataSourceInstances, value);
            if (DataSourceInstance.canInstantiate(elt)) {
                this._element.setDataSourceInstance(DataSourceInstance.instantiate((org.modelio.metamodel.uml.statik.Instance)elt));
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
    @objid ("dc6b122b-3f55-4793-b985-98f6486b470a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //DataSource
        this._dataSourceInstances = DataSourceInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Data Source Instance", getCamelName(this._element.getDataSourceInstance()));
    }

    @objid ("5b541887-f118-45e7-a4f3-e71ee2871bd5")
    public DataInstancePropertyPage(T elt) {
        super(elt);
    }

}
