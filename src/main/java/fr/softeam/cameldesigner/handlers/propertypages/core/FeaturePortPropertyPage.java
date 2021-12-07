package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("da2e5570-64b4-4d51-b86f-48420cda20ec")
public class FeaturePortPropertyPage<T extends FeaturePort> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c88b4e31-646c-4a70-ac48-e17afadf3f4b")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("78d66ae4-26d9-4ecb-9f1d-ad021762b8ca")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("c7197f25-1d81-4c38-80fc-288f8bd15cd6")
    public FeaturePortPropertyPage(T elt) {
        super(elt);
    }

}
