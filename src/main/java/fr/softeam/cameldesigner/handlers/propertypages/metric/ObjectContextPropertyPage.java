package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class ObjectContextPropertyPage<T extends ObjectContext> extends FeaturePropertyPage<T> {

    private List<ModelElement> _component = null;

    private List<ModelElement> _data = null;

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
            Component elt = (Component) getModelElt(this._component, value);
            if (CamelComponent.canInstantiate(elt)) {
                this._element.setComponent(CamelComponent.instantiate(elt));
            }
        }

        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._data, value);
            if (Data.canInstantiate(elt)) {
                this._element.setData(Data.instantiate(elt));
            }
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

        //Component
        this._component = CamelDesignerAbstractProxy.getComponents();
        table.addProperty("Component", getCamelName(this._element.getComponent()), getCamelNames(this._component));

        //Data
        this._data = Unit.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Data", getCamelName(this._element.getData()), getCamelNames(this._data));
    }

    public ObjectContextPropertyPage(T elt) {
        super(elt);
    }

}
