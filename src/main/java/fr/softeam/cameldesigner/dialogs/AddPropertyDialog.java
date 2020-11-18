package fr.softeam.cameldesigner.dialogs;

import java.util.ArrayList;
import java.util.List;
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

public class AddPropertyDialog extends AbstractDialog {
    private TagsManager tagsManager = new TagsManager();

//private Text propertyTypeText;
    private Combo propertyTypeCombo;

    private Text propertyValueText;

    public AddPropertyDialog(ModelElement selectedElement) {
        super(selectedElement);
        this.setDialogText(I18nMessages.getString ("Dialog.Text.AddProperty"));
    }

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

    private void addNewTag() {
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        
        try( ITransaction transaction = modelingSession.createTransaction ("Create new tagged value")){
        
            this.tagsManager.createTag(this.selectedElement, this.propertyTypeCombo.getText(), this.propertyValueText.getText());
        
            transaction.commit();
        }
    }

}
