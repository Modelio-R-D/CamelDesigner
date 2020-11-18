package fr.softeam.cameldesigner.dialogs;

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

public class RemovePropertyDialog extends AbstractDialog {
    private TagsManager tagsManager = new TagsManager();

    private org.eclipse.swt.widgets.List propertiesList;

    public RemovePropertyDialog(ModelElement selectedElement) {
        super(selectedElement);
        this.setDialogText(I18nMessages.getString ("Dialog.Text.RemoveProperties"));
    }

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

    @Override
    protected void okAction(SelectionEvent e) {
        removeSelectedTags();
    }

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
