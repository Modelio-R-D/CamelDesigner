package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("6d55ece7-b9c8-47ab-9f9b-c767bc8cc891")
public class MetricInstanceModelPropertyPage<T extends MetricInstanceModel> extends MetricModelPropertyPage<T> {
    @objid ("e91b3094-108e-4397-8d4b-c8dba78ede44")
    private List<ModelElement> _type = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c808eff3-94b1-4b26-87a7-07404c0b8ca4")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._type, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME)) {
                this._element.setType((MetricTypeModel) elt);
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
    @objid ("c8b7ddb2-aeb6-4a67-b516-6a28f3401f0d")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        this._type = MetricTypeModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));
    }

    @objid ("90c1bbf6-9deb-4fb5-b0dd-cdc695ca3068")
    public MetricInstanceModelPropertyPage(T elt) {
        super(elt);
    }

}
