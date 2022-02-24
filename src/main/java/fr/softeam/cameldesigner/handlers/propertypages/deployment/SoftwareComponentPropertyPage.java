package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("a870c525-8610-4fcb-b610-0c0f4a47909b")
public class SoftwareComponentPropertyPage<T extends SoftwareComponent> extends CamelComponentPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("af04634c-9f91-457b-8832-116395367b09")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(RequirementSet.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (RequirementSet.canInstantiate(elt)) {
                this._element.setRequirementSet(RequirementSet.safeInstantiate(elt));
            }
        }else if (this._currentRow == 2){
            this._element.setLongLived(Boolean.valueOf(value));
        }else if (this._currentRow == 3){
            this._element.setCoInstanceHosting(Boolean.valueOf(value));
        }
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("55e89ecb-62f0-4b87-8ed0-c592d32f5740")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Requirement Set
        table.addProperty("Requirement", getCamelName(this._element.getRequirementSet()), getCamelNames(RequirementSet.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //isLongLived
        table.addProperty("IsLongLived", this._element.isLongLived());
        
        //isCoInstanceHost
        table.addProperty("isCoInstanceHost", this._element.isCoInstanceHosting());
    }

    @objid ("ca5dd00b-e4fd-4f63-a365-df9b13956c16")
    public SoftwareComponentPropertyPage(T elt) {
        super(elt);
    }

}
