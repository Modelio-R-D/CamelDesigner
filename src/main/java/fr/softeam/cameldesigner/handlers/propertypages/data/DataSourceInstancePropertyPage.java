package fr.softeam.cameldesigner.handlers.propertypages.data;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("97d639ca-7285-44c2-a618-19ceca33c951")
public class DataSourceInstancePropertyPage<T extends DataSourceInstance> extends FeaturePropertyPage<T> {
    @objid ("aa19c3b2-3e01-43b3-bee6-cca0de3f20c1")
    private List<ModelElement> _type = null;

    @objid ("cd36d406-65da-49cf-a7cc-304c3cc0b740")
    private List<ModelElement> _softwareComponentInstance = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c9654a32-2128-47cb-b901-8f2fc95c4105")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(this._type, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSource.STEREOTYPE_NAME)) {
                this._element.setType((DataSource) elt);
            }
        }
        
        else if(this._currentRow == 2){
            ModelElement elt = getModelElt(this._softwareComponentInstance, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentInstance.STEREOTYPE_NAME)) {
            this._element.setSoftwareComponentInstance((SoftwareComponentInstance) elt);;
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
    @objid ("69585033-0e7a-4073-8574-f6cfffdb4852")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        
        this._type = DataSource.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));
            
        this._softwareComponentInstance = SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Software Component Instance", getCamelName(this._element.getSoftwareComponentInstance()), getCamelNames(this._softwareComponentInstance));
    }

    @objid ("0a20bc09-6556-435b-a909-99ff68a38f71")
    public DataSourceInstancePropertyPage(T elt) {
        super(elt);
    }

}
