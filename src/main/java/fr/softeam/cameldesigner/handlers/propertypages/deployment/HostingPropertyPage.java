package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("17a4e1de-d1f4-4848-9af4-dba41bd8eaef")
public class HostingPropertyPage<T extends Hosting> extends ComponentRelationPropertyPage<T> {
    @objid ("b517dc1c-e783-44cc-a227-61268a30d35f")
    private List<ModelElement> _providedHost = null;

    @objid ("746d0cbc-480f-4836-a5cc-200be93b27f0")
    private List<ModelElement> _requiredHosts = null;

    @objid ("f860808f-446e-4ee1-8115-821e31bd728a")
    private List<ModelElement> _providedHostConfiguration = null;

    @objid ("1acbce05-2d73-4fd0-9422-b7ad3613253c")
    public HostingPropertyPage(T elt) {
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
    @objid ("f92fdfdd-9743-4e0f-ab26-250614e5cec2")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._providedHost, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME)) {
                this._element.setProvidedHost((HostingPort) elt);
            }
        }
        
        
        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._requiredHosts, value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Configuration.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addRequiredHostsConfiguration((Configuration) mmsObj);
                }else {
                    this._element.removeRequiredHostsConfiguration((Configuration) mmsObj);
                }
            }
        }
        
        else if(this._currentRow == 3){
            ModelElement elt = getModelElt(this._providedHostConfiguration, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Configuration.STEREOTYPE_NAME)) {
            this._element.setProvidedHostConfiguration((Configuration) elt);;
            }
        }
        
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("f9223ba4-cdc6-4104-826d-dab1344ab5e3")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
              //Provided Host
              this._providedHost = null;
              table.addProperty("Provided Host", getCamelName(this._element.getProvidedHost()), getCamelNames(this._providedHost));
        
              //Required Hosts
              table.addProperty("Required Hosts", getCamelValue(this._element.getRequiredHostsConfiguration()), getAddRemove(Configuration.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getRequiredHostsConfiguration()));
        
              // Provided Host Configuration
              this._providedHostConfiguration = Configuration.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
              table.addProperty("Subject", getCamelName(this._element.getProvidedHostConfiguration()), getCamelNames(this._providedHostConfiguration));
    }

}
