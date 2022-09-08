package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.Arrays;
import camel.deployment.LocationCouplingType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("fc07e1d9-c99c-4c2d-a2a3-1fbc1d256c03")
public class LocationCouplingPropertyPage<T extends LocationCoupling> extends ComponentRelationPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4b9d21ff-8fd1-465d-b291-1020b963d484")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1) {
            Class elt = (Class) getModelElt(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME))) {
                Object sofObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addSoftwareComponents((SoftwareComponent) sofObj);
                }else {
                    this._element.removeSoftwareComponents((SoftwareComponent) sofObj);
                }
            }
        }
        
        else  if(this._currentRow == 2) {
            this._element.setCouplingType(value);
        }
        
        else  if(this._currentRow == 3) {
            this._element.setRelaxed(Boolean.valueOf(value));
        
        }
        
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("da4ab41a-1306-432f-8e6c-447e82c7f7b4")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Software Component
        table.addProperty("Software Components", getCamelValue(this._element.getSoftwareComponents()), getAddRemove(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getSoftwareComponents()));
        
        //Coupling type
        String[] values = Arrays.stream(LocationCouplingType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Coupling Type", getNotNull(this._element.getCouplingType()), values);
        
        //relaxed
        table.addProperty("Relaxed", getNotNull(String.valueOf(this._element.isRelaxed())));
    }

    @objid ("64bb2fd0-7519-4e63-a366-38b21422385c")
    public LocationCouplingPropertyPage(T elt) {
        super(elt);
    }

}
