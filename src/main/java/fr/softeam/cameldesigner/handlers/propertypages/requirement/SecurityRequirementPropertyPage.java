package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("2f2ccccc-5734-4779-b02d-abf1e0b40104")
public class SecurityRequirementPropertyPage<T extends SecurityRequirement> extends HardRequirementPropertyPage<T> {
    @objid ("a707b0f2-63bb-440f-a61c-cd8d9281c601")
    private List<ModelElement> _securityControls = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("be4bc280-2b63-4850-9902-1465b9204aa4")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            //Security Controls
            Class elt = (Class) getModelElt(SecurityControl.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityControl.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addSecurityControls((SecurityControl) obj);
                }else {
                    this._element.removeSecurityControls((SecurityControl) obj);
                }
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
    @objid ("99c5700d-8c7d-4d86-80af-f0116894e8b0")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
              // Security Controls
        table.addProperty("Security Controls", getCamelValue(this._element.getSecurityControls()), getAddRemove(SecurityControl.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getSecurityControls()));
    }

    @objid ("95dc37b1-59db-4cde-b7ba-9df1d992305e")
    public SecurityRequirementPropertyPage(T elt) {
        super(elt);
    }

}
