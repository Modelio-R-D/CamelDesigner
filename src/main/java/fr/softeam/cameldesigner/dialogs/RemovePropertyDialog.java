package fr.softeam.cameldesigner.dialogs;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.elementmodel.properties.TagsManager;
import fr.softeam.cameldesigner.i18n.I18nMessages;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

@objid ("25dafdd9-8b07-42c8-b6dd-85affa0316b1")
public class RemovePropertyDialog extends AbstractDialog {
    @objid ("29f65f14-8c89-40a9-9011-1ae5ef48adce")
    private TagsManager tagsManager = new TagsManager();

    @objid ("5dbe05d6-7934-4ab6-ad78-9820cf4ce810")
    private org.eclipse.swt.widgets.List propertiesList;

    @objid ("c9ac772f-c33f-4b48-b72d-f46711be66f1")
    public RemovePropertyDialog(ModelElement selectedElement) {
        super(selectedElement);
        this.setDialogText(I18nMessages.getString ("Dialog.Text.RemoveProperties"));
    }

    @objid ("b4f97926-96d7-49ce-a2bb-53d1eb4c5c1b")
    @Override
    protected void dialogContentRows() {
        GridData gridData = null;
        // 1st row
        //    -->left
        Label typeLabel = new Label(this.shell, SWT.NONE);
        typeLabel.setText(I18nMessages.getString ("Dialog.Label.SelectPropertiesRemove"));
        gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        gridData.horizontalSpan = 12;
        typeLabel.setLayoutData(gridData);
        //    -->right
        this.propertiesList = new org.eclipse.swt.widgets.List (this.shell, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
        for(TaggedValue taggedValue : this.selectedElement.getTag()) {
            this.propertiesList.add (taggedValue.getDefinition().getName());
        }
        
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.horizontalSpan = 12;
        
        gridData.widthHint = 120;
        gridData.heightHint = 200;
        this.propertiesList.setLayoutData(gridData);
    }

    @objid ("ee2d3fe5-5c1e-4e7e-8a21-e395064fac7b")
    @Override
    protected void okAction(SelectionEvent e) {
        removeSelectedTags();
    }

    @objid ("57c9cd56-c7a9-406d-8fe6-8124008d1abb")
    private void removeSelectedTags() {
        String[] selectedItems = this.propertiesList.getSelection();
        if (selectedItems.length == 0) {
            MessageDialog.openInformation(Display.getDefault().getActiveShell(), 
                    I18nMessages.getString ("Ui.Dialog.EmptyPropertyType.Label"), 
                    I18nMessages.getString ("Ui.Dialog.EmptyPropertyType.Message"));
        } else {
        
            IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession ();
        
        
        
            for(String selectedItem:selectedItems) {
                for(TaggedValue camelTag : this.selectedElement.getTag()) {
                    if(camelTag.getDefinition().getName().equals(selectedItem)) {
                        try( ITransaction transaction = modelingSession.createTransaction("Delete Tagged value")){
        
                            camelTag.delete();
                            transaction.commit ();
                        }
                        break;
                    }
                }
            }
        
            this.shell.close();
        }
    }

}
