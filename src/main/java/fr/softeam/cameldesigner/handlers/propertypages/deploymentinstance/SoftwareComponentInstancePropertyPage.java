package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("3346396c-c0da-4923-836e-21d358d41682")
public class SoftwareComponentInstancePropertyPage<T extends SoftwareComponentInstance> extends ComponentInstancePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("816c561b-8723-4600-aa3f-369f5f06b2aa")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1) {
            Class elt = (Class) getModelElt(DataInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addConsumesDataInstances((DataInstance) mmsObj);
                }else {
                    this._element.removeConsumesDataInstances((DataInstance) mmsObj);
                }
            }
        }
        else if(this._currentRow == 2) {
            Class elt = (Class) getModelElt(DataInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addGeneratesDataInstance((DataInstance) mmsObj);
                }else {
                    this._element.removeGeneratesDataInstance((DataInstance) mmsObj);
                }
            }
        }
        else if(this._currentRow == 3) {
            Class elt = (Class) getModelElt(DataSourceInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSourceInstance.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addManagesDataSourceInstance((DataSourceInstance) mmsObj);
                }else {
                    this._element.removeManagesDataSourceInstance((DataSourceInstance) mmsObj);
                }
            }
        }
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("6712bfd6-2911-4d7e-86f2-dd81d04fd600")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Consumes Data Instance", getCamelValue(this._element.getConsumesDataInstances()), getAddRemove(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getConsumesDataInstances()));
        table.addProperty("Generates Data Instance", getCamelValue(this._element.getGeneratesDataInstance()), getAddRemove(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getGeneratesDataInstance()));
        table.addProperty("Manages DataSource Instance", getCamelValue(this._element.getManagesDataSourceInstance()), getAddRemove(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getManagesDataSourceInstance()));
    }

    @objid ("2b1fcaeb-d54b-4bf5-b6dd-1e62e939970d")
    public SoftwareComponentInstancePropertyPage(T elt) {
        super(elt);
    }

}
