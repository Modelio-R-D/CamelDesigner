package fr.softeam.cameldesigner.handlers.propertypages;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.propertiesPage.AbstractModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("26527af4-89fa-42ea-bfd9-0956fbf883ac")
public class CamelPropertyPageHandler extends AbstractModulePropertyPage {
    @objid ("a329ebdb-062c-4cb3-af6c-4cf13fb9c88b")
    public CamelPropertyPageHandler(final IModule module, final String name, final String label, final String bitmap) {
        super(module, name, label, bitmap);
    }

    @objid ("a9eef6ef-813d-4336-a92e-f7ffdf6de59f")
    @Override
    public void update(final List<MObject> selectedElements, final IModulePropertyTable table) {
        if ((selectedElements != null) && (selectedElements.size() > 0)
                && (selectedElements.get(0) != null)
                && (selectedElements.get(0) instanceof ModelElement)){
        
            ModelElement selectedElement = ((ModelElement) selectedElements.get(0));
        
            IPropertyContent propertyPage = getPropertyPage(selectedElement);
        
            if (propertyPage != null) {
                propertyPage.update(table);
            }
        }
    }

    @objid ("8385209c-4e96-4410-a677-91785baadfff")
    @Override
    public void changeProperty(final List<MObject> selectedElements, final int row, final String value) {
        if ((selectedElements != null) && (selectedElements.size() > 0) && (selectedElements.get(0) instanceof ModelElement)){
            ModelElement selectedElement = ((ModelElement) selectedElements.get(0));
        
            IPropertyContent propertyPage = getPropertyPage(selectedElement);
        
            if (propertyPage != null) {
                propertyPage.changeProperty(row, value);
            }
        }
    }

    @objid ("c48bcc8b-54c2-4cec-ae04-cdde28640a1e")
    private IPropertyContent getPropertyPage(ModelElement elt) {
        Object result = CamelDesignerPropertyPageFactory.instantiatePropertyPage(elt);
        if (result instanceof IPropertyContent) {
            return (IPropertyContent) result;
        }
        return null;
    }

}
