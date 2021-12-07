package fr.softeam.cameldesigner.dialogs;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("9b4a6d20-70b3-49d9-8f8c-63ceae913c59")
public abstract class AbstractDialog extends Dialog {
    @objid ("03ae87ee-0ee0-4cf4-ba2c-5fe832fb9ff4")
    protected static final int DEFAULT_MARGIN = 20;

    @objid ("37df2b8d-543f-4b1f-8b07-f3a8ed3e0bc9")
    protected String dialogText = "Dialog Text";

    @objid ("d9f3d7da-5987-4905-bf3c-9b6221aaee3c")
    protected Button cancelButton;

    @objid ("9c257735-444a-4eba-bf21-260ac459b4f0")
    protected Button okButton;

    @objid ("bd04462f-1006-4e58-a781-a4bee3fbf2d3")
    protected ModelElement selectedElement;

    @objid ("c074bcdd-0332-4c9b-9fc3-5197dc58beb9")
    protected Shell shell;

    @objid ("c1f8f1ac-6ebf-4e9e-b80e-3cca59b5ba7d")
    protected GridLayout gridLayout;

    @objid ("3d539352-4f1e-447e-a5b0-cd01975a3358")
    private AbstractDialog(Shell parent, int style, ModelElement selectedElement) {
        super (parent, style);
        this.selectedElement = selectedElement;
    }

//    private AbstractDialog(Shell activeShell, ModelElement selectedElement) {
//        this (activeShell, SWT.NONE, selectedElement);
//    }
    @objid ("4179b410-c049-41d0-9498-1aa28ec480eb")
    public AbstractDialog(ModelElement selectedElement) {
        this (Display.getCurrent().getActiveShell(), SWT.NONE, selectedElement);
    }

    @objid ("e80d4822-4dd3-4195-8075-a2a818c22b5c")
    public void setDialogText(String dialogText) {
        this.dialogText = dialogText;
    }

    @objid ("ba7581d1-9d17-4b65-b8d1-cd579bbc5c90")
    public void setSelectedElement(ModelElement selectedElement) {
        this.selectedElement = selectedElement;
    }

    @objid ("186490bc-20a1-49f0-a24a-21c8fddf43ee")
    public void open() {
        Shell parent = getParent();
        Display display = parent.getDisplay();
        
        this.shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
        
        
        this.shell.setText(this.dialogText);
        this.shell.setLocation(parent.getBounds().x + (parent.getBounds().width/2), parent.getBounds().y + (parent.getBounds().height/2));
        // Layout with 2 columns
        this.gridLayout = new GridLayout(12, false);
        this.shell.setLayout(this.gridLayout);
        
        this.gridLayout.marginTop = DEFAULT_MARGIN/2;
        this.gridLayout.marginRight = DEFAULT_MARGIN;
        this.gridLayout.marginLeft = DEFAULT_MARGIN;
        this.gridLayout.marginBottom = DEFAULT_MARGIN/2;
        this.gridLayout.verticalSpacing = DEFAULT_MARGIN/2;
        
              
        
        dialogContentRows();
        
        
        
        // last row
        //  --> Cancel Button
        this.cancelButton = new Button(this.shell, SWT.PUSH);
        this.cancelButton.setText("Cancel");
        GridData cancelGridData = new GridData();
        //cancelGridData.horizontalAlignment = GridData.BEGINNING;
        cancelGridData.widthHint = 100;
        this.cancelButton.setLayoutData(cancelGridData);
        this.cancelButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                AbstractDialog.this.shell.close();
            }
        });
        
        //  --> OK Button
        this.okButton = new Button(this.shell, SWT.PUSH);
        this.okButton.setText("OK");
        GridData okGridData = new GridData();
        //okGridData.horizontalAlignment = GridData.END;
        okGridData.widthHint = 100;
        this.okButton.setLayoutData(okGridData);
        this.okButton.addSelectionListener(new SelectionAdapter() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                AbstractDialog.this.okAction(e);
            }
        
        });
        
        this.shell.pack();
        
        this.shell.open();
        
        while (!this.shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
    }

    @objid ("ec85c605-5b57-4b71-a7a5-a35bf3bf7386")
    protected abstract void dialogContentRows();

    @objid ("1b2b1fd6-6a45-47b1-968e-d002ca182340")
    protected abstract void okAction(SelectionEvent e);

}
