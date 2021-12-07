package fr.softeam.cameldesigner.dialogs;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.elementmodel.properties.TagsManager;
import fr.softeam.cameldesigner.i18n.I18nMessages;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;

@objid ("87aebcc6-6f36-4470-a0db-897b3aaa6673")
public class AddPropertyDialog extends AbstractDialog {
    @objid ("64de02ad-da7c-49ba-bfac-941e0c35e9a5")
    private TagsManager tagsManager = new TagsManager();

//private Text propertyTypeText;
    @objid ("cf25e461-51d3-434d-a4dd-d5470e3b3c5b")
    private Combo propertyTypeCombo;

    @objid ("8d00e873-d6b6-41b0-9fe2-d8424c6a957c")
    private Text propertyValueText;

    @objid ("37628e82-1166-47af-9b53-54ceab51359e")
    public AddPropertyDialog(ModelElement selectedElement) {
        super(selectedElement);
        this.setDialogText(I18nMessages.getString ("Dialog.Text.AddProperty"));
    }

    @objid ("2a8fda68-1e37-4863-b8ce-03da2579f035")
    @Override
    protected void dialogContentRows() {
        GridData gridData = null;
        // 1st row
        //    -->left
        Label typeLabel = new Label(this.shell, SWT.NONE);
        typeLabel.setText(I18nMessages.getString ("Dialog.Label.PropertyType"));
        gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        gridData.horizontalSpan = 4;
        typeLabel.setLayoutData(gridData);
        //    -->right
        
        
        this.propertyTypeCombo = new Combo (this.shell, SWT.READ_ONLY );
        String[] items = getElementPropertyTypes();
        if(items != null) {
            this.propertyTypeCombo.setItems(getElementPropertyTypes()); 
        }
        
        //this.propertyTypeText = new Text(this.shell, SWT.SINGLE | SWT.BORDER);
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        //gridData.widthHint = 400;
        gridData.horizontalSpan = 8;
        this.propertyTypeCombo.setLayoutData(gridData);
        
        // 2nd row
        //    -->left
        Label valueLabel = new Label(this.shell, SWT.NONE);
        valueLabel.setText(I18nMessages.getString ("Dialog.Label.PropertyValue"));
        gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        gridData.horizontalSpan = 4;
        valueLabel.setLayoutData(gridData);
        //    -->right
        this.propertyValueText = new Text(this.shell, SWT.SINGLE | SWT.BORDER);
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.widthHint = 400;
        gridData.horizontalSpan = 8;
        this.propertyValueText.setLayoutData(gridData);
    }

    /**
     * @return array with properties name or null if there is no property names
     */
    @objid ("c141a4f8-0f7d-4c15-9520-a33a31dadb1c")
    private String[] getElementPropertyTypes() {
        List<String> propertiesNames = getAvailablePropertyNames();
        
        // add propertiesNames to array
        int propertiesNamesSize = propertiesNames.size();
        if(propertiesNamesSize > 0) {
            String[] propertiesNamesArray = new String[propertiesNamesSize];
            int i = propertiesNamesSize - 1; 
            for (String propertiesName : propertiesNames) { 
                propertiesNamesArray[i--] = propertiesName; 
            } 
            return propertiesNamesArray;
        } else {
            return null;
        }
    }

    /**
     * @return list of properties available to the selected elements that have not been yet initialized
     */
    @objid ("29947c00-51be-476a-bf3e-0c521db4ee71")
    private List<String> getAvailablePropertyNames() {
        List<String> propertiesNames = new ArrayList<>();
        List<Stereotype> selectedElementStereotypes = this.selectedElement.getExtension();
        for(Stereotype currentStereotype : selectedElementStereotypes) {
            do{
                List<TagType> tagTypes = currentStereotype.getDefinedTagType();
                for(TagType tagType:tagTypes) {
                    // verif if tag already added to element
                    if(this.selectedElement.getTagValue(tagType) == null) {
                        propertiesNames.add(tagType.getName());
                    }
                }
                currentStereotype = currentStereotype.getParent();
            } while (currentStereotype != null);
        }
        return propertiesNames;
    }

    @objid ("aeb01ecf-e1db-451d-b4b0-60bc83e8d656")
    @Override
    protected void okAction(SelectionEvent e) {
        if (AddPropertyDialog.this.propertyTypeCombo.getText().isEmpty()) {
            MessageDialog.openInformation(Display.getDefault().getActiveShell(), 
                    I18nMessages.getString ("Ui.Dialog.EmptyPropertyType.Label"), 
                    I18nMessages.getString ("Ui.Dialog.EmptyPropertyType.Message"));
        
        } else if (AddPropertyDialog.this.propertyValueText.getText().isEmpty()) {
            MessageDialog.openInformation(Display.getDefault().getActiveShell(), 
                    I18nMessages.getString ("Ui.Dialog.EmptyPropertyValue.Label"), 
                    I18nMessages.getString ("Ui.Dialog.EmptyPropertyValue.Message"));
        } else  {
            addNewTag();
            this.shell.close();
        }
    }

    @objid ("4cbf441c-1daf-4957-abaa-d4c1db9158a7")
    private void addNewTag() {
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        
        try( ITransaction transaction = modelingSession.createTransaction ("Create new tagged value")){
        
            this.tagsManager.createTag(this.selectedElement, this.propertyTypeCombo.getText(), this.propertyValueText.getText());
        
            transaction.commit();
        }
    }

}
