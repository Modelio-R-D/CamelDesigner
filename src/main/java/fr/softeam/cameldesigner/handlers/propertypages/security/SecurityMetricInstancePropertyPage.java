package fr.softeam.cameldesigner.handlers.propertypages.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import fr.softeam.cameldesigner.handlers.propertypages.metric.MetricInstancePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("9f938ccc-d59a-4088-afe5-53b8cd545fef")
public class SecurityMetricInstancePropertyPage<T extends SecurityMetricInstance> extends MetricInstancePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("3732a48f-b8ec-452b-9e9d-f937ee9b86d4")
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
    @objid ("3b77c0f5-9378-4407-a99b-ff2cff95fb78")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("d58c4e1d-b16f-4f01-849e-f2cf4aedbae9")
    public SecurityMetricInstancePropertyPage(T elt) {
        super(elt);
    }

}
