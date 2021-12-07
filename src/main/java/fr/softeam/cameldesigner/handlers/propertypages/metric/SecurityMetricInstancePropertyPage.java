package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("f0a54b54-5b3b-4e12-a776-035212a1b5b8")
public class SecurityMetricInstancePropertyPage<T extends SecurityMetricInstance> extends MetricInstancePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("5f1a02be-c712-4e4f-b4a7-7329e61af5c2")
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
    @objid ("fdc7a7ba-0f70-417d-bf6e-538f43cd328c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("8d00df11-c378-4e25-a11a-e5e433694270")
    public SecurityMetricInstancePropertyPage(T elt) {
        super(elt);
    }

}
