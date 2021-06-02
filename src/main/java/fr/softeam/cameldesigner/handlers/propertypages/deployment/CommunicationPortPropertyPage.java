package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;

public class CommunicationPortPropertyPage<T extends CommunicationPort> extends NamedElementPropertyPage<T> {
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
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        table.addProperty("Low Port Number", getValue(this._element.getLowPortNumber()));

        table.addProperty("High Port Number", getValue(this._element.getHighPortNumber()));
    }

}
