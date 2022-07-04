package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePortPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("22039053-2624-43a8-8bca-c251f4eb091e")
public class CommunicationPortPropertyPage<T extends CommunicationPort> extends FeaturePortPropertyPage<T> {
    @objid ("702eb3fa-a786-413e-a855-fd78f0e8abfb")
    public CommunicationPortPropertyPage(T elt) {
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
    @objid ("25ca6f14-f512-4763-9e6d-c00ed4994c36")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
                  
        case 1 :
            this._element.setLowPortNumber(value);
            break;
        
        case 2 :
            this._element.setHighPortNumber(value);
            break;
        }
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("67b4098d-8b11-48b2-b533-6f0e56ba3b08")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        
        table.addProperty("Low Port Number", getNotNull(this._element.getLowPortNumber()));
        
        table.addProperty("High Port Number", getNotNull(this._element.getHighPortNumber()));
    }

}
