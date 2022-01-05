package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("73b45de4-7e94-42ed-8ca7-ad02e504bd2c")
public class HostingPortPropertyPage<T extends HostingPort> extends FeaturePropertyPage<T> {
    @objid ("ca433014-368c-436c-a907-8d313bcca2f6")
    public HostingPortPropertyPage(T elt) {
        super(elt);
    }

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c9614e9b-1081-4e65-8cd2-31d27b3d9e50")
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
    @objid ("abd4fb8b-146b-4bb0-a008-d88b6350bd3f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

}
