package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("1682ccca-cd54-4c5e-bf7b-6a961e283936")
public class HostingInstancePropertyPage<T extends HostingInstance> extends ComponentRelationInstancePropertyPage<T> {
    @objid ("8cb5c8f6-1759-45e6-9967-d13f67f04d0d")
    private List<ModelElement> _type = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("b7bc687e-bd0c-4331-bfd7-da3aa649bc66")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._type, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,Hosting.STEREOTYPE_NAME)) {
                this._element.setType((Hosting) elt);
            }
        }
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("4f89f765-a4ba-4604-a070-99ac084ea6e1")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
              //Type
        this._type = Hosting.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));
    }

    @objid ("83f16965-ebee-4be0-93cd-b63ab5248980")
    public HostingInstancePropertyPage(T elt) {
        super(elt);
    }

}
